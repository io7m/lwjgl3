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

/** Callback function: {@link #invoke pRENDERDOC_SetCaptureOptionF32} */
@FunctionalInterface
@NativeType("pRENDERDOC_SetCaptureOptionF32")
public interface RENDERDOC_SetCaptureOptionF32FunctionI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        ffi_type_sint32,
        ffi_type_uint32, ffi_type_float
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetInt(memGetAddress(args)),
            memGetFloat(memGetAddress(args + POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code int (* pRENDERDOC_SetCaptureOptionF32) (unsigned int option, float value)} */
    int invoke(@NativeType("unsigned int") int option, float value);

}