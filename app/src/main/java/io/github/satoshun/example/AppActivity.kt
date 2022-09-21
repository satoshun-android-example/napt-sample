package io.github.satoshun.example

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import io.github.satoshun.example.share.Share
import javax.inject.Inject

class AppActivity : AppCompatActivity() {
  @Inject lateinit var viewModel: AppViewModel

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    ComponentHolder.component<AppComponent>().inject(this)
    println(Share)
    println(viewModel)

    setContent {
      AppTheme {
        AppContent()
      }
    }
  }
}
