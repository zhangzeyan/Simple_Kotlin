package com.simple.kotlin.expression


fun ifExpression() {
    val a = 12
    val b = 13
    val c = if (a < b) {
        a + 13
    } else {
        a - 13
    }
    println(c)
}


fun main(args: Array<String>) {
    ifExpression()
}