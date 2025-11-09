/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.renderdoc;

import org.lwjgl.system.*;
import java.util.Set;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;

public final class RDCapabilities {

    public final long GetAPI;
    public final long
        SetCaptureOptionU32,
        SetCaptureOptionF32,
        GetCaptureOptionU32,
        SetFocusToggleKeys,
        SetCaptureKeys,
        GetOverlayBits,
        MaskOverlayBits,
        RemoveHooks,
        UnloadCrashHandler,
        SetCaptureFilePathTemplate,
        GetCaptureFilePathTemplate,
        GetNumCaptures,
        GetCapture,
        SetCaptureFileComments,
        IsTargetControlConnected,
        LaunchReplayUI,
        GetCaptureOptionF32,
        GetAPIVersion,
        ShowReplayUI,
        SetActiveWindow,
        TriggerCapture,
        TriggerMultiFrameCapture,
        StartFrameCapture,
        IsFrameCapturing,
        EndFrameCapture,
        DiscardFrameCapture,
        SetCaptureTitle;

    public RDCapabilities(long getAPI, RENDERDOC_API_1_6_0 api) {
        SetCaptureOptionU32 = api.SetCaptureOptionU32();
        SetCaptureOptionF32 = api.SetCaptureOptionF32();
        GetCaptureOptionU32 = api.GetCaptureOptionU32();
        SetFocusToggleKeys = api.SetFocusToggleKeys();
        SetCaptureKeys = api.SetCaptureKeys();
        GetOverlayBits = api.GetOverlayBits();
        MaskOverlayBits = api.MaskOverlayBits();
        RemoveHooks = api.RemoveHooks();
        UnloadCrashHandler = api.UnloadCrashHandler();
        SetCaptureFilePathTemplate = api.SetCaptureFilePathTemplate();
        GetCaptureFilePathTemplate = api.GetCaptureFilePathTemplate();
        GetNumCaptures = api.GetNumCaptures();
        GetCapture = api.GetCapture();
        SetCaptureFileComments = api.SetCaptureFileComments();
        IsTargetControlConnected = api.IsTargetControlConnected();
        LaunchReplayUI = api.LaunchReplayUI();
        GetCaptureOptionF32 = api.GetCaptureOptionF32();
        GetAPIVersion = api.GetAPIVersion();
        ShowReplayUI = api.ShowReplayUI();
        SetActiveWindow = api.SetActiveWindow();
        TriggerCapture = api.TriggerCapture();
        TriggerMultiFrameCapture = api.TriggerMultiFrameCapture();
        StartFrameCapture = api.StartFrameCapture();
        IsFrameCapturing = api.IsFrameCapturing();
        EndFrameCapture = api.EndFrameCapture();
        DiscardFrameCapture = api.DiscardFrameCapture();
        SetCaptureTitle = api.SetCaptureTitle();
        GetAPI = getAPI;
    }

}
