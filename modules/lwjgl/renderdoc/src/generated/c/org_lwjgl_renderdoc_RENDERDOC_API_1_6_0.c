/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "renderdoc_app.h"
#include <stddef.h>
#ifdef LWJGL_WINDOWS
    #define alignof __alignof
#else
    #include <stdalign.h>
#endif

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_renderdoc_RENDERDOC_1API_11_16_10_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    jint *buffer = (jint *)(uintptr_t)bufferAddress;

    UNUSED_PARAMS(__env, clazz)

    buffer[0] = alignof(RENDERDOC_API_1_6_0);

    return sizeof(RENDERDOC_API_1_6_0);
}

EXTERN_C_EXIT
