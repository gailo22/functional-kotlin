package com.gailo22.kotlin.functionalkotlin

import arrow.core.Id

fun main(args: Array<String>) {
    val a = Id.just(1)
        .map { it * 2 }
        .flatMap { Id.just(it * 2) }
        .value

    println(a)
}