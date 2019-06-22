package com.clipsub.flutter_aztec_editor

import android.content.Context
import io.flutter.plugin.common.BinaryMessenger
import io.flutter.plugin.common.StandardMessageCodec
import io.flutter.plugin.platform.PlatformView
import io.flutter.plugin.platform.PlatformViewFactory

class FlutterAztecViewFactory (private val messenger: BinaryMessenger) : PlatformViewFactory(StandardMessageCodec.INSTANCE) {
  override fun create(context: Context, id: Int, o: Any?): PlatformView {
    return FlutterAztecView(context, messenger, id)
  }
}
