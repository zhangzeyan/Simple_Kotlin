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

    myArray.forEach endFromHere@{
        if (it == 13) return@endFromHere
        println(it)
    }

    println(sum0)
    println(sum1)
    println(sum2)
    println(sum3)
    println(::addNumber)

}

val sum0 = {

}


val sum1 = { arg1: Int, arg2: Int -> arg1 + arg2 }

val sum2 = { arg1: Int, arg2: Int ->
    sum1(arg1, arg2) * arg2
}

val sum3 = { arg1: Int, arg2: Int, arg3: Int ->
    arg1 + arg2 + arg3
}



fun addNumber(number: Int){
    println(number * 2)
}


fun main(args: Array<String>) {
    lambda()
}