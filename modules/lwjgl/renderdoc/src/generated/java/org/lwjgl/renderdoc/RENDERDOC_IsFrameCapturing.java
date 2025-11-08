/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.renderdoc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke pRENDERDOC_IsFrameCapturing} */
public abstract class RENDERDOC_IsFrameCapturing extends Callback implements RENDERDOC_IsFrameCapturingI {

    /**
     * Creates a {@code RENDERDOC_IsFrameCapturing} instance from the specified function pointer.
     *
     * @return the new {@code RENDERDOC_IsFrameCapturing}
     */
    public static RENDERDOC_IsFrameCapturing create(long functionPointer) {
        RENDERDOC_IsFrameCapturingI instance = Callback.get(functionPointer);
        return instance instanceof RENDERDOC_IsFrameCapturing
            ? (RENDERDOC_IsFrameCapturing)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable RENDERDOC_IsFrameCapturing createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code RENDERDOC_IsFrameCapturing} instance that delegates to the specified {@code RENDERDOC_IsFrameCapturingI} instance. */
    public static RENDERDOC_IsFrameCapturing create(RENDERDOC_IsFrameCapturingI instance) {
        return instance instanceof RENDERDOC_IsFrameCapturing
            ? (RENDERDOC_IsFrameCapturing)instance
            : new Container(instance.address(), instance);
    }

    protected RENDERDOC_IsFrameCapturing() {
        super(CIF);
    }

    RENDERDOC_IsFrameCapturing(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends RENDERDOC_IsFrameCapturing {

        private final RENDERDOC_IsFrameCapturingI delegate;

        Container(long functionPointer, RENDERDOC_IsFrameCapturingI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long XXX) {
            return delegate.invoke(XXX);
        }

    }

}