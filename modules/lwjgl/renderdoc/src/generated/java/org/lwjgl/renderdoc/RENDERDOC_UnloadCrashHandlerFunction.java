/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.renderdoc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke pRENDERDOC_UnloadCrashHandler} */
public abstract class RENDERDOC_UnloadCrashHandlerFunction extends Callback implements RENDERDOC_UnloadCrashHandlerFunctionI {

    /**
     * Creates a {@code RENDERDOC_UnloadCrashHandlerFunction} instance from the specified function pointer.
     *
     * @return the new {@code RENDERDOC_UnloadCrashHandlerFunction}
     */
    public static RENDERDOC_UnloadCrashHandlerFunction create(long functionPointer) {
        RENDERDOC_UnloadCrashHandlerFunctionI instance = Callback.get(functionPointer);
        return instance instanceof RENDERDOC_UnloadCrashHandlerFunction
            ? (RENDERDOC_UnloadCrashHandlerFunction)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable RENDERDOC_UnloadCrashHandlerFunction createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code RENDERDOC_UnloadCrashHandlerFunction} instance that delegates to the specified {@code RENDERDOC_UnloadCrashHandlerFunctionI} instance. */
    public static RENDERDOC_UnloadCrashHandlerFunction create(RENDERDOC_UnloadCrashHandlerFunctionI instance) {
        return instance instanceof RENDERDOC_UnloadCrashHandlerFunction
            ? (RENDERDOC_UnloadCrashHandlerFunction)instance
            : new Container(instance.address(), instance);
    }

    protected RENDERDOC_UnloadCrashHandlerFunction() {
        super(CIF);
    }

    RENDERDOC_UnloadCrashHandlerFunction(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends RENDERDOC_UnloadCrashHandlerFunction {

        private final RENDERDOC_UnloadCrashHandlerFunctionI delegate;

        Container(long functionPointer, RENDERDOC_UnloadCrashHandlerFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long XXX) {
            delegate.invoke(XXX);
        }

    }

}