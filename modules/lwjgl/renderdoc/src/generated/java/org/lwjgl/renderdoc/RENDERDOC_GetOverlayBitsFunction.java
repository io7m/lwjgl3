/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.renderdoc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke pRENDERDOC_GetOverlayBits} */
public abstract class RENDERDOC_GetOverlayBitsFunction extends Callback implements RENDERDOC_GetOverlayBitsFunctionI {

    /**
     * Creates a {@code RENDERDOC_GetOverlayBitsFunction} instance from the specified function pointer.
     *
     * @return the new {@code RENDERDOC_GetOverlayBitsFunction}
     */
    public static RENDERDOC_GetOverlayBitsFunction create(long functionPointer) {
        RENDERDOC_GetOverlayBitsFunctionI instance = Callback.get(functionPointer);
        return instance instanceof RENDERDOC_GetOverlayBitsFunction
            ? (RENDERDOC_GetOverlayBitsFunction)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable RENDERDOC_GetOverlayBitsFunction createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code RENDERDOC_GetOverlayBitsFunction} instance that delegates to the specified {@code RENDERDOC_GetOverlayBitsFunctionI} instance. */
    public static RENDERDOC_GetOverlayBitsFunction create(RENDERDOC_GetOverlayBitsFunctionI instance) {
        return instance instanceof RENDERDOC_GetOverlayBitsFunction
            ? (RENDERDOC_GetOverlayBitsFunction)instance
            : new Container(instance.address(), instance);
    }

    protected RENDERDOC_GetOverlayBitsFunction() {
        super(CIF);
    }

    RENDERDOC_GetOverlayBitsFunction(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends RENDERDOC_GetOverlayBitsFunction {

        private final RENDERDOC_GetOverlayBitsFunctionI delegate;

        Container(long functionPointer, RENDERDOC_GetOverlayBitsFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long XXX) {
            return delegate.invoke(XXX);
        }

    }

}