/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.renderdoc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke pRENDERDOC_IsTargetControlConnected} */
public abstract class RENDERDOC_IsTargetControlConnected extends Callback implements RENDERDOC_IsTargetControlConnectedI {

    /**
     * Creates a {@code RENDERDOC_IsTargetControlConnected} instance from the specified function pointer.
     *
     * @return the new {@code RENDERDOC_IsTargetControlConnected}
     */
    public static RENDERDOC_IsTargetControlConnected create(long functionPointer) {
        RENDERDOC_IsTargetControlConnectedI instance = Callback.get(functionPointer);
        return instance instanceof RENDERDOC_IsTargetControlConnected
            ? (RENDERDOC_IsTargetControlConnected)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable RENDERDOC_IsTargetControlConnected createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code RENDERDOC_IsTargetControlConnected} instance that delegates to the specified {@code RENDERDOC_IsTargetControlConnectedI} instance. */
    public static RENDERDOC_IsTargetControlConnected create(RENDERDOC_IsTargetControlConnectedI instance) {
        return instance instanceof RENDERDOC_IsTargetControlConnected
            ? (RENDERDOC_IsTargetControlConnected)instance
            : new Container(instance.address(), instance);
    }

    protected RENDERDOC_IsTargetControlConnected() {
        super(CIF);
    }

    RENDERDOC_IsTargetControlConnected(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends RENDERDOC_IsTargetControlConnected {

        private final RENDERDOC_IsTargetControlConnectedI delegate;

        Container(long functionPointer, RENDERDOC_IsTargetControlConnectedI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long XXX) {
            return delegate.invoke(XXX);
        }

    }

}