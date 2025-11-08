/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.renderdoc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke pRENDERDOC_DiscardFrameCapture} */
public abstract class RENDERDOC_DiscardFrameCapture extends Callback implements RENDERDOC_DiscardFrameCaptureI {

    /**
     * Creates a {@code RENDERDOC_DiscardFrameCapture} instance from the specified function pointer.
     *
     * @return the new {@code RENDERDOC_DiscardFrameCapture}
     */
    public static RENDERDOC_DiscardFrameCapture create(long functionPointer) {
        RENDERDOC_DiscardFrameCaptureI instance = Callback.get(functionPointer);
        return instance instanceof RENDERDOC_DiscardFrameCapture
            ? (RENDERDOC_DiscardFrameCapture)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable RENDERDOC_DiscardFrameCapture createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code RENDERDOC_DiscardFrameCapture} instance that delegates to the specified {@code RENDERDOC_DiscardFrameCaptureI} instance. */
    public static RENDERDOC_DiscardFrameCapture create(RENDERDOC_DiscardFrameCaptureI instance) {
        return instance instanceof RENDERDOC_DiscardFrameCapture
            ? (RENDERDOC_DiscardFrameCapture)instance
            : new Container(instance.address(), instance);
    }

    protected RENDERDOC_DiscardFrameCapture() {
        super(CIF);
    }

    RENDERDOC_DiscardFrameCapture(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends RENDERDOC_DiscardFrameCapture {

        private final RENDERDOC_DiscardFrameCaptureI delegate;

        Container(long functionPointer, RENDERDOC_DiscardFrameCaptureI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long device, long wndHandle) {
            return delegate.invoke(device, wndHandle);
        }

    }

}