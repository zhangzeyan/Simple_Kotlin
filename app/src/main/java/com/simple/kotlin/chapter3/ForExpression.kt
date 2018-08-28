package com.simple.kotlin.chapter3


fun forExpression(){

    val a = 1..100
    for (it in a){
        println("$it")
    }

    val b = arrayOf(100,120,130,150)
    var index = 0
    while (index < b.size){
        println("${b[index]}")
        index++
    }

}


fun main(args: Array<String>) {
    forExpression()
}