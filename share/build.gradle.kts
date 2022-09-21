plugins {
  id("example.android.library")

  alias(libs.plugins.kotlin.kapt)
}

dependencies {
  implementation(libs.dagger.core)
  kapt(libs.dagger.compiler)
}
