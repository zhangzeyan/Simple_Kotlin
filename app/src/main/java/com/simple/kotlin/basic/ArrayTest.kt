package com.simple.kotlin.basic


val arrayString: Array<String> = arrayOf("simple", "android")
val arrayInt: Array<Int> = arrayOf(1, 3, 5)
val arrayFloat: Array<Float> = arrayOf(12.8f, 13.9f, 14.5f)
val arrayDouble: Array<Double> = arrayOf(12.8, 13.9, 14.5)
val arrayChar = arrayOf('s','i','m','p','l','e')

var intArray = intArrayOf(2,3)

fun arrayTest(){

    arrayString.forEach(::println)
    arrayInt.forEach(::println)
    arrayFloat.forEach(::println)
    arrayDouble.forEach(::println)
    arrayChar.forEach(::println)

    intArray.forEach(::println)
    intArray[1] = 4
    intArray.forEach(::println)

    println(arrayChar.joinToString(""))
    println(arrayChar.slice(1..2).joinToString(""))

}

fun main(args: Array<String>) {
    arrayTest()
}