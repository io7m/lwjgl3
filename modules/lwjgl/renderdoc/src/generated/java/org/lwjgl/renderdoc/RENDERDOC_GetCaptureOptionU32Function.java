/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.renderdoc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke pRENDERDOC_GetCaptureOptionU32} */
public abstract class RENDERDOC_GetCaptureOptionU32Function extends Callback implements RENDERDOC_GetCaptureOptionU32FunctionI {

    /**
     * Creates a {@code RENDERDOC_GetCaptureOptionU32Function} instance from the specified function pointer.
     *
     * @return the new {@code RENDERDOC_GetCaptureOptionU32Function}
     */
    public static RENDERDOC_GetCaptureOptionU32Function create(long functionPointer) {
        RENDERDOC_GetCaptureOptionU32FunctionI instance = Callback.get(functionPointer);
        return instance instanceof RENDERDOC_GetCaptureOptionU32Function
            ? (RENDERDOC_GetCaptureOptionU32Function)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable RENDERDOC_GetCaptureOptionU32Function createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code RENDERDOC_GetCaptureOptionU32Function} instance that delegates to the specified {@code RENDERDOC_GetCaptureOptionU32FunctionI} instance. */
    public static RENDERDOC_GetCaptureOptionU32Function create(RENDERDOC_GetCaptureOptionU32FunctionI instance) {
        return instance instanceof RENDERDOC_GetCaptureOptionU32Function
            ? (RENDERDOC_GetCaptureOptionU32Function)instance
            : new Container(instance.address(), instance);
    }

    protected RENDERDOC_GetCaptureOptionU32Function() {
        super(CIF);
    }

    RENDERDOC_GetCaptureOptionU32Function(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends RENDERDOC_GetCaptureOptionU32Function {

        private final RENDERDOC_GetCaptureOptionU32FunctionI delegate;

        Container(long functionPointer, RENDERDOC_GetCaptureOptionU32FunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(int option) {
            return delegate.invoke(option);
        }

    }

}