plugins {
  id("example.android.application")

  alias(libs.plugins.anvil)
  alias(libs.plugins.napt)
}

android {
  defaultConfig {
    applicationId = "io.github.satoshun.example"
    versionCode = 1
    versionName = "1.0"
    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
  }

  buildTypes {
    release {
      isMinifyEnabled = true
      proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
    }
  }

  packagingOptions {
    resources.excludes += listOf(
      "META-INF/AL2.0",
      "META-INF/LGPL2.1"
    )
  }

  buildFeatures {
    compose = true
  }

  composeOptions {
    kotlinCompilerExtensionVersion = libs.versions.composeCompiler.get()
  }

  testOptions {
    unitTests {
      isIncludeAndroidResources = true
    }
  }
}

dependencies {
  implementation(projects.share)

  implementation(libs.bundles.kotlin.android)
  implementation(libs.bundles.android.ui)

  implementation(libs.dagger.core)
  annotationProcessor(libs.dagger.compiler)

  testImplementation(libs.bundles.test)

  androidTestImplementation(libs.bundles.android.test)
  debugImplementation(libs.bundles.android.debug.test)
}
