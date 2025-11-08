/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.renderdoc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke pRENDERDOC_GetCaptureOptionF32} */
public abstract class RENDERDOC_GetCaptureOptionF32Function extends Callback implements RENDERDOC_GetCaptureOptionF32FunctionI {

    /**
     * Creates a {@code RENDERDOC_GetCaptureOptionF32Function} instance from the specified function pointer.
     *
     * @return the new {@code RENDERDOC_GetCaptureOptionF32Function}
     */
    public static RENDERDOC_GetCaptureOptionF32Function create(long functionPointer) {
        RENDERDOC_GetCaptureOptionF32FunctionI instance = Callback.get(functionPointer);
        return instance instanceof RENDERDOC_GetCaptureOptionF32Function
            ? (RENDERDOC_GetCaptureOptionF32Function)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable RENDERDOC_GetCaptureOptionF32Function createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code RENDERDOC_GetCaptureOptionF32Function} instance that delegates to the specified {@code RENDERDOC_GetCaptureOptionF32FunctionI} instance. */
    public static RENDERDOC_GetCaptureOptionF32Function create(RENDERDOC_GetCaptureOptionF32FunctionI instance) {
        return instance instanceof RENDERDOC_GetCaptureOptionF32Function
            ? (RENDERDOC_GetCaptureOptionF32Function)instance
            : new Container(instance.address(), instance);
    }

    protected RENDERDOC_GetCaptureOptionF32Function() {
        super(CIF);
    }

    RENDERDOC_GetCaptureOptionF32Function(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends RENDERDOC_GetCaptureOptionF32Function {

        private final RENDERDOC_GetCaptureOptionF32FunctionI delegate;

        Container(long functionPointer, RENDERDOC_GetCaptureOptionF32FunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public float invoke(int option) {
            return delegate.invoke(option);
        }

    }

}