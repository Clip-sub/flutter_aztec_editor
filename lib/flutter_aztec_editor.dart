import 'dart:async';
import 'package:flutter/services.dart';

class FlutterAztecEditor {
  static const MethodChannel _channel =
      const MethodChannel('flutter_aztec_editor');

  static Future openAztecEditorActivity() async {
    await _channel.invokeMethod("openAztecEditorActivity");
  }
}
