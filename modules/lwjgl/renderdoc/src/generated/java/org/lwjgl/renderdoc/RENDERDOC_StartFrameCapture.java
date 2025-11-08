/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.renderdoc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke pRENDERDOC_StartFrameCapture} */
public abstract class RENDERDOC_StartFrameCapture extends Callback implements RENDERDOC_StartFrameCaptureI {

    /**
     * Creates a {@code RENDERDOC_StartFrameCapture} instance from the specified function pointer.
     *
     * @return the new {@code RENDERDOC_StartFrameCapture}
     */
    public static RENDERDOC_StartFrameCapture create(long functionPointer) {
        RENDERDOC_StartFrameCaptureI instance = Callback.get(functionPointer);
        return instance instanceof RENDERDOC_StartFrameCapture
            ? (RENDERDOC_StartFrameCapture)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable RENDERDOC_StartFrameCapture createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code RENDERDOC_StartFrameCapture} instance that delegates to the specified {@code RENDERDOC_StartFrameCaptureI} instance. */
    public static RENDERDOC_StartFrameCapture create(RENDERDOC_StartFrameCaptureI instance) {
        return instance instanceof RENDERDOC_StartFrameCapture
            ? (RENDERDOC_StartFrameCapture)instance
            : new Container(instance.address(), instance);
    }

    protected RENDERDOC_StartFrameCapture() {
        super(CIF);
    }

    RENDERDOC_StartFrameCapture(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends RENDERDOC_StartFrameCapture {

        private final RENDERDOC_StartFrameCaptureI delegate;

        Container(long functionPointer, RENDERDOC_StartFrameCaptureI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long device, long wndHandle) {
            delegate.invoke(device, wndHandle);
        }

    }

}