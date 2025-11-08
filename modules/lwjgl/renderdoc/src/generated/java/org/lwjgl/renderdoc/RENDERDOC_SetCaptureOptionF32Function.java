/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.renderdoc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke pRENDERDOC_SetCaptureOptionF32} */
public abstract class RENDERDOC_SetCaptureOptionF32Function extends Callback implements RENDERDOC_SetCaptureOptionF32FunctionI {

    /**
     * Creates a {@code RENDERDOC_SetCaptureOptionF32Function} instance from the specified function pointer.
     *
     * @return the new {@code RENDERDOC_SetCaptureOptionF32Function}
     */
    public static RENDERDOC_SetCaptureOptionF32Function create(long functionPointer) {
        RENDERDOC_SetCaptureOptionF32FunctionI instance = Callback.get(functionPointer);
        return instance instanceof RENDERDOC_SetCaptureOptionF32Function
            ? (RENDERDOC_SetCaptureOptionF32Function)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable RENDERDOC_SetCaptureOptionF32Function createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code RENDERDOC_SetCaptureOptionF32Function} instance that delegates to the specified {@code RENDERDOC_SetCaptureOptionF32FunctionI} instance. */
    public static RENDERDOC_SetCaptureOptionF32Function create(RENDERDOC_SetCaptureOptionF32FunctionI instance) {
        return instance instanceof RENDERDOC_SetCaptureOptionF32Function
            ? (RENDERDOC_SetCaptureOptionF32Function)instance
            : new Container(instance.address(), instance);
    }

    protected RENDERDOC_SetCaptureOptionF32Function() {
        super(CIF);
    }

    RENDERDOC_SetCaptureOptionF32Function(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends RENDERDOC_SetCaptureOptionF32Function {

        private final RENDERDOC_SetCaptureOptionF32FunctionI delegate;

        Container(long functionPointer, RENDERDOC_SetCaptureOptionF32FunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(int option, float value) {
            return delegate.invoke(option, value);
        }

    }

}