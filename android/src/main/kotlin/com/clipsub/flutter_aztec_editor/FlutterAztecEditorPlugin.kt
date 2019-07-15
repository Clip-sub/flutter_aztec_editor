package com.clipsub.flutter_aztec_editor

import android.app.Activity
import android.content.Intent
import android.util.Log
import com.clipsub.flutter_aztec_editor.vendor.FlutterAztecEditorActivity
import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.common.MethodChannel.MethodCallHandler
import io.flutter.plugin.common.MethodChannel.Result
import io.flutter.plugin.common.PluginRegistry
import io.flutter.plugin.common.PluginRegistry.Registrar

class FlutterAztecEditorPlugin constructor(private val activity: Activity) : MethodCallHandler,
    PluginRegistry.ActivityResultListener {

  var result: Result? = null

  companion object {
    @JvmStatic
    fun registerWith(registrar: Registrar) {
      val channel = MethodChannel(registrar.messenger(), "flutter_aztec_editor")
      val plugin = FlutterAztecEditorPlugin(registrar.activity())
      channel.setMethodCallHandler(plugin)
      registrar.addActivityResultListener(plugin)
    }
  }

  override fun onMethodCall(call: MethodCall, result: Result) {
    if (call.method == "openAztecEditorActivity") {
      this.result = result
      val intent = Intent(activity, FlutterAztecEditorActivity::class.java)
      activity.startActivityForResult(intent, 69)
    } else {
      result.notImplemented()
    }
  }

  override fun onActivityResult(code: Int, resultCode: Int, data: Intent?): Boolean {
    if (resultCode == 69) {
      val htmlData = data?.getStringExtra("HTML_DATA")
      // htmlData?.let { this.result?.success(htmlData) }
      this.result?.success(htmlData)
    }
    return true
  }
}
