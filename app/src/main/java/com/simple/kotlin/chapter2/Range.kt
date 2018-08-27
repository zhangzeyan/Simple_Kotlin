package com.simple.kotlin.chapter2

val intRange: IntRange = 0..12
val intRange1: IntRange = 0 until 12

fun range(){

    intRange.forEach(::println)

    intRange1.forEach(::println)

    println(intRange.contains(12))
    println(12 in intRange1)
}


fun main(args: Array<String>) {
    range()
}