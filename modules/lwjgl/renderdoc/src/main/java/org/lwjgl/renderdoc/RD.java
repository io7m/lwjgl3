/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */

package org.lwjgl.renderdoc;

import org.jspecify.annotations.*;
import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.JNI.*;

final class RD {

    private static @Nullable RDCapabilities caps;

    private RD() {

    }

    /**
     * @see "https://renderdoc.org/docs/in_application_api.html"
     */

    static void create() throws RenderDocNotPresentException {
        SharedLibrary library;
        try {
            library = Library.loadNative(RD.class, "org.lwjgl.renderdoc", "renderdoc");
        } catch (UnsatisfiedLinkError e) {
            throw new RenderDocNotPresentException(e);
        }

        long functionAddress = library.getFunctionAddress("RENDERDOC_GetAPI");
        if (functionAddress == 0L) {
            throw new RenderDocNotPresentException("The RENDERDOC_GetAPI function is missing. This API cannot be used if RenderDoc is not debugging your application.");
        }

        try (MemoryStack stack = MemoryStack.stackPush()) {
            PointerBuffer buffer        = stack.callocPointer(1);
            long          bufferAddress = buffer.address0();
            int           r             = invokePI(RenderDoc.eRENDERDOC_API_Version_1_6_0, bufferAddress, functionAddress);
            if (r != 1) {
                throw new RenderDocNotPresentException("The RENDERDOC_GetAPI function returned " + r);
            }
            RENDERDOC_API_1_6_0 api = RENDERDOC_API_1_6_0.create(buffer.get(0));
            caps = new RDCapabilities(functionAddress, api);
        }
    }

    static RDCapabilities getCapabilities() {
        return check(caps);
    }

    static <T> T check(@Nullable T t) {
        if (t == null) {
            throw new IllegalStateException("The RenderDoc library has not been loaded.");
        }
        return t;
    }
}
