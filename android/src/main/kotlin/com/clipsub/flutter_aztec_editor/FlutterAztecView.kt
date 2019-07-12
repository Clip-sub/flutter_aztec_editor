package com.clipsub.flutter_aztec_editor

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.view.View
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.widget.EditText
import android.widget.LinearLayout
import androidx.appcompat.widget.AppCompatEditText
import io.flutter.plugin.common.BinaryMessenger
import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.platform.PlatformView
import org.wordpress.aztec.AztecText
import org.wordpress.aztec.source.SourceViewEditText

open class FlutterAztecView internal constructor(context: Context, messenger: BinaryMessenger, id: Int) : PlatformView, MethodChannel.MethodCallHandler {
  override fun onMethodCall(p0: MethodCall, p1: MethodChannel.Result) {

  }

  private val aztecText: AppCompatEditText
  private val methodChannel: MethodChannel

  init {
    aztecText = AppCompatEditText(context)
    aztecText.setText("Yolo Bol 2")
    aztecText.setTextColor(Color.BLUE)
    aztecText.layoutParams = LinearLayout.LayoutParams(MATCH_PARENT, MATCH_PARENT)

    methodChannel = MethodChannel(messenger, "com.clipsub.flutter_aztec_editor/AztecEditor_")
    methodChannel.setMethodCallHandler(this)
  }

  override fun getView(): View {
    return aztecText
  }

  override fun dispose() {
  }
}
