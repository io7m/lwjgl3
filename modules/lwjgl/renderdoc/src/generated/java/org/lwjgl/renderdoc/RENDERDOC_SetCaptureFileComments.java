/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.renderdoc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke pRENDERDOC_SetCaptureFileComments} */
public abstract class RENDERDOC_SetCaptureFileComments extends Callback implements RENDERDOC_SetCaptureFileCommentsI {

    /**
     * Creates a {@code RENDERDOC_SetCaptureFileComments} instance from the specified function pointer.
     *
     * @return the new {@code RENDERDOC_SetCaptureFileComments}
     */
    public static RENDERDOC_SetCaptureFileComments create(long functionPointer) {
        RENDERDOC_SetCaptureFileCommentsI instance = Callback.get(functionPointer);
        return instance instanceof RENDERDOC_SetCaptureFileComments
            ? (RENDERDOC_SetCaptureFileComments)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable RENDERDOC_SetCaptureFileComments createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code RENDERDOC_SetCaptureFileComments} instance that delegates to the specified {@code RENDERDOC_SetCaptureFileCommentsI} instance. */
    public static RENDERDOC_SetCaptureFileComments create(RENDERDOC_SetCaptureFileCommentsI instance) {
        return instance instanceof RENDERDOC_SetCaptureFileComments
            ? (RENDERDOC_SetCaptureFileComments)instance
            : new Container(instance.address(), instance);
    }

    protected RENDERDOC_SetCaptureFileComments() {
        super(CIF);
    }

    RENDERDOC_SetCaptureFileComments(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends RENDERDOC_SetCaptureFileComments {

        private final RENDERDOC_SetCaptureFileCommentsI delegate;

        Container(long functionPointer, RENDERDOC_SetCaptureFileCommentsI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long filePath, long comments) {
            delegate.invoke(filePath, comments);
        }

    }

}