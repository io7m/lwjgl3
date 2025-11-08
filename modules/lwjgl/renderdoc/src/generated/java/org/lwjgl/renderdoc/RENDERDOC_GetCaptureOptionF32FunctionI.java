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

/** Callback function: {@link #invoke pRENDERDOC_GetCaptureOptionF32} */
@FunctionalInterface
@NativeType("pRENDERDOC_GetCaptureOptionF32")
public interface RENDERDOC_GetCaptureOptionF32FunctionI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        ffi_type_float,
        ffi_type_uint32
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        float __result = invoke(
            memGetInt(memGetAddress(args))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code float (* pRENDERDOC_GetCaptureOptionF32) (unsigned int option)} */
    float invoke(@NativeType("unsigned int") int option);

}