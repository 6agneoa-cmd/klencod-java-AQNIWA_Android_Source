package com.aqniwa.game

import android.app.Activity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.view.View
import android.content.pm.ActivityInfo

class MainActivity : Activity() {
  @Suppress("SetJavaScriptEnabled")
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE
    window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_FULLSCREEN or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY or View.SYSTEM_UI_FLAG_LAYOUT_STABLE)
    val web = WebView(this)
    web.settings.javaScriptEnabled = true
    web.settings.domStorageEnabled = true
    web.settings.allowFileAccess = true
    web.webViewClient = WebViewClient()
    web.webChromeClient = WebChromeClient()
    setContentView(web)
    web.loadUrl("file:///android_asset/index.html")
  }
  @Deprecated("Deprecated in Android")
  override fun onBackPressed() { super.onBackPressed() }
}
