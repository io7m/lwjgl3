/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.renderdoc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke pRENDERDOC_SetCaptureKeys} */
public abstract class RENDERDOC_SetCaptureKeysFunction extends Callback implements RENDERDOC_SetCaptureKeysFunctionI {

    /**
     * Creates a {@code RENDERDOC_SetCaptureKeysFunction} instance from the specified function pointer.
     *
     * @return the new {@code RENDERDOC_SetCaptureKeysFunction}
     */
    public static RENDERDOC_SetCaptureKeysFunction create(long functionPointer) {
        RENDERDOC_SetCaptureKeysFunctionI instance = Callback.get(functionPointer);
        return instance instanceof RENDERDOC_SetCaptureKeysFunction
            ? (RENDERDOC_SetCaptureKeysFunction)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable RENDERDOC_SetCaptureKeysFunction createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code RENDERDOC_SetCaptureKeysFunction} instance that delegates to the specified {@code RENDERDOC_SetCaptureKeysFunctionI} instance. */
    public static RENDERDOC_SetCaptureKeysFunction create(RENDERDOC_SetCaptureKeysFunctionI instance) {
        return instance instanceof RENDERDOC_SetCaptureKeysFunction
            ? (RENDERDOC_SetCaptureKeysFunction)instance
            : new Container(instance.address(), instance);
    }

    protected RENDERDOC_SetCaptureKeysFunction() {
        super(CIF);
    }

    RENDERDOC_SetCaptureKeysFunction(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends RENDERDOC_SetCaptureKeysFunction {

        private final RENDERDOC_SetCaptureKeysFunctionI delegate;

        Container(long functionPointer, RENDERDOC_SetCaptureKeysFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long keys, int value) {
            delegate.invoke(keys, value);
        }

    }

}