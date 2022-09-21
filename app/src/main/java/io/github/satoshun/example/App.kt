package io.github.satoshun.example

import android.app.Application

class App : Application() {
  override fun onCreate() {
    super.onCreate()
    ComponentHolder.components += DaggerAppComponent.create()
  }
}
