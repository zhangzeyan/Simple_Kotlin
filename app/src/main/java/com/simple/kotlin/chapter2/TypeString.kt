package com.simple.kotlin.chapter2


var num1 = 12
var num2 = 13

var string1 = """string"""
var string2 = "string"
var string3 = String(charArrayOf('s','t','r','i','n','g'))

fun typeString(){
    println("$num1 + $num2 = ${num1 + num2}")

    println(string1)
    println(string1.length)

    println(string1 == string2)
    println(string1 === string2)

    println(string1 == string3)
    println(string1 === string3)
}

fun main(args: Array<String>) {
    typeString()
}