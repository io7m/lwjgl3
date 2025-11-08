/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.renderdoc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke pRENDERDOC_SetFocusToggleKeys} */
public abstract class RENDERDOC_SetFocusToggleKeysFunction extends Callback implements RENDERDOC_SetFocusToggleKeysFunctionI {

    /**
     * Creates a {@code RENDERDOC_SetFocusToggleKeysFunction} instance from the specified function pointer.
     *
     * @return the new {@code RENDERDOC_SetFocusToggleKeysFunction}
     */
    public static RENDERDOC_SetFocusToggleKeysFunction create(long functionPointer) {
        RENDERDOC_SetFocusToggleKeysFunctionI instance = Callback.get(functionPointer);
        return instance instanceof RENDERDOC_SetFocusToggleKeysFunction
            ? (RENDERDOC_SetFocusToggleKeysFunction)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable RENDERDOC_SetFocusToggleKeysFunction createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code RENDERDOC_SetFocusToggleKeysFunction} instance that delegates to the specified {@code RENDERDOC_SetFocusToggleKeysFunctionI} instance. */
    public static RENDERDOC_SetFocusToggleKeysFunction create(RENDERDOC_SetFocusToggleKeysFunctionI instance) {
        return instance instanceof RENDERDOC_SetFocusToggleKeysFunction
            ? (RENDERDOC_SetFocusToggleKeysFunction)instance
            : new Container(instance.address(), instance);
    }

    protected RENDERDOC_SetFocusToggleKeysFunction() {
        super(CIF);
    }

    RENDERDOC_SetFocusToggleKeysFunction(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends RENDERDOC_SetFocusToggleKeysFunction {

        private final RENDERDOC_SetFocusToggleKeysFunctionI delegate;

        Container(long functionPointer, RENDERDOC_SetFocusToggleKeysFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long keys, int value) {
            delegate.invoke(keys, value);
        }

    }

}