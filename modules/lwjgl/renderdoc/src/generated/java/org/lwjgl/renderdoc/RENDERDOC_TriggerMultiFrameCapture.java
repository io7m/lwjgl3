/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.renderdoc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke pRENDERDOC_TriggerMultiFrameCapture} */
public abstract class RENDERDOC_TriggerMultiFrameCapture extends Callback implements RENDERDOC_TriggerMultiFrameCaptureI {

    /**
     * Creates a {@code RENDERDOC_TriggerMultiFrameCapture} instance from the specified function pointer.
     *
     * @return the new {@code RENDERDOC_TriggerMultiFrameCapture}
     */
    public static RENDERDOC_TriggerMultiFrameCapture create(long functionPointer) {
        RENDERDOC_TriggerMultiFrameCaptureI instance = Callback.get(functionPointer);
        return instance instanceof RENDERDOC_TriggerMultiFrameCapture
            ? (RENDERDOC_TriggerMultiFrameCapture)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable RENDERDOC_TriggerMultiFrameCapture createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code RENDERDOC_TriggerMultiFrameCapture} instance that delegates to the specified {@code RENDERDOC_TriggerMultiFrameCaptureI} instance. */
    public static RENDERDOC_TriggerMultiFrameCapture create(RENDERDOC_TriggerMultiFrameCaptureI instance) {
        return instance instanceof RENDERDOC_TriggerMultiFrameCapture
            ? (RENDERDOC_TriggerMultiFrameCapture)instance
            : new Container(instance.address(), instance);
    }

    protected RENDERDOC_TriggerMultiFrameCapture() {
        super(CIF);
    }

    RENDERDOC_TriggerMultiFrameCapture(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends RENDERDOC_TriggerMultiFrameCapture {

        private final RENDERDOC_TriggerMultiFrameCaptureI delegate;

        Container(long functionPointer, RENDERDOC_TriggerMultiFrameCaptureI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(int numFrames) {
            delegate.invoke(numFrames);
        }

    }

}