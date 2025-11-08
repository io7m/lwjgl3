/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.renderdoc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke pRENDERDOC_GetCaptureFilePathTemplate} */
public abstract class RENDERDOC_GetCaptureFilePathTemplate extends Callback implements RENDERDOC_GetCaptureFilePathTemplateI {

    /**
     * Creates a {@code RENDERDOC_GetCaptureFilePathTemplate} instance from the specified function pointer.
     *
     * @return the new {@code RENDERDOC_GetCaptureFilePathTemplate}
     */
    public static RENDERDOC_GetCaptureFilePathTemplate create(long functionPointer) {
        RENDERDOC_GetCaptureFilePathTemplateI instance = Callback.get(functionPointer);
        return instance instanceof RENDERDOC_GetCaptureFilePathTemplate
            ? (RENDERDOC_GetCaptureFilePathTemplate)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable RENDERDOC_GetCaptureFilePathTemplate createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code RENDERDOC_GetCaptureFilePathTemplate} instance that delegates to the specified {@code RENDERDOC_GetCaptureFilePathTemplateI} instance. */
    public static RENDERDOC_GetCaptureFilePathTemplate create(RENDERDOC_GetCaptureFilePathTemplateI instance) {
        return instance instanceof RENDERDOC_GetCaptureFilePathTemplate
            ? (RENDERDOC_GetCaptureFilePathTemplate)instance
            : new Container(instance.address(), instance);
    }

    protected RENDERDOC_GetCaptureFilePathTemplate() {
        super(CIF);
    }

    RENDERDOC_GetCaptureFilePathTemplate(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends RENDERDOC_GetCaptureFilePathTemplate {

        private final RENDERDOC_GetCaptureFilePathTemplateI delegate;

        Container(long functionPointer, RENDERDOC_GetCaptureFilePathTemplateI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long XXX) {
            return delegate.invoke(XXX);
        }

    }

}