package com.clipsub.flutter_aztec_editor.vendor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.clipsub.flutter_aztec_editor.R
import org.wordpress.aztec.Aztec
import org.wordpress.aztec.AztecText
import org.wordpress.aztec.ITextFormat
import org.wordpress.aztec.source.SourceViewEditText
import org.wordpress.aztec.toolbar.AztecToolbar
import org.wordpress.aztec.toolbar.IAztecToolbarClickListener
import org.xml.sax.Attributes

class FlutterAztecEditorActivity : AppCompatActivity(), IAztecToolbarClickListener {

  protected lateinit var aztec: Aztec

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_flutter_aztec_editor)

    val visualEditor = findViewById<AztecText>(R.id.aztec)
    val sourceEditor = findViewById<SourceViewEditText>(R.id.source)
    val toolbar = findViewById<AztecToolbar>(R.id.formatting_toolbar)

    aztec = Aztec.Factory.with(visualEditor, sourceEditor, toolbar, this)
  }

  override fun onToolbarCollapseButtonClicked() {
  }

  override fun onToolbarExpandButtonClicked() {
  }

  override fun onToolbarFormatButtonClicked(format: ITextFormat, isKeyboardShortcut: Boolean) {
  }

  override fun onToolbarHeadingButtonClicked() {
  }

  override fun onToolbarHtmlButtonClicked() {
    val uploadingPredicate = object : AztecText.AttributePredicate {
      override fun matches(attrs: Attributes): Boolean {
        return attrs.getIndex("uploading") > -1
      }
    }

    val mediaPending = aztec.visualEditor.getAllElementAttributes(uploadingPredicate).isNotEmpty()
    aztec.toolbar.toggleEditorMode()
  }

  override fun onToolbarListButtonClicked() {
  }

  override fun onToolbarMediaButtonClicked(): Boolean {
    return true
  }
}
