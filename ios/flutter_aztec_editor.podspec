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
  s.dependency 'WordPress-Aztec-iOS'

  s.ios.deployment_target = '8.0'
end

