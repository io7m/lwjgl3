/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.renderdoc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke pRENDERDOC_GetCapture} */
public abstract class RENDERDOC_GetCapture extends Callback implements RENDERDOC_GetCaptureI {

    /**
     * Creates a {@code RENDERDOC_GetCapture} instance from the specified function pointer.
     *
     * @return the new {@code RENDERDOC_GetCapture}
     */
    public static RENDERDOC_GetCapture create(long functionPointer) {
        RENDERDOC_GetCaptureI instance = Callback.get(functionPointer);
        return instance instanceof RENDERDOC_GetCapture
            ? (RENDERDOC_GetCapture)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable RENDERDOC_GetCapture createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code RENDERDOC_GetCapture} instance that delegates to the specified {@code RENDERDOC_GetCaptureI} instance. */
    public static RENDERDOC_GetCapture create(RENDERDOC_GetCaptureI instance) {
        return instance instanceof RENDERDOC_GetCapture
            ? (RENDERDOC_GetCapture)instance
            : new Container(instance.address(), instance);
    }

    protected RENDERDOC_GetCapture() {
        super(CIF);
    }

    RENDERDOC_GetCapture(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends RENDERDOC_GetCapture {

        private final RENDERDOC_GetCaptureI delegate;

        Container(long functionPointer, RENDERDOC_GetCaptureI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(int index, long filename, long pathlength, long timestamp) {
            return delegate.invoke(index, filename, pathlength, timestamp);
        }

    }

}