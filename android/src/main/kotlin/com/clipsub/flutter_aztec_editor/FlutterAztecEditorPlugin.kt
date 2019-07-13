package com.clipsub.flutter_aztec_editor

import android.app.Activity
import android.content.Intent
import android.util.Log
import com.clipsub.flutter_aztec_editor.vendor.FlutterAztecEditorActivity
import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.common.MethodChannel.MethodCallHandler
import io.flutter.plugin.common.MethodChannel.Result
import io.flutter.plugin.common.PluginRegistry.Registrar

class FlutterAztecEditorPlugin constructor(private val activity: Activity) : MethodCallHandler {

  companion object {
    @JvmStatic
    fun registerWith(registrar: Registrar) {
      val channel = MethodChannel(registrar.messenger(), "flutter_aztec_editor")
      channel.setMethodCallHandler(FlutterAztecEditorPlugin(registrar.activity()))
    }
  }

  override fun onMethodCall(call: MethodCall, result: Result) {
    Log.e("Test 2", "Go here")
    if (call.method == "getPlatformVersion") {
      result.success("Android ${android.os.Build.VERSION.RELEASE}")
    } else if (call.method == "openAztecEditorActivity") {
      Log.e("Test", "Go here")
      val intent = Intent(activity, FlutterAztecEditorActivity::class.java)
      activity.startActivity(intent)
    }
  }
}
