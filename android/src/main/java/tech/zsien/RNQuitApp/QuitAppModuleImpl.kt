package tech.zsien.RNQuitApp

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.modules.core.DeviceEventManagerModule

object QuitAppModuleImpl {
  const val NAME = "RNQuitApp"

  fun quitApp(reactContext: ReactApplicationContext) {
    reactContext.getNativeModule(DeviceEventManagerModule::class.java)!!
      .invokeDefaultBackPressHandler()
  }
}
