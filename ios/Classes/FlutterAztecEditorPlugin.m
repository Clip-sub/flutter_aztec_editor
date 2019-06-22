#import "FlutterAztecEditorPlugin.h"
#import <flutter_aztec_editor/flutter_aztec_editor-Swift.h>

@implementation FlutterAztecEditorPlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  [SwiftFlutterAztecEditorPlugin registerWithRegistrar:registrar];
}
@end
