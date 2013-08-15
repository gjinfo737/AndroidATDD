require 'rspec-expectations'
require 'gametel'

World(Gametel::Navigation)

keystore = {
  :path => File.expand_path('~/.android/debug.keystore'),
  :alias => 'androiddebugkey',
  :password => 'android',
  :keystore_password => 'android'
}

Gametel.apk_path = "../app/bin/AndroidATDD-debug.apk"
Gametel.keystore = keystore

Before do
  @driver = Gametel.start("UserStartActivity")
end

After do
  Gametel.stop
end
