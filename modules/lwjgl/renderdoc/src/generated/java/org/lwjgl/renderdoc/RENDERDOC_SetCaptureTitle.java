/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.renderdoc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke pRENDERDOC_SetCaptureTitle} */
public abstract class RENDERDOC_SetCaptureTitle extends Callback implements RENDERDOC_SetCaptureTitleI {

    /**
     * Creates a {@code RENDERDOC_SetCaptureTitle} instance from the specified function pointer.
     *
     * @return the new {@code RENDERDOC_SetCaptureTitle}
     */
    public static RENDERDOC_SetCaptureTitle create(long functionPointer) {
        RENDERDOC_SetCaptureTitleI instance = Callback.get(functionPointer);
        return instance instanceof RENDERDOC_SetCaptureTitle
            ? (RENDERDOC_SetCaptureTitle)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable RENDERDOC_SetCaptureTitle createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code RENDERDOC_SetCaptureTitle} instance that delegates to the specified {@code RENDERDOC_SetCaptureTitleI} instance. */
    public static RENDERDOC_SetCaptureTitle create(RENDERDOC_SetCaptureTitleI instance) {
        return instance instanceof RENDERDOC_SetCaptureTitle
            ? (RENDERDOC_SetCaptureTitle)instance
            : new Container(instance.address(), instance);
    }

    protected RENDERDOC_SetCaptureTitle() {
        super(CIF);
    }

    RENDERDOC_SetCaptureTitle(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends RENDERDOC_SetCaptureTitle {

        private final RENDERDOC_SetCaptureTitleI delegate;

        Container(long functionPointer, RENDERDOC_SetCaptureTitleI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long title) {
            return delegate.invoke(title);
        }

    }

}