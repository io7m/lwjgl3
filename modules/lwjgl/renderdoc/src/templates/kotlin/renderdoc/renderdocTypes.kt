/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */

package renderdoc

import org.lwjgl.generator.*

val RENDERDOC_BINDING = simpleBinding(
    Module.RENDERDOC,
    bundledWithLWJGL = true
)

val RENDERDOC_Version = IntegerType("RENDERDOC_Version", PrimitiveMapping.INT)

val RENDERDOC_API_1_6_0 = struct(Module.RENDERDOC, "RENDERDOC_API_1_6_0") {
    nativeImport("renderdoc_app.h")
    pRENDERDOC_GetAPI
    pRENDERDOC_SetCaptureOptionU32
    pRENDERDOC_SetCaptureOptionF32
    pRENDERDOC_GetCaptureOptionU32
    pRENDERDOC_GetCaptureOptionF32
    pRENDERDOC_SetFocusToggleKeys
    pRENDERDOC_SetCaptureKeys
    pRENDERDOC_GetOverlayBits
    pRENDERDOC_MaskOverlayBits
    pRENDERDOC_UnloadCrashHandler
    pRENDERDOC_SetCaptureFilePathTemplate
    pRENDERDOC_GetCaptureFilePathTemplate
    pRENDERDOC_GetNumCaptures
    pRENDERDOC_GetCapture
    pRENDERDOC_TriggerCapture
    pRENDERDOC_IsTargetControlConnected
    pRENDERDOC_LaunchReplayUI
    pRENDERDOC_SetActiveWindow
    pRENDERDOC_StartFrameCapture
    pRENDERDOC_IsFrameCapturing
    pRENDERDOC_EndFrameCapture
    pRENDERDOC_TriggerMultiFrameCapture
    pRENDERDOC_SetCaptureFileComments
    pRENDERDOC_DiscardFrameCapture
    pRENDERDOC_ShowReplayUI
    pRENDERDOC_SetCaptureTitle
}

val pRENDERDOC_GetAPI = Module.RENDERDOC.callback {
    int(
        "RENDERDOC_GetAPIFunction",
        RENDERDOC_Version("version"),
        void.p.p("out"),
        nativeType = "pRENDERDOC_GetAPI"
    ) {}
}

val pRENDERDOC_SetCaptureOptionU32 = Module.RENDERDOC.callback {
    int(
        "RENDERDOC_SetCaptureOptionU32Function",
        unsigned_int("option"),
        uint32_t("value"),
        nativeType = "pRENDERDOC_SetCaptureOptionU32"
    ) {}
}

val pRENDERDOC_SetCaptureOptionF32 = Module.RENDERDOC.callback {
    int(
        "RENDERDOC_SetCaptureOptionF32Function",
        unsigned_int("option"),
        float("value"),
        nativeType = "pRENDERDOC_SetCaptureOptionF32"
    ) {}
}

val pRENDERDOC_GetCaptureOptionU32 = Module.RENDERDOC.callback {
    uint32_t(
        "RENDERDOC_GetCaptureOptionU32Function",
        unsigned_int("option"),
        nativeType = "pRENDERDOC_GetCaptureOptionU32"
    ) {}
}

val pRENDERDOC_GetCaptureOptionF32 = Module.RENDERDOC.callback {
    float(
        "RENDERDOC_GetCaptureOptionF32Function",
        unsigned_int("option"),
        nativeType = "pRENDERDOC_GetCaptureOptionF32"
    ) {}
}

val pRENDERDOC_SetFocusToggleKeys = Module.RENDERDOC.callback {
    void(
        "RENDERDOC_SetFocusToggleKeysFunction",
        unsigned_int.p("keys"),
        int("value"),
        nativeType = "pRENDERDOC_SetFocusToggleKeys"
    ) {}
}

val pRENDERDOC_SetCaptureKeys = Module.RENDERDOC.callback {
    void(
        "RENDERDOC_SetCaptureKeysFunction",
        unsigned_int.p("keys"),
        int("value"),
        nativeType = "pRENDERDOC_SetCaptureKeys"
    ) {}
}

val pRENDERDOC_GetOverlayBits = Module.RENDERDOC.callback {
    uint32_t(
        "RENDERDOC_GetOverlayBitsFunction",
        nullable..void.p("XXX"),
        nativeType = "pRENDERDOC_GetOverlayBits"
    ) {}
}

val pRENDERDOC_MaskOverlayBits = Module.RENDERDOC.callback {
    uint32_t(
        "RENDERDOC_MaskOverlayBitsFunction",
        uint32_t("and"),
        uint32_t("or"),
        nativeType = "pRENDERDOC_MaskOverlayBits"
    ) {}
}

val pRENDERDOC_UnloadCrashHandler = Module.RENDERDOC.callback {
    void(
        "RENDERDOC_UnloadCrashHandlerFunction",
        nullable..void.p("XXX"),
        nativeType = "pRENDERDOC_UnloadCrashHandler"
    ) {}
}

val pRENDERDOC_SetCaptureFilePathTemplate = Module.RENDERDOC.callback {
    void(
        "RENDERDOC_SetCaptureFilePathTemplate",
        charUTF8.const.p("path"),
        nativeType = "pRENDERDOC_SetCaptureFilePathTemplate"
    ) {}
}

val pRENDERDOC_GetCaptureFilePathTemplate = Module.RENDERDOC.callback {
    charUTF8.const.p(
        "RENDERDOC_GetCaptureFilePathTemplate",
        nullable..void.p("XXX"),
        nativeType = "pRENDERDOC_GetCaptureFilePathTemplate"
    ) {}
}

val pRENDERDOC_GetNumCaptures = Module.RENDERDOC.callback {
    uint32_t(
        "RENDERDOC_GetNumCaptures",
        nullable..void.p("XXX"),
        nativeType = "pRENDERDOC_GetNumCaptures"
    ) {}
}

val pRENDERDOC_GetCapture = Module.RENDERDOC.callback {
    uint32_t(
        "RENDERDOC_GetCapture",
        uint32_t("index"),
        char.p("filename"),
        uint32_t.p("pathlength"),
        uint64_t.p("timestamp"),
        nativeType = "pRENDERDOC_GetCapture"
    ) {}
}

val pRENDERDOC_TriggerCapture = Module.RENDERDOC.callback {
    void(
        "RENDERDOC_TriggerCapture",
        nullable..void.p("XXX"),
        nativeType = "pRENDERDOC_TriggerCapture"
    ) {}
}

val pRENDERDOC_IsTargetControlConnected = Module.RENDERDOC.callback {
    uint32_t(
        "RENDERDOC_IsTargetControlConnected",
        nullable..void.p("XXX"),
        nativeType = "pRENDERDOC_IsTargetControlConnected"
    ) {}
}

val pRENDERDOC_LaunchReplayUI = Module.RENDERDOC.callback {
    uint32_t(
        "RENDERDOC_LaunchReplayUI",
        uint32_t("connectTargetControl"),
        charUTF8.const.p("cmdline"),
        nativeType = "pRENDERDOC_LaunchReplayUI"
    ) {}
}

val pRENDERDOC_SetActiveWindow = Module.RENDERDOC.callback {
    uint32_t(
        "RENDERDOC_SetActiveWindow",
        void.p("device"),
        void.p("wndHandle"),
        nativeType = "pRENDERDOC_SetActiveWindow"
    ) {}
}

val pRENDERDOC_StartFrameCapture = Module.RENDERDOC.callback {
    void(
        "RENDERDOC_StartFrameCapture",
        void.p("device"),
        void.p("wndHandle"),
        nativeType = "pRENDERDOC_StartFrameCapture"
    ) {}
}

val pRENDERDOC_IsFrameCapturing = Module.RENDERDOC.callback {
    uint32_t(
        "RENDERDOC_IsFrameCapturing",
        nullable..void.p("XXX"),
        nativeType = "pRENDERDOC_IsFrameCapturing"
    ) {}
}

val pRENDERDOC_EndFrameCapture = Module.RENDERDOC.callback {
    void(
        "RENDERDOC_EndFrameCapture",
        void.p("device"),
        void.p("wndHandle"),
        nativeType = "pRENDERDOC_EndFrameCapture"
    ) {}
}

val pRENDERDOC_TriggerMultiFrameCapture = Module.RENDERDOC.callback {
    void(
        "RENDERDOC_TriggerMultiFrameCapture",
        uint32_t("numFrames"),
        nativeType = "pRENDERDOC_TriggerMultiFrameCapture"
    ) {}
}

val pRENDERDOC_SetCaptureFileComments = Module.RENDERDOC.callback {
    void(
        "RENDERDOC_SetCaptureFileComments",
        char.const.p("filePath"),
        char.const.p("comments"),
        nativeType = "pRENDERDOC_SetCaptureFileComments"
    ) {}
}

val pRENDERDOC_DiscardFrameCapture = Module.RENDERDOC.callback {
    uint32_t(
        "RENDERDOC_DiscardFrameCapture",
        void.p("device"),
        void.p("wndHandle"),
        nativeType = "pRENDERDOC_DiscardFrameCapture"
    ) {}
}

val pRENDERDOC_ShowReplayUI = Module.RENDERDOC.callback {
    uint32_t(
        "RENDERDOC_ShowReplayUI",
        nullable..void.p("XXX"),
        nativeType = "pRENDERDOC_ShowReplayUI"
    ) {}
}

val pRENDERDOC_SetCaptureTitle = Module.RENDERDOC.callback {
    uint32_t(
        "RENDERDOC_SetCaptureTitle",
        char.const.p("title"),
        nativeType = "pRENDERDOC_SetCaptureTitle"
    ) {}
}
