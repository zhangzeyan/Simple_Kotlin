package com.simple.kotlin.expression


fun whenExpression(){
    val x = 255
    when(x){
        in 1..100 -> println("$x is in 1..100")
        in 100..200 -> println("$x is in  100..200")
        else ->println("dd")
    }
}



fun main(args: Array<String>) {
    whenExpression()
}