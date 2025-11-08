/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.renderdoc;

import org.lwjgl.system.*;

public final class RD_Renderdoc {

    private static final SharedLibrary RENDERDOC = Library.loadNative(RD_Renderdoc.class, "org.lwjgl.renderdoc", "renderdoc", true);

    /** Returns the renderdoc {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return RENDERDOC;
    }

    public static final int
        RD_eRENDERDOC_API_Version_1_0_0 = 0x2710,
        RD_eRENDERDOC_API_Version_1_0_1 = 0x2711,
        RD_eRENDERDOC_API_Version_1_0_2 = 0x2712,
        RD_eRENDERDOC_API_Version_1_1_0 = 0x2774,
        RD_eRENDERDOC_API_Version_1_1_1 = 0x2775,
        RD_eRENDERDOC_API_Version_1_1_2 = 0x2776,
        RD_eRENDERDOC_API_Version_1_2_0 = 0x27D8,
        RD_eRENDERDOC_API_Version_1_3_0 = 0x283C,
        RD_eRENDERDOC_API_Version_1_4_0 = 0x28A0,
        RD_eRENDERDOC_API_Version_1_4_1 = 0x28A1,
        RD_eRENDERDOC_API_Version_1_4_2 = 0x28A2,
        RD_eRENDERDOC_API_Version_1_5_0 = 0x2904,
        RD_eRENDERDOC_API_Version_1_6_0 = 0x2968;

    public static final int
        RD_eRENDERDOC_Option_AllowVSync                       = 0x0,
        RD_eRENDERDOC_Option_AllowFullscreen                  = 0x1,
        RD_eRENDERDOC_Option_APIValidation                    = 0x2,
        RD_eRENDERDOC_Option_DebugDeviceMode                  = 0x2,
        RD_eRENDERDOC_Option_CaptureCallstacks                = 0x3,
        RD_eRENDERDOC_Option_CaptureCallstacksOnlyDraws       = 0x4,
        RD_eRENDERDOC_Option_CaptureCallstacksOnlyActions     = 0x4,
        RD_eRENDERDOC_Option_DelayForDebugger                 = 0x5,
        RD_eRENDERDOC_Option_VerifyBufferAccess               = 0x6,
        RD_eRENDERDOC_Option_HookIntoChildren                 = 0x7,
        RD_eRENDERDOC_Option_RefAllResources                  = 0x8,
        RD_eRENDERDOC_Option_SaveAllInitials                  = 0x9,
        RD_eRENDERDOC_Option_CaptureAllCmdLists               = 0xA,
        RD_eRENDERDOC_Option_DebugOutputMute                  = 0xB,
        RD_eRENDERDOC_Option_AllowUnsupportedVendorExtensions = 0xC,
        RD_eRENDERDOC_Option_SoftMemoryLimit                  = 0xD;

    public static final int
        RD_eRENDERDOC_Key_0            = 0x30,
        RD_eRENDERDOC_Key_1            = 0x31,
        RD_eRENDERDOC_Key_2            = 0x32,
        RD_eRENDERDOC_Key_3            = 0x33,
        RD_eRENDERDOC_Key_4            = 0x34,
        RD_eRENDERDOC_Key_5            = 0x35,
        RD_eRENDERDOC_Key_6            = 0x36,
        RD_eRENDERDOC_Key_7            = 0x37,
        RD_eRENDERDOC_Key_8            = 0x38,
        RD_eRENDERDOC_Key_9            = 0x39,
        RD_eRENDERDOC_Key_A            = 0x41,
        RD_eRENDERDOC_Key_B            = 0x42,
        RD_eRENDERDOC_Key_C            = 0x43,
        RD_eRENDERDOC_Key_D            = 0x44,
        RD_eRENDERDOC_Key_E            = 0x45,
        RD_eRENDERDOC_Key_F            = 0x46,
        RD_eRENDERDOC_Key_G            = 0x47,
        RD_eRENDERDOC_Key_H            = 0x48,
        RD_eRENDERDOC_Key_I            = 0x49,
        RD_eRENDERDOC_Key_J            = 0x4A,
        RD_eRENDERDOC_Key_K            = 0x4B,
        RD_eRENDERDOC_Key_L            = 0x4C,
        RD_eRENDERDOC_Key_M            = 0x4D,
        RD_eRENDERDOC_Key_N            = 0x4E,
        RD_eRENDERDOC_Key_O            = 0x4F,
        RD_eRENDERDOC_Key_P            = 0x50,
        RD_eRENDERDOC_Key_Q            = 0x51,
        RD_eRENDERDOC_Key_R            = 0x52,
        RD_eRENDERDOC_Key_S            = 0x53,
        RD_eRENDERDOC_Key_T            = 0x54,
        RD_eRENDERDOC_Key_U            = 0x55,
        RD_eRENDERDOC_Key_V            = 0x56,
        RD_eRENDERDOC_Key_W            = 0x57,
        RD_eRENDERDOC_Key_X            = 0x58,
        RD_eRENDERDOC_Key_Y            = 0x59,
        RD_eRENDERDOC_Key_Z            = 0x5A,
        RD_eRENDERDOC_Key_NonPrintable = 0x100,
        RD_eRENDERDOC_Key_Divide       = 0x101,
        RD_eRENDERDOC_Key_Multiply     = 0x102,
        RD_eRENDERDOC_Key_Subtract     = 0x103,
        RD_eRENDERDOC_Key_Plus         = 0x104,
        RD_eRENDERDOC_Key_F1           = 0x105,
        RD_eRENDERDOC_Key_F2           = 0x106,
        RD_eRENDERDOC_Key_F3           = 0x107,
        RD_eRENDERDOC_Key_F4           = 0x108,
        RD_eRENDERDOC_Key_F5           = 0x109,
        RD_eRENDERDOC_Key_F6           = 0x10A,
        RD_eRENDERDOC_Key_F7           = 0x10B,
        RD_eRENDERDOC_Key_F8           = 0x10C,
        RD_eRENDERDOC_Key_F9           = 0x10D,
        RD_eRENDERDOC_Key_F10          = 0x10E,
        RD_eRENDERDOC_Key_F11          = 0x10F,
        RD_eRENDERDOC_Key_F12          = 0x110,
        RD_eRENDERDOC_Key_Home         = 0x111,
        RD_eRENDERDOC_Key_End          = 0x112,
        RD_eRENDERDOC_Key_Insert       = 0x113,
        RD_eRENDERDOC_Key_Delete       = 0x114,
        RD_eRENDERDOC_Key_PageUp       = 0x115,
        RD_eRENDERDOC_Key_PageDn       = 0x116,
        RD_eRENDERDOC_Key_Backspace    = 0x117,
        RD_eRENDERDOC_Key_Tab          = 0x118,
        RD_eRENDERDOC_Key_PrtScrn      = 0x119,
        RD_eRENDERDOC_Key_Pause        = 0x11A,
        RD_eRENDERDOC_Key_Max          = 0x11B;

    private RD_Renderdoc() {
        throw new UnsupportedOperationException();
    }

}