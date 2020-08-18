#
# To learn more about a Podspec see http://guides.cocoapods.org/syntax/podspec.html
#
Pod::Spec.new do |s|
  s.name             = 'flutter_aztec_editor'
  s.version          = '1.0.0'
  s.summary          = 'A new flutter plugin project.'
  s.description      = <<-DESC
A new flutter plugin project.
                       DESC
  s.homepage         = 'https://doko.aniviet.com'
  s.license          = { :file => '../LICENSE' }
  s.author           = { 'Clip-sub' => 'doraemonfanclub@gmail.com' }
  s.source           = { :path => '.' }
  s.source_files = 'Classes/**/*'
  s.public_header_files = 'Classes/**/*.h'
  s.dependency 'Flutter'
  s.dependency 'WordPress-Aztec-iOS', '1.8.0'

  s.ios.deployment_target = '10.0'
  s.xcconfig = {'OTHER_LDFLAGS' => '-lxml2', 'HEADER_SEARCH_PATHS' => '$(SDKROOT)/usr/include/libxml2/**'}
end
