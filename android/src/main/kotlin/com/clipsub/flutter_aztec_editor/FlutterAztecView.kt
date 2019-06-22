package com.clipsub.flutter_aztec_editor

import android.content.Context
import android.view.View
import io.flutter.plugin.common.BinaryMessenger
import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.platform.PlatformView
import org.wordpress.aztec.AztecText

open class FlutterAztecView internal constructor(context: Context, messenger: BinaryMessenger, id: Int) : PlatformView, MethodChannel.MethodCallHandler {
  private val aztecText: AztecText

  init {
    aztecText = AztecText(context)
  }

  override fun getView(): View {
    return aztecText
  }

  override fun dispose() {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun onMethodCall(methodCall: MethodCall?, p1: MethodChannel.Result?) {
    when (methodCall) {

    }
  }
}
