import 'package:flutter/material.dart';
import 'dart:async';

import 'package:flutter_aztec_editor/flutter_aztec_editor.dart';

void main() => runApp(MyApp());

class MyApp extends StatefulWidget {
  @override
  _MyAppState createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  @override
  void initState() {
    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: const Text('Plugin example app'),
        ),
        body: Container(
          color: Colors.black12,
          width: 400,
          height: 600,
          child: RaisedButton(
            elevation: 1,
            child: Text('Montana'),
            onPressed: () {
              FlutterAztecEditor.openAztecEditorActivity();
            },
          ),
        ),
      ),
    );
  }
}
