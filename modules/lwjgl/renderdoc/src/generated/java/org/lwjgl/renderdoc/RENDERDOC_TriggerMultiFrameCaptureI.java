/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.renderdoc;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke pRENDERDOC_TriggerMultiFrameCapture} */
@FunctionalInterface
@NativeType("pRENDERDOC_TriggerMultiFrameCapture")
public interface RENDERDOC_TriggerMultiFrameCaptureI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        ffi_type_void,
        ffi_type_uint32
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetInt(memGetAddress(args))
        );
    }

    /** {@code void (* pRENDERDOC_TriggerMultiFrameCapture) (uint32_t numFrames)} */
    void invoke(@NativeType("uint32_t") int numFrames);

}