/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.renderdoc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke pRENDERDOC_TriggerCapture} */
public abstract class RENDERDOC_TriggerCapture extends Callback implements RENDERDOC_TriggerCaptureI {

    /**
     * Creates a {@code RENDERDOC_TriggerCapture} instance from the specified function pointer.
     *
     * @return the new {@code RENDERDOC_TriggerCapture}
     */
    public static RENDERDOC_TriggerCapture create(long functionPointer) {
        RENDERDOC_TriggerCaptureI instance = Callback.get(functionPointer);
        return instance instanceof RENDERDOC_TriggerCapture
            ? (RENDERDOC_TriggerCapture)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable RENDERDOC_TriggerCapture createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code RENDERDOC_TriggerCapture} instance that delegates to the specified {@code RENDERDOC_TriggerCaptureI} instance. */
    public static RENDERDOC_TriggerCapture create(RENDERDOC_TriggerCaptureI instance) {
        return instance instanceof RENDERDOC_TriggerCapture
            ? (RENDERDOC_TriggerCapture)instance
            : new Container(instance.address(), instance);
    }

    protected RENDERDOC_TriggerCapture() {
        super(CIF);
    }

    RENDERDOC_TriggerCapture(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends RENDERDOC_TriggerCapture {

        private final RENDERDOC_TriggerCaptureI delegate;

        Container(long functionPointer, RENDERDOC_TriggerCaptureI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long XXX) {
            delegate.invoke(XXX);
        }

    }

}