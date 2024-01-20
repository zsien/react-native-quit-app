package tech.zsien.RNQuitApp

import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

class QuitAppModule(private val reactContext: ReactApplicationContext)
  : ReactContextBaseJavaModule(reactContext) {

  override fun getName() = QuitAppModuleImpl.NAME

  @ReactMethod
  fun quitApp() {
    QuitAppModuleImpl.quitApp(reactContext)
  }
}
