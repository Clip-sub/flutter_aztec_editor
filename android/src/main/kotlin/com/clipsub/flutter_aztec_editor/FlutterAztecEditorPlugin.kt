package com.clipsub.flutter_aztec_editor

import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.common.MethodChannel.MethodCallHandler
import io.flutter.plugin.common.MethodChannel.Result
import io.flutter.plugin.common.PluginRegistry.Registrar

class FlutterAztecEditorPlugin: MethodCallHandler {
  companion object {
    @JvmStatic
    fun registerWith(registrar: Registrar) {
      /* val channel = MethodChannel(registrar.messenger(), "flutter_aztec_editor")
      channel.setMethodCallHandler(FlutterAztecEditorPlugin()) */

      registrar
          .platformViewRegistry()
          .registerViewFactory("com.clipsub.flutter_aztec_editor/AztecEditor", FlutterAztecViewFactory(registrar.messenger()))
    }
  }

  override fun onMethodCall(call: MethodCall, result: Result) {
    if (call.method == "getPlatformVersion") {
      result.success("Android ${android.os.Build.VERSION.RELEASE}")
    } else {
      result.notImplemented()
    }
  }
}
