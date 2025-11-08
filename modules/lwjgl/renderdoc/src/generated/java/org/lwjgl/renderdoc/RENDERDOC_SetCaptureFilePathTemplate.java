/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.renderdoc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke pRENDERDOC_SetCaptureFilePathTemplate} */
public abstract class RENDERDOC_SetCaptureFilePathTemplate extends Callback implements RENDERDOC_SetCaptureFilePathTemplateI {

    /**
     * Creates a {@code RENDERDOC_SetCaptureFilePathTemplate} instance from the specified function pointer.
     *
     * @return the new {@code RENDERDOC_SetCaptureFilePathTemplate}
     */
    public static RENDERDOC_SetCaptureFilePathTemplate create(long functionPointer) {
        RENDERDOC_SetCaptureFilePathTemplateI instance = Callback.get(functionPointer);
        return instance instanceof RENDERDOC_SetCaptureFilePathTemplate
            ? (RENDERDOC_SetCaptureFilePathTemplate)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable RENDERDOC_SetCaptureFilePathTemplate createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code RENDERDOC_SetCaptureFilePathTemplate} instance that delegates to the specified {@code RENDERDOC_SetCaptureFilePathTemplateI} instance. */
    public static RENDERDOC_SetCaptureFilePathTemplate create(RENDERDOC_SetCaptureFilePathTemplateI instance) {
        return instance instanceof RENDERDOC_SetCaptureFilePathTemplate
            ? (RENDERDOC_SetCaptureFilePathTemplate)instance
            : new Container(instance.address(), instance);
    }

    protected RENDERDOC_SetCaptureFilePathTemplate() {
        super(CIF);
    }

    RENDERDOC_SetCaptureFilePathTemplate(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends RENDERDOC_SetCaptureFilePathTemplate {

        private final RENDERDOC_SetCaptureFilePathTemplateI delegate;

        Container(long functionPointer, RENDERDOC_SetCaptureFilePathTemplateI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long path) {
            delegate.invoke(path);
        }

    }

}