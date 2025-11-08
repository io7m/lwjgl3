/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.renderdoc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke pRENDERDOC_EndFrameCapture} */
public abstract class RENDERDOC_EndFrameCapture extends Callback implements RENDERDOC_EndFrameCaptureI {

    /**
     * Creates a {@code RENDERDOC_EndFrameCapture} instance from the specified function pointer.
     *
     * @return the new {@code RENDERDOC_EndFrameCapture}
     */
    public static RENDERDOC_EndFrameCapture create(long functionPointer) {
        RENDERDOC_EndFrameCaptureI instance = Callback.get(functionPointer);
        return instance instanceof RENDERDOC_EndFrameCapture
            ? (RENDERDOC_EndFrameCapture)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable RENDERDOC_EndFrameCapture createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code RENDERDOC_EndFrameCapture} instance that delegates to the specified {@code RENDERDOC_EndFrameCaptureI} instance. */
    public static RENDERDOC_EndFrameCapture create(RENDERDOC_EndFrameCaptureI instance) {
        return instance instanceof RENDERDOC_EndFrameCapture
            ? (RENDERDOC_EndFrameCapture)instance
            : new Container(instance.address(), instance);
    }

    protected RENDERDOC_EndFrameCapture() {
        super(CIF);
    }

    RENDERDOC_EndFrameCapture(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends RENDERDOC_EndFrameCapture {

        private final RENDERDOC_EndFrameCaptureI delegate;

        Container(long functionPointer, RENDERDOC_EndFrameCaptureI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long device, long wndHandle) {
            delegate.invoke(device, wndHandle);
        }

    }

}