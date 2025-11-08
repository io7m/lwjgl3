/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.renderdoc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke pRENDERDOC_GetNumCaptures} */
public abstract class RENDERDOC_GetNumCaptures extends Callback implements RENDERDOC_GetNumCapturesI {

    /**
     * Creates a {@code RENDERDOC_GetNumCaptures} instance from the specified function pointer.
     *
     * @return the new {@code RENDERDOC_GetNumCaptures}
     */
    public static RENDERDOC_GetNumCaptures create(long functionPointer) {
        RENDERDOC_GetNumCapturesI instance = Callback.get(functionPointer);
        return instance instanceof RENDERDOC_GetNumCaptures
            ? (RENDERDOC_GetNumCaptures)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable RENDERDOC_GetNumCaptures createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code RENDERDOC_GetNumCaptures} instance that delegates to the specified {@code RENDERDOC_GetNumCapturesI} instance. */
    public static RENDERDOC_GetNumCaptures create(RENDERDOC_GetNumCapturesI instance) {
        return instance instanceof RENDERDOC_GetNumCaptures
            ? (RENDERDOC_GetNumCaptures)instance
            : new Container(instance.address(), instance);
    }

    protected RENDERDOC_GetNumCaptures() {
        super(CIF);
    }

    RENDERDOC_GetNumCaptures(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends RENDERDOC_GetNumCaptures {

        private final RENDERDOC_GetNumCapturesI delegate;

        Container(long functionPointer, RENDERDOC_GetNumCapturesI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long XXX) {
            return delegate.invoke(XXX);
        }

    }

}