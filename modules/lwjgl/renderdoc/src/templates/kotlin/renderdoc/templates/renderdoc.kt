/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */

package renderdoc.templates

import org.lwjgl.generator.*
import renderdoc.RENDERDOC_BINDING

val renderdoc = "RD_Renderdoc".nativeClass(Module.RENDERDOC, prefix = "RD_", prefixConstant = "RD_", binding = RENDERDOC_BINDING) {
    EnumConstant(
        "eRENDERDOC_API_Version_1_0_0".enum(10000),
        "eRENDERDOC_API_Version_1_0_1".enum(10001),
        "eRENDERDOC_API_Version_1_0_2".enum(10002),
        "eRENDERDOC_API_Version_1_1_0".enum(10100),
        "eRENDERDOC_API_Version_1_1_1".enum(10101),
        "eRENDERDOC_API_Version_1_1_2".enum(10102),
        "eRENDERDOC_API_Version_1_2_0".enum(10200),
        "eRENDERDOC_API_Version_1_3_0".enum(10300),
        "eRENDERDOC_API_Version_1_4_0".enum(10400),
        "eRENDERDOC_API_Version_1_4_1".enum(10401),
        "eRENDERDOC_API_Version_1_4_2".enum(10402),
        "eRENDERDOC_API_Version_1_5_0".enum(10500),
        "eRENDERDOC_API_Version_1_6_0".enum(10600),
    )

    EnumConstant(
        "eRENDERDOC_Option_AllowVSync".enum(0),
        "eRENDERDOC_Option_AllowFullscreen".enum(1),
        "eRENDERDOC_Option_APIValidation".enum(2),
        "eRENDERDOC_Option_DebugDeviceMode".enum(2),
        "eRENDERDOC_Option_CaptureCallstacks".enum(3),
        "eRENDERDOC_Option_CaptureCallstacksOnlyDraws".enum(4),
        "eRENDERDOC_Option_CaptureCallstacksOnlyActions".enum(4),
        "eRENDERDOC_Option_DelayForDebugger".enum(5),
        "eRENDERDOC_Option_VerifyBufferAccess".enum(6),
        "eRENDERDOC_Option_HookIntoChildren".enum(7),
        "eRENDERDOC_Option_RefAllResources".enum(8),
        "eRENDERDOC_Option_SaveAllInitials".enum(9),
        "eRENDERDOC_Option_CaptureAllCmdLists".enum(10),
        "eRENDERDOC_Option_DebugOutputMute".enum(11),
        "eRENDERDOC_Option_AllowUnsupportedVendorExtensions".enum(12),
        "eRENDERDOC_Option_SoftMemoryLimit".enum(13),
    )

    EnumConstant(
        // '0' - '9' matches ASCII values
        "eRENDERDOC_Key_0".enum(0x30),
        "eRENDERDOC_Key_1".enum(0x31),
        "eRENDERDOC_Key_2".enum(0x32),
        "eRENDERDOC_Key_3".enum(0x33),
        "eRENDERDOC_Key_4".enum(0x34),
        "eRENDERDOC_Key_5".enum(0x35),
        "eRENDERDOC_Key_6".enum(0x36),
        "eRENDERDOC_Key_7".enum(0x37),
        "eRENDERDOC_Key_8".enum(0x38),
        "eRENDERDOC_Key_9".enum(0x39),

        // 'A' - 'Z' matches ASCII values
        "eRENDERDOC_Key_A".enum(0x41),
        "eRENDERDOC_Key_B".enum(0x42),
        "eRENDERDOC_Key_C".enum(0x43),
        "eRENDERDOC_Key_D".enum(0x44),
        "eRENDERDOC_Key_E".enum(0x45),
        "eRENDERDOC_Key_F".enum(0x46),
        "eRENDERDOC_Key_G".enum(0x47),
        "eRENDERDOC_Key_H".enum(0x48),
        "eRENDERDOC_Key_I".enum(0x49),
        "eRENDERDOC_Key_J".enum(0x4A),
        "eRENDERDOC_Key_K".enum(0x4B),
        "eRENDERDOC_Key_L".enum(0x4C),
        "eRENDERDOC_Key_M".enum(0x4D),
        "eRENDERDOC_Key_N".enum(0x4E),
        "eRENDERDOC_Key_O".enum(0x4F),
        "eRENDERDOC_Key_P".enum(0x50),
        "eRENDERDOC_Key_Q".enum(0x51),
        "eRENDERDOC_Key_R".enum(0x52),
        "eRENDERDOC_Key_S".enum(0x53),
        "eRENDERDOC_Key_T".enum(0x54),
        "eRENDERDOC_Key_U".enum(0x55),
        "eRENDERDOC_Key_V".enum(0x56),
        "eRENDERDOC_Key_W".enum(0x57),
        "eRENDERDOC_Key_X".enum(0x58),
        "eRENDERDOC_Key_Y".enum(0x59),
        "eRENDERDOC_Key_Z".enum(0x5A),

        // leave the rest of the ASCII range free
        // in case we want to use it later
        "eRENDERDOC_Key_NonPrintable".enum(0x100),

        "eRENDERDOC_Key_Divide".enum(0x101),
        "eRENDERDOC_Key_Multiply".enum(0x102),
        "eRENDERDOC_Key_Subtract".enum(0x103),
        "eRENDERDOC_Key_Plus".enum(0x104),

        "eRENDERDOC_Key_F1".enum(0x105),
        "eRENDERDOC_Key_F2".enum(0x106),
        "eRENDERDOC_Key_F3".enum(0x107),
        "eRENDERDOC_Key_F4".enum(0x108),
        "eRENDERDOC_Key_F5".enum(0x109),
        "eRENDERDOC_Key_F6".enum(0x10A),
        "eRENDERDOC_Key_F7".enum(0x10B),
        "eRENDERDOC_Key_F8".enum(0x10C),
        "eRENDERDOC_Key_F9".enum(0x10D),
        "eRENDERDOC_Key_F10".enum(0x10E),
        "eRENDERDOC_Key_F11".enum(0x10F),
        "eRENDERDOC_Key_F12".enum(0x110),

        "eRENDERDOC_Key_Home".enum(0x111),
        "eRENDERDOC_Key_End".enum(0x112),
        "eRENDERDOC_Key_Insert".enum(0x113),
        "eRENDERDOC_Key_Delete".enum(0x114),
        "eRENDERDOC_Key_PageUp".enum(0x115),
        "eRENDERDOC_Key_PageDn".enum(0x116),

        "eRENDERDOC_Key_Backspace".enum(0x117),
        "eRENDERDOC_Key_Tab".enum(0x118),
        "eRENDERDOC_Key_PrtScrn".enum(0x119),
        "eRENDERDOC_Key_Pause".enum(0x11A),

        "eRENDERDOC_Key_Max".enum(0x11B),
    )
}
