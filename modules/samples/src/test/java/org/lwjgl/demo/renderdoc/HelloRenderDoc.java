/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */

package org.lwjgl.demo.renderdoc;

import org.lwjgl.renderdoc.*;
import org.lwjgl.system.*;

import java.nio.*;

public class HelloRenderDoc {
    private HelloRenderDoc() { }

    public static void main(String[] args) {
        try {
            RenderDoc.create();
        } catch (RenderDocNotPresentException e) {
            System.err.println("Could not initialize RenderDoc library. Is RenderDoc running?");
            e.printStackTrace(System.err);
            return;
        }

        try (MemoryStack stack = MemoryStack.stackPush()) {
            IntBuffer major = stack.mallocInt(1);
            IntBuffer minor = stack.mallocInt(1);
            IntBuffer patch = stack.mallocInt(1);
            RenderDoc.GetAPIVersion(major, minor, patch);
            System.err.printf("API Version: %d.%d.%d%n", major.get(0), minor.get(0), patch.get(0));
        }
    }
}
