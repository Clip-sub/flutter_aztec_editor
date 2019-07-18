import Flutter
import UIKit

public class SwiftFlutterAztecEditorPlugin: NSObject, FlutterPlugin {
  var hostViewController: UIViewController?
    
  public static func register(with registrar: FlutterPluginRegistrar) {
    let channel = FlutterMethodChannel(name: "flutter_aztec_editor", binaryMessenger: registrar.messenger())
    let instance = SwiftFlutterAztecEditorPlugin()
    instance.hostViewController = UIApplication.shared.keyWindow?.rootViewController
    
    registrar.addMethodCallDelegate(instance, channel: channel)
  }

  public func handle(_ call: FlutterMethodCall, result: @escaping FlutterResult) {
    result("iOS " + UIDevice.current.systemVersion)
    if (call.method == "openAztecEditorActivity") {
        
        /* UIView.animate(withDuration: 0.5) {
            // self.window?.rootViewController = nil
        } */
    }
  }
}
