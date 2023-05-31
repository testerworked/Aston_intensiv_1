package com.rinat.homework2

import kotlin.reflect.KClass

class Extensions {
}

fun <T : Any> KClass<T>.getTag(): String = this.java.simpleName