/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */

package renderdoc

import org.lwjgl.generator.*

val RENDERDOC_BINDING = simpleBinding(Module.RENDERDOC)

val RENDERDOC_Version = IntegerType("RENDERDOC_Version", PrimitiveMapping.INT)

val RENDERDOC_API_1_6_0 = struct(Module.RENDERDOC, "RENDERDOC_API_1_6_0") {
    opaque_p("GetAPIVersion")
    opaque_p("SetCaptureOptionU32")
    opaque_p("SetCaptureOptionF32")
    opaque_p("GetCaptureOptionU32")
    opaque_p("GetCaptureOptionF32")
    opaque_p("SetFocusToggleKeys")
    opaque_p("SetCaptureKeys")
    opaque_p("GetOverlayBits")
    opaque_p("MaskOverlayBits")
    opaque_p("RemoveHooks")
    opaque_p("UnloadCrashHandler")
    opaque_p("SetCaptureFilePathTemplate")
    opaque_p("GetCaptureFilePathTemplate")
    opaque_p("GetNumCaptures")
    opaque_p("GetCapture")
    opaque_p("TriggerCapture")
    opaque_p("IsTargetControlConnected")
    opaque_p("LaunchReplayUI")
    opaque_p("SetActiveWindow")
    opaque_p("StartFrameCapture")
    opaque_p("IsFrameCapturing")
    opaque_p("EndFrameCapture")
    opaque_p("TriggerMultiFrameCapture")
    opaque_p("SetCaptureFileComments")
    opaque_p("DiscardFrameCapture")
    opaque_p("ShowReplayUI")
    opaque_p("SetCaptureTitle")
}