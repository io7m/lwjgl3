/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.renderdoc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke pRENDERDOC_MaskOverlayBits} */
public abstract class RENDERDOC_MaskOverlayBitsFunction extends Callback implements RENDERDOC_MaskOverlayBitsFunctionI {

    /**
     * Creates a {@code RENDERDOC_MaskOverlayBitsFunction} instance from the specified function pointer.
     *
     * @return the new {@code RENDERDOC_MaskOverlayBitsFunction}
     */
    public static RENDERDOC_MaskOverlayBitsFunction create(long functionPointer) {
        RENDERDOC_MaskOverlayBitsFunctionI instance = Callback.get(functionPointer);
        return instance instanceof RENDERDOC_MaskOverlayBitsFunction
            ? (RENDERDOC_MaskOverlayBitsFunction)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable RENDERDOC_MaskOverlayBitsFunction createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code RENDERDOC_MaskOverlayBitsFunction} instance that delegates to the specified {@code RENDERDOC_MaskOverlayBitsFunctionI} instance. */
    public static RENDERDOC_MaskOverlayBitsFunction create(RENDERDOC_MaskOverlayBitsFunctionI instance) {
        return instance instanceof RENDERDOC_MaskOverlayBitsFunction
            ? (RENDERDOC_MaskOverlayBitsFunction)instance
            : new Container(instance.address(), instance);
    }

    protected RENDERDOC_MaskOverlayBitsFunction() {
        super(CIF);
    }

    RENDERDOC_MaskOverlayBitsFunction(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends RENDERDOC_MaskOverlayBitsFunction {

        private final RENDERDOC_MaskOverlayBitsFunctionI delegate;

        Container(long functionPointer, RENDERDOC_MaskOverlayBitsFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(int and, int or) {
            return delegate.invoke(and, or);
        }

    }

}