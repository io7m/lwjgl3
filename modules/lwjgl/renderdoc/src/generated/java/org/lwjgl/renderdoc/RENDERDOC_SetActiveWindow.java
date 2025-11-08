/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.renderdoc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke pRENDERDOC_SetActiveWindow} */
public abstract class RENDERDOC_SetActiveWindow extends Callback implements RENDERDOC_SetActiveWindowI {

    /**
     * Creates a {@code RENDERDOC_SetActiveWindow} instance from the specified function pointer.
     *
     * @return the new {@code RENDERDOC_SetActiveWindow}
     */
    public static RENDERDOC_SetActiveWindow create(long functionPointer) {
        RENDERDOC_SetActiveWindowI instance = Callback.get(functionPointer);
        return instance instanceof RENDERDOC_SetActiveWindow
            ? (RENDERDOC_SetActiveWindow)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable RENDERDOC_SetActiveWindow createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code RENDERDOC_SetActiveWindow} instance that delegates to the specified {@code RENDERDOC_SetActiveWindowI} instance. */
    public static RENDERDOC_SetActiveWindow create(RENDERDOC_SetActiveWindowI instance) {
        return instance instanceof RENDERDOC_SetActiveWindow
            ? (RENDERDOC_SetActiveWindow)instance
            : new Container(instance.address(), instance);
    }

    protected RENDERDOC_SetActiveWindow() {
        super(CIF);
    }

    RENDERDOC_SetActiveWindow(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends RENDERDOC_SetActiveWindow {

        private final RENDERDOC_SetActiveWindowI delegate;

        Container(long functionPointer, RENDERDOC_SetActiveWindowI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long device, long wndHandle) {
            return delegate.invoke(device, wndHandle);
        }

    }

}