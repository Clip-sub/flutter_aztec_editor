import 'dart:async';
import 'package:flutter/foundation.dart';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';

class FlutterAztecEditor extends StatefulWidget {
  // FlutterAztecEditor({ Key key }) : super(key: key)
  @override
  _FlutterAztecEditorState createState() => _FlutterAztecEditorState();
}

class _FlutterAztecEditorState extends State<FlutterAztecEditor> {
  @override
  Widget build(BuildContext context) {
    if (defaultTargetPlatform == TargetPlatform.android) {
      return AndroidView(
        viewType: 'com.clipsub.flutter_aztec_editor/AztecEditor',
      );
    }
    return Text('$defaultTargetPlatform is not yet supported by the text_view plugin');
  }
}
