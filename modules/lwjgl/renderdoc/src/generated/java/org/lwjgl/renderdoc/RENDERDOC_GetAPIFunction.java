/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.renderdoc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke pRENDERDOC_GetAPI} */
public abstract class RENDERDOC_GetAPIFunction extends Callback implements RENDERDOC_GetAPIFunctionI {

    /**
     * Creates a {@code RENDERDOC_GetAPIFunction} instance from the specified function pointer.
     *
     * @return the new {@code RENDERDOC_GetAPIFunction}
     */
    public static RENDERDOC_GetAPIFunction create(long functionPointer) {
        RENDERDOC_GetAPIFunctionI instance = Callback.get(functionPointer);
        return instance instanceof RENDERDOC_GetAPIFunction
            ? (RENDERDOC_GetAPIFunction)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable RENDERDOC_GetAPIFunction createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code RENDERDOC_GetAPIFunction} instance that delegates to the specified {@code RENDERDOC_GetAPIFunctionI} instance. */
    public static RENDERDOC_GetAPIFunction create(RENDERDOC_GetAPIFunctionI instance) {
        return instance instanceof RENDERDOC_GetAPIFunction
            ? (RENDERDOC_GetAPIFunction)instance
            : new Container(instance.address(), instance);
    }

    protected RENDERDOC_GetAPIFunction() {
        super(CIF);
    }

    RENDERDOC_GetAPIFunction(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends RENDERDOC_GetAPIFunction {

        private final RENDERDOC_GetAPIFunctionI delegate;

        Container(long functionPointer, RENDERDOC_GetAPIFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(int version, long out) {
            return delegate.invoke(version, out);
        }

    }

}