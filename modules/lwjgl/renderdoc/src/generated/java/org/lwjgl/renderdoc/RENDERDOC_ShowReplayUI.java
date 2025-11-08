/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.renderdoc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke pRENDERDOC_ShowReplayUI} */
public abstract class RENDERDOC_ShowReplayUI extends Callback implements RENDERDOC_ShowReplayUII {

    /**
     * Creates a {@code RENDERDOC_ShowReplayUI} instance from the specified function pointer.
     *
     * @return the new {@code RENDERDOC_ShowReplayUI}
     */
    public static RENDERDOC_ShowReplayUI create(long functionPointer) {
        RENDERDOC_ShowReplayUII instance = Callback.get(functionPointer);
        return instance instanceof RENDERDOC_ShowReplayUI
            ? (RENDERDOC_ShowReplayUI)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable RENDERDOC_ShowReplayUI createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code RENDERDOC_ShowReplayUI} instance that delegates to the specified {@code RENDERDOC_ShowReplayUII} instance. */
    public static RENDERDOC_ShowReplayUI create(RENDERDOC_ShowReplayUII instance) {
        return instance instanceof RENDERDOC_ShowReplayUI
            ? (RENDERDOC_ShowReplayUI)instance
            : new Container(instance.address(), instance);
    }

    protected RENDERDOC_ShowReplayUI() {
        super(CIF);
    }

    RENDERDOC_ShowReplayUI(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends RENDERDOC_ShowReplayUI {

        private final RENDERDOC_ShowReplayUII delegate;

        Container(long functionPointer, RENDERDOC_ShowReplayUII delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long XXX) {
            return delegate.invoke(XXX);
        }

    }

}