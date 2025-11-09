/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */

package renderdoc

import org.lwjgl.generator.*
import java.io.*

private const val CAPABILITIES_CLASS = "RDCapabilities"

val RENDERDOC_BINDING = Generator.register(object : APIBinding(
    Module.RENDERDOC,
    CAPABILITIES_CLASS,
    APICapabilities.JAVA_CAPABILITIES
) {
    init {
        javaImport(
            "static org.lwjgl.system.APIUtil.*",
            "static org.lwjgl.system.Checks.*"
        )
    }

    override fun generateFunctionAddress(writer: PrintWriter, function: Func) {
        writer.println("$t${t}long $FUNCTION_ADDRESS = RD.getCapabilities().${function.name};")
    }

    override fun PrintWriter.generateJava() {
        generateJavaPreamble()
        println("public final class $CAPABILITIES_CLASS {\n")

        /*
         * The RenderDoc API is exposed as a single RENDERDOC_GetAPI function that returns
         * a statically allocated struct of function pointers. We need to fetch the addresses
         * of all of those functions (except GetAPI) from the returned struct.
         */

        val classes = super.getClasses("RD")
        check(classes.size == 1)
        val addresses = classes.getFunctionPointers().filter { func -> func.name != "GetAPI" }

        println("${t}public final long GetAPI;")

        println("${t}public final long")
        println(addresses.joinToString(",\n$t$t", prefix = "$t$t", postfix = ";\n", transform = Func::name))

        println("${t}public $CAPABILITIES_CLASS(long getAPI, RENDERDOC_API_1_6_0 api) {")
        addresses.forEach { func ->
            println("${t}${t}${func.name} = api.${func.name}();")
        }
        println("${t}${t}GetAPI = getAPI;")
        println("${t}}")
        println("\n}")
    }
})

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