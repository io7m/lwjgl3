/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.renderdoc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke pRENDERDOC_LaunchReplayUI} */
public abstract class RENDERDOC_LaunchReplayUI extends Callback implements RENDERDOC_LaunchReplayUII {

    /**
     * Creates a {@code RENDERDOC_LaunchReplayUI} instance from the specified function pointer.
     *
     * @return the new {@code RENDERDOC_LaunchReplayUI}
     */
    public static RENDERDOC_LaunchReplayUI create(long functionPointer) {
        RENDERDOC_LaunchReplayUII instance = Callback.get(functionPointer);
        return instance instanceof RENDERDOC_LaunchReplayUI
            ? (RENDERDOC_LaunchReplayUI)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable RENDERDOC_LaunchReplayUI createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code RENDERDOC_LaunchReplayUI} instance that delegates to the specified {@code RENDERDOC_LaunchReplayUII} instance. */
    public static RENDERDOC_LaunchReplayUI create(RENDERDOC_LaunchReplayUII instance) {
        return instance instanceof RENDERDOC_LaunchReplayUI
            ? (RENDERDOC_LaunchReplayUI)instance
            : new Container(instance.address(), instance);
    }

    protected RENDERDOC_LaunchReplayUI() {
        super(CIF);
    }

    RENDERDOC_LaunchReplayUI(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends RENDERDOC_LaunchReplayUI {

        private final RENDERDOC_LaunchReplayUII delegate;

        Container(long functionPointer, RENDERDOC_LaunchReplayUII delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(int connectTargetControl, long cmdline) {
            return delegate.invoke(connectTargetControl, cmdline);
        }

    }

}