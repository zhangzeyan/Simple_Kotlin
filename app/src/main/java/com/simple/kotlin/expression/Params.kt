package com.simple.kotlin.expression

fun params(){
    var array = intArrayOf(12,13,14)
    hello(ints = *array, string = "Simple")
    hello(15.5, *array, string = "Simple")
}

fun hello(double: Double = 9.0, vararg ints: Int, string: String){
    ints.forEach(::println)
    println(double)
    println(string)
}

fun main(args: Array<String>) {
    params()
}

