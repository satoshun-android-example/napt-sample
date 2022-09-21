package io.github.satoshun.example;

class DaggerAppComponentBridge {
  static AppComponent component() {
    return DaggerAppComponent.create();
  }
}
