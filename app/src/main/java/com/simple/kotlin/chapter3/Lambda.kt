package com.simple.kotlin.chapter3

val myArray = arrayOf(12, 13, 14)

fun lambda() {
    println(sum1(1, 3))
    println(sum2(1, 3))

    myArray.forEach({it -> addNumber(it)})
    myArray.forEach({addNumber(it)})
    myArray.forEach{
        addNumber(it)
    }
    myArray.forEach(::addNumber)

}

val sum1 = { arg1: Int, arg2: Int -> arg1 + arg2 }

val sum2 = { arg1: Int, arg2: Int ->
    sum1(arg1, arg2) * arg2
}

fun addNumber(number: Int){
    println(number * 2)
}