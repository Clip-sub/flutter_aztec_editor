import 'dart:async';

import 'package:flutter/services.dart';

class FlutterAztecEditor {
  static const MethodChannel _channel =
      const MethodChannel('flutter_aztec_editor');

  static Future<String> get platformVersion async {
    final String version = await _channel.invokeMethod('getPlatformVersion');
    return version;
  }
}
