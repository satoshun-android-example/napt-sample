package io.github.satoshun.example

import com.squareup.anvil.annotations.MergeSubcomponent

@SingleIn(LoggedInScope::class)
@MergeSubcomponent(LoggedInScope::class)
interface LoggedInComponent

abstract class LoggedInScope private constructor()
