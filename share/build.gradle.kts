plugins {
  id("example.android.library")

  alias(libs.plugins.napt)
}

dependencies {
  implementation(libs.dagger.core)
  annotationProcessor(libs.dagger.compiler)
}
