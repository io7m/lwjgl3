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

/** Callback function: {@link #invoke pRENDERDOC_GetCaptureOptionU32} */
@FunctionalInterface
@NativeType("pRENDERDOC_GetCaptureOptionU32")
public interface RENDERDOC_GetCaptureOptionU32FunctionI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        ffi_type_uint32,
        ffi_type_uint32
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetInt(memGetAddress(args))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code uint32_t (* pRENDERDOC_GetCaptureOptionU32) (unsigned int option)} */
    @NativeType("uint32_t") int invoke(@NativeType("unsigned int") int option);

}