/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.renderdoc;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class RD_Renderdoc {

    private static final SharedLibrary RENDERDOC = Library.loadNative(RD_Renderdoc.class, "org.lwjgl.renderdoc", "renderdoc");

    /** Contains the function pointers loaded from the renderdoc {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            SetCaptureOptionU32        = apiGetFunctionAddress(RENDERDOC, "SetCaptureOptionU32"),
            SetCaptureOptionF32        = apiGetFunctionAddress(RENDERDOC, "SetCaptureOptionF32"),
            GetCaptureOptionU32        = apiGetFunctionAddress(RENDERDOC, "GetCaptureOptionU32"),
            SetFocusToggleKeys         = apiGetFunctionAddress(RENDERDOC, "SetFocusToggleKeys"),
            SetCaptureKeys             = apiGetFunctionAddress(RENDERDOC, "SetCaptureKeys"),
            GetOverlayBits             = apiGetFunctionAddress(RENDERDOC, "GetOverlayBits"),
            MaskOverlayBits            = apiGetFunctionAddress(RENDERDOC, "MaskOverlayBits"),
            RemoveHooks                = apiGetFunctionAddress(RENDERDOC, "RemoveHooks"),
            UnloadCrashHandler         = apiGetFunctionAddress(RENDERDOC, "UnloadCrashHandler"),
            SetCaptureFilePathTemplate = apiGetFunctionAddress(RENDERDOC, "SetCaptureFilePathTemplate"),
            GetCaptureFilePathTemplate = apiGetFunctionAddress(RENDERDOC, "GetCaptureFilePathTemplate"),
            GetNumCaptures             = apiGetFunctionAddress(RENDERDOC, "GetNumCaptures"),
            GetCapture                 = apiGetFunctionAddress(RENDERDOC, "GetCapture"),
            SetCaptureFileComments     = apiGetFunctionAddress(RENDERDOC, "SetCaptureFileComments"),
            IsTargetControlConnected   = apiGetFunctionAddress(RENDERDOC, "IsTargetControlConnected"),
            LaunchReplayUI             = apiGetFunctionAddress(RENDERDOC, "LaunchReplayUI"),
            GetCaptureOptionF32        = apiGetFunctionAddress(RENDERDOC, "GetCaptureOptionF32"),
            GetAPI                     = apiGetFunctionAddress(RENDERDOC, "GetAPI"),
            GetAPIVersion              = apiGetFunctionAddress(RENDERDOC, "GetAPIVersion"),
            ShowReplayUI               = apiGetFunctionAddress(RENDERDOC, "ShowReplayUI"),
            SetActiveWindow            = apiGetFunctionAddress(RENDERDOC, "SetActiveWindow"),
            TriggerCapture             = apiGetFunctionAddress(RENDERDOC, "TriggerCapture"),
            TriggerMultiFrameCapture   = apiGetFunctionAddress(RENDERDOC, "TriggerMultiFrameCapture"),
            StartFrameCapture          = apiGetFunctionAddress(RENDERDOC, "StartFrameCapture"),
            IsFrameCapturing           = apiGetFunctionAddress(RENDERDOC, "IsFrameCapturing"),
            EndFrameCapture            = apiGetFunctionAddress(RENDERDOC, "EndFrameCapture"),
            DiscardFrameCapture        = apiGetFunctionAddress(RENDERDOC, "DiscardFrameCapture"),
            SetCaptureTitle            = apiGetFunctionAddress(RENDERDOC, "SetCaptureTitle");

    }

    /** Returns the renderdoc {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return RENDERDOC;
    }

    public static final int
        eRENDERDOC_API_Version_1_0_0 = 0x2710,
        eRENDERDOC_API_Version_1_0_1 = 0x2711,
        eRENDERDOC_API_Version_1_0_2 = 0x2712,
        eRENDERDOC_API_Version_1_1_0 = 0x2774,
        eRENDERDOC_API_Version_1_1_1 = 0x2775,
        eRENDERDOC_API_Version_1_1_2 = 0x2776,
        eRENDERDOC_API_Version_1_2_0 = 0x27D8,
        eRENDERDOC_API_Version_1_3_0 = 0x283C,
        eRENDERDOC_API_Version_1_4_0 = 0x28A0,
        eRENDERDOC_API_Version_1_4_1 = 0x28A1,
        eRENDERDOC_API_Version_1_4_2 = 0x28A2,
        eRENDERDOC_API_Version_1_5_0 = 0x2904,
        eRENDERDOC_API_Version_1_6_0 = 0x2968;

    public static final int
        eRENDERDOC_Option_AllowVSync                       = 0x0,
        eRENDERDOC_Option_AllowFullscreen                  = 0x1,
        eRENDERDOC_Option_APIValidation                    = 0x2,
        eRENDERDOC_Option_DebugDeviceMode                  = 0x2,
        eRENDERDOC_Option_CaptureCallstacks                = 0x3,
        eRENDERDOC_Option_CaptureCallstacksOnlyDraws       = 0x4,
        eRENDERDOC_Option_CaptureCallstacksOnlyActions     = 0x4,
        eRENDERDOC_Option_DelayForDebugger                 = 0x5,
        eRENDERDOC_Option_VerifyBufferAccess               = 0x6,
        eRENDERDOC_Option_HookIntoChildren                 = 0x7,
        eRENDERDOC_Option_RefAllResources                  = 0x8,
        eRENDERDOC_Option_SaveAllInitials                  = 0x9,
        eRENDERDOC_Option_CaptureAllCmdLists               = 0xA,
        eRENDERDOC_Option_DebugOutputMute                  = 0xB,
        eRENDERDOC_Option_AllowUnsupportedVendorExtensions = 0xC,
        eRENDERDOC_Option_SoftMemoryLimit                  = 0xD;

    public static final int
        eRENDERDOC_Key_0            = 0x30,
        eRENDERDOC_Key_1            = 0x31,
        eRENDERDOC_Key_2            = 0x32,
        eRENDERDOC_Key_3            = 0x33,
        eRENDERDOC_Key_4            = 0x34,
        eRENDERDOC_Key_5            = 0x35,
        eRENDERDOC_Key_6            = 0x36,
        eRENDERDOC_Key_7            = 0x37,
        eRENDERDOC_Key_8            = 0x38,
        eRENDERDOC_Key_9            = 0x39,
        eRENDERDOC_Key_A            = 0x41,
        eRENDERDOC_Key_B            = 0x42,
        eRENDERDOC_Key_C            = 0x43,
        eRENDERDOC_Key_D            = 0x44,
        eRENDERDOC_Key_E            = 0x45,
        eRENDERDOC_Key_F            = 0x46,
        eRENDERDOC_Key_G            = 0x47,
        eRENDERDOC_Key_H            = 0x48,
        eRENDERDOC_Key_I            = 0x49,
        eRENDERDOC_Key_J            = 0x4A,
        eRENDERDOC_Key_K            = 0x4B,
        eRENDERDOC_Key_L            = 0x4C,
        eRENDERDOC_Key_M            = 0x4D,
        eRENDERDOC_Key_N            = 0x4E,
        eRENDERDOC_Key_O            = 0x4F,
        eRENDERDOC_Key_P            = 0x50,
        eRENDERDOC_Key_Q            = 0x51,
        eRENDERDOC_Key_R            = 0x52,
        eRENDERDOC_Key_S            = 0x53,
        eRENDERDOC_Key_T            = 0x54,
        eRENDERDOC_Key_U            = 0x55,
        eRENDERDOC_Key_V            = 0x56,
        eRENDERDOC_Key_W            = 0x57,
        eRENDERDOC_Key_X            = 0x58,
        eRENDERDOC_Key_Y            = 0x59,
        eRENDERDOC_Key_Z            = 0x5A,
        eRENDERDOC_Key_NonPrintable = 0x100,
        eRENDERDOC_Key_Divide       = 0x101,
        eRENDERDOC_Key_Multiply     = 0x102,
        eRENDERDOC_Key_Subtract     = 0x103,
        eRENDERDOC_Key_Plus         = 0x104,
        eRENDERDOC_Key_F1           = 0x105,
        eRENDERDOC_Key_F2           = 0x106,
        eRENDERDOC_Key_F3           = 0x107,
        eRENDERDOC_Key_F4           = 0x108,
        eRENDERDOC_Key_F5           = 0x109,
        eRENDERDOC_Key_F6           = 0x10A,
        eRENDERDOC_Key_F7           = 0x10B,
        eRENDERDOC_Key_F8           = 0x10C,
        eRENDERDOC_Key_F9           = 0x10D,
        eRENDERDOC_Key_F10          = 0x10E,
        eRENDERDOC_Key_F11          = 0x10F,
        eRENDERDOC_Key_F12          = 0x110,
        eRENDERDOC_Key_Home         = 0x111,
        eRENDERDOC_Key_End          = 0x112,
        eRENDERDOC_Key_Insert       = 0x113,
        eRENDERDOC_Key_Delete       = 0x114,
        eRENDERDOC_Key_PageUp       = 0x115,
        eRENDERDOC_Key_PageDn       = 0x116,
        eRENDERDOC_Key_Backspace    = 0x117,
        eRENDERDOC_Key_Tab          = 0x118,
        eRENDERDOC_Key_PrtScrn      = 0x119,
        eRENDERDOC_Key_Pause        = 0x11A,
        eRENDERDOC_Key_Max          = 0x11B;

    protected RD_Renderdoc() {
        throw new UnsupportedOperationException();
    }

    // --- [ SetCaptureOptionU32 ] ---

    /** {@code int SetCaptureOptionU32(unsigned int option, uint32_t value)} */
    public static int SetCaptureOptionU32(@NativeType("unsigned int") int option, @NativeType("uint32_t") int value) {
        long __functionAddress = Functions.SetCaptureOptionU32;
        return invokeI(option, value, __functionAddress);
    }

    // --- [ SetCaptureOptionF32 ] ---

    /** {@code int SetCaptureOptionF32(unsigned int option, float value)} */
    public static int SetCaptureOptionF32(@NativeType("unsigned int") int option, float value) {
        long __functionAddress = Functions.SetCaptureOptionF32;
        return invokeI(option, value, __functionAddress);
    }

    // --- [ GetCaptureOptionU32 ] ---

    /** {@code uint32_t GetCaptureOptionU32(unsigned int option)} */
    @NativeType("uint32_t")
    public static int GetCaptureOptionU32(@NativeType("unsigned int") int option) {
        long __functionAddress = Functions.GetCaptureOptionU32;
        return invokeI(option, __functionAddress);
    }

    // --- [ SetFocusToggleKeys ] ---

    /** {@code void SetFocusToggleKeys(unsigned int * keys, int count)} */
    public static void nSetFocusToggleKeys(long keys, int count) {
        long __functionAddress = Functions.SetFocusToggleKeys;
        invokePV(keys, count, __functionAddress);
    }

    /** {@code void SetFocusToggleKeys(unsigned int * keys, int count)} */
    public static void SetFocusToggleKeys(@NativeType("unsigned int *") @Nullable IntBuffer keys) {
        nSetFocusToggleKeys(memAddressSafe(keys), remainingSafe(keys));
    }

    // --- [ SetCaptureKeys ] ---

    /** {@code void SetCaptureKeys(unsigned int * keys, int count)} */
    public static void nSetCaptureKeys(long keys, int count) {
        long __functionAddress = Functions.SetCaptureKeys;
        invokePV(keys, count, __functionAddress);
    }

    /** {@code void SetCaptureKeys(unsigned int * keys, int count)} */
    public static void SetCaptureKeys(@NativeType("unsigned int *") @Nullable IntBuffer keys) {
        nSetCaptureKeys(memAddressSafe(keys), remainingSafe(keys));
    }

    // --- [ GetOverlayBits ] ---

    /** {@code uint32_t GetOverlayBits(void)} */
    @NativeType("uint32_t")
    public static int GetOverlayBits() {
        long __functionAddress = Functions.GetOverlayBits;
        return invokeI(__functionAddress);
    }

    // --- [ MaskOverlayBits ] ---

    /** {@code void MaskOverlayBits(uint32_t and, uint32_t or)} */
    public static void MaskOverlayBits(@NativeType("uint32_t") int and, @NativeType("uint32_t") int or) {
        long __functionAddress = Functions.MaskOverlayBits;
        invokeV(and, or, __functionAddress);
    }

    // --- [ RemoveHooks ] ---

    /** {@code void RemoveHooks(void)} */
    public static void RemoveHooks() {
        long __functionAddress = Functions.RemoveHooks;
        invokeV(__functionAddress);
    }

    // --- [ UnloadCrashHandler ] ---

    /** {@code void UnloadCrashHandler(void)} */
    public static void UnloadCrashHandler() {
        long __functionAddress = Functions.UnloadCrashHandler;
        invokeV(__functionAddress);
    }

    // --- [ SetCaptureFilePathTemplate ] ---

    /** {@code void SetCaptureFilePathTemplate(char const * filetemplate)} */
    public static void nSetCaptureFilePathTemplate(long filetemplate) {
        long __functionAddress = Functions.SetCaptureFilePathTemplate;
        invokePV(filetemplate, __functionAddress);
    }

    /** {@code void SetCaptureFilePathTemplate(char const * filetemplate)} */
    public static void SetCaptureFilePathTemplate(@NativeType("char const *") ByteBuffer filetemplate) {
        if (CHECKS) {
            checkNT1(filetemplate);
        }
        nSetCaptureFilePathTemplate(memAddress(filetemplate));
    }

    /** {@code void SetCaptureFilePathTemplate(char const * filetemplate)} */
    public static void SetCaptureFilePathTemplate(@NativeType("char const *") CharSequence filetemplate) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filetemplate, true);
            long filetemplateEncoded = stack.getPointerAddress();
            nSetCaptureFilePathTemplate(filetemplateEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ GetCaptureFilePathTemplate ] ---

    /** {@code char const * GetCaptureFilePathTemplate(void)} */
    public static long nGetCaptureFilePathTemplate() {
        long __functionAddress = Functions.GetCaptureFilePathTemplate;
        return invokeP(__functionAddress);
    }

    /** {@code char const * GetCaptureFilePathTemplate(void)} */
    @NativeType("char const *")
    public static @Nullable String GetCaptureFilePathTemplate() {
        long __result = nGetCaptureFilePathTemplate();
        return memUTF8Safe(__result);
    }

    // --- [ GetNumCaptures ] ---

    /** {@code uint32_t GetNumCaptures(void)} */
    @NativeType("uint32_t")
    public static int GetNumCaptures() {
        long __functionAddress = Functions.GetNumCaptures;
        return invokeI(__functionAddress);
    }

    // --- [ GetCapture ] ---

    /** {@code uint32_t GetCapture(uint32_t index, char * filename, uint32_t * pathlength, uint64_t * timestamp)} */
    public static int nGetCapture(int index, long filename, long pathlength, long timestamp) {
        long __functionAddress = Functions.GetCapture;
        return invokePPPI(index, filename, pathlength, timestamp, __functionAddress);
    }

    /** {@code uint32_t GetCapture(uint32_t index, char * filename, uint32_t * pathlength, uint64_t * timestamp)} */
    @NativeType("uint32_t")
    public static int GetCapture(@NativeType("uint32_t") int index, @NativeType("char *") ByteBuffer filename, @NativeType("uint32_t *") IntBuffer pathlength, @NativeType("uint64_t *") LongBuffer timestamp) {
        if (CHECKS) {
            checkNT1(filename);
            check(pathlength, 1);
            check(timestamp, 1);
        }
        return nGetCapture(index, memAddress(filename), memAddress(pathlength), memAddress(timestamp));
    }

    // --- [ SetCaptureFileComments ] ---

    /** {@code void SetCaptureFileComments(char const * file, char const * comments)} */
    public static void nSetCaptureFileComments(long file, long comments) {
        long __functionAddress = Functions.SetCaptureFileComments;
        invokePPV(file, comments, __functionAddress);
    }

    /** {@code void SetCaptureFileComments(char const * file, char const * comments)} */
    public static void SetCaptureFileComments(@NativeType("char const *") ByteBuffer file, @NativeType("char const *") ByteBuffer comments) {
        if (CHECKS) {
            checkNT1(file);
            checkNT1(comments);
        }
        nSetCaptureFileComments(memAddress(file), memAddress(comments));
    }

    /** {@code void SetCaptureFileComments(char const * file, char const * comments)} */
    public static void SetCaptureFileComments(@NativeType("char const *") CharSequence file, @NativeType("char const *") CharSequence comments) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(file, true);
            long fileEncoded = stack.getPointerAddress();
            stack.nUTF8(comments, true);
            long commentsEncoded = stack.getPointerAddress();
            nSetCaptureFileComments(fileEncoded, commentsEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ IsTargetControlConnected ] ---

    /** {@code uint32_t IsTargetControlConnected(void)} */
    @NativeType("uint32_t")
    public static int IsTargetControlConnected() {
        long __functionAddress = Functions.IsTargetControlConnected;
        return invokeI(__functionAddress);
    }

    // --- [ LaunchReplayUI ] ---

    /** {@code uint32_t LaunchReplayUI(uint32_t connectTargetControl, char const * cmdline)} */
    public static int nLaunchReplayUI(int connectTargetControl, long cmdline) {
        long __functionAddress = Functions.LaunchReplayUI;
        return invokePI(connectTargetControl, cmdline, __functionAddress);
    }

    /** {@code uint32_t LaunchReplayUI(uint32_t connectTargetControl, char const * cmdline)} */
    @NativeType("uint32_t")
    public static int LaunchReplayUI(@NativeType("uint32_t") int connectTargetControl, @NativeType("char const *") ByteBuffer cmdline) {
        if (CHECKS) {
            checkNT1(cmdline);
        }
        return nLaunchReplayUI(connectTargetControl, memAddress(cmdline));
    }

    /** {@code uint32_t LaunchReplayUI(uint32_t connectTargetControl, char const * cmdline)} */
    @NativeType("uint32_t")
    public static int LaunchReplayUI(@NativeType("uint32_t") int connectTargetControl, @NativeType("char const *") CharSequence cmdline) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(cmdline, true);
            long cmdlineEncoded = stack.getPointerAddress();
            return nLaunchReplayUI(connectTargetControl, cmdlineEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ GetCaptureOptionF32 ] ---

    /** {@code float GetCaptureOptionF32(unsigned int option)} */
    public static float GetCaptureOptionF32(@NativeType("unsigned int") int option) {
        long __functionAddress = Functions.GetCaptureOptionF32;
        return invokeF(option, __functionAddress);
    }

    // --- [ GetAPI ] ---

    /** {@code void GetAPI(RENDERDOC_Version version, void ** outPointers)} */
    public static void nGetAPI(int version, long outPointers) {
        long __functionAddress = Functions.GetAPI;
        invokePV(version, outPointers, __functionAddress);
    }

    /** {@code void GetAPI(RENDERDOC_Version version, void ** outPointers)} */
    public static void GetAPI(@NativeType("RENDERDOC_Version") int version, @NativeType("void **") PointerBuffer outPointers) {
        nGetAPI(version, memAddress(outPointers));
    }

    // --- [ GetAPIVersion ] ---

    /** {@code void GetAPIVersion(int * major, int * minor, int * patch)} */
    public static void nGetAPIVersion(long major, long minor, long patch) {
        long __functionAddress = Functions.GetAPIVersion;
        invokePPPV(major, minor, patch, __functionAddress);
    }

    /** {@code void GetAPIVersion(int * major, int * minor, int * patch)} */
    public static void GetAPIVersion(@NativeType("int *") IntBuffer major, @NativeType("int *") IntBuffer minor, @NativeType("int *") IntBuffer patch) {
        if (CHECKS) {
            check(major, 1);
            check(minor, 1);
            check(patch, 1);
        }
        nGetAPIVersion(memAddress(major), memAddress(minor), memAddress(patch));
    }

    // --- [ ShowReplayUI ] ---

    /** {@code uint32_t ShowReplayUI(void)} */
    @NativeType("uint32_t")
    public static int ShowReplayUI() {
        long __functionAddress = Functions.ShowReplayUI;
        return invokeI(__functionAddress);
    }

    // --- [ SetActiveWindow ] ---

    /** {@code void SetActiveWindow(void * device, void * wndHandle)} */
    public static void SetActiveWindow(@NativeType("void *") long device, @NativeType("void *") long wndHandle) {
        long __functionAddress = Functions.SetActiveWindow;
        if (CHECKS) {
            check(device);
            check(wndHandle);
        }
        invokePPV(device, wndHandle, __functionAddress);
    }

    // --- [ TriggerCapture ] ---

    /** {@code void TriggerCapture(void)} */
    public static void TriggerCapture() {
        long __functionAddress = Functions.TriggerCapture;
        invokeV(__functionAddress);
    }

    // --- [ TriggerMultiFrameCapture ] ---

    /** {@code void TriggerMultiFrameCapture(uint32_t numFrames)} */
    public static void TriggerMultiFrameCapture(@NativeType("uint32_t") int numFrames) {
        long __functionAddress = Functions.TriggerMultiFrameCapture;
        invokeV(numFrames, __functionAddress);
    }

    // --- [ StartFrameCapture ] ---

    /** {@code void StartFrameCapture(void * device, void * wndHandle)} */
    public static void StartFrameCapture(@NativeType("void *") long device, @NativeType("void *") long wndHandle) {
        long __functionAddress = Functions.StartFrameCapture;
        if (CHECKS) {
            check(device);
            check(wndHandle);
        }
        invokePPV(device, wndHandle, __functionAddress);
    }

    // --- [ IsFrameCapturing ] ---

    /** {@code uint32_t IsFrameCapturing(void)} */
    @NativeType("uint32_t")
    public static int IsFrameCapturing() {
        long __functionAddress = Functions.IsFrameCapturing;
        return invokeI(__functionAddress);
    }

    // --- [ EndFrameCapture ] ---

    /** {@code uint32_t EndFrameCapture(void * device, void * wndHandle)} */
    @NativeType("uint32_t")
    public static int EndFrameCapture(@NativeType("void *") long device, @NativeType("void *") long wndHandle) {
        long __functionAddress = Functions.EndFrameCapture;
        if (CHECKS) {
            check(device);
            check(wndHandle);
        }
        return invokePPI(device, wndHandle, __functionAddress);
    }

    // --- [ DiscardFrameCapture ] ---

    /** {@code uint32_t DiscardFrameCapture(void * device, void * wndHandle)} */
    @NativeType("uint32_t")
    public static int DiscardFrameCapture(@NativeType("void *") long device, @NativeType("void *") long wndHandle) {
        long __functionAddress = Functions.DiscardFrameCapture;
        if (CHECKS) {
            check(device);
            check(wndHandle);
        }
        return invokePPI(device, wndHandle, __functionAddress);
    }

    // --- [ SetCaptureTitle ] ---

    /** {@code void SetCaptureTitle(char const * title)} */
    public static void nSetCaptureTitle(long title) {
        long __functionAddress = Functions.SetCaptureTitle;
        invokePV(title, __functionAddress);
    }

    /** {@code void SetCaptureTitle(char const * title)} */
    public static void SetCaptureTitle(@NativeType("char const *") ByteBuffer title) {
        if (CHECKS) {
            checkNT1(title);
        }
        nSetCaptureTitle(memAddress(title));
    }

}