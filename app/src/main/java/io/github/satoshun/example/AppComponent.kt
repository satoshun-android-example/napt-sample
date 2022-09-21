package io.github.satoshun.example

import com.squareup.anvil.annotations.MergeComponent
import javax.inject.Scope
import kotlin.reflect.KClass

@SingleIn(AppScope::class)
@MergeComponent(AppScope::class)
interface AppComponent {
  fun inject(activity: AppActivity)

  fun loggedInComponent(): LoggedInComponent
}

abstract class AppScope private constructor()

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class SingleIn(val clazz: KClass<*>)

object ComponentHolder {
  val components = mutableSetOf<Any>()

  inline fun <reified T> component(): T = components
    .filterIsInstance<T>()
    .single()
}
