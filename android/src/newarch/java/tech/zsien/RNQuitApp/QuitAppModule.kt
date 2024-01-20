package tech.zsien.RNQuitApp

import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import tech.zsien.RNQuitApp.NativeQuitAppSpec
import com.facebook.react.modules.core.DeviceEventManagerModule

class QuitAppModule(private val reactContext: ReactApplicationContext)
  : NativeQuitAppSpec(reactContext) {

  override fun getName() = QuitAppModuleImpl.NAME

  override fun quitApp() {
    QuitAppModuleImpl.quitApp(reactContext)
  }
}
