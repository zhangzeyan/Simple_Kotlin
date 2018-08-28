package com.simple.kotlin.expression

class Student{
    infix fun on(any:Any): Boolean {
        return true
    }
}

class ClassRoom


fun infixExpression(){
    val s = Student()
    if (s on ClassRoom()){
        println(s)
    }
}

fun main(args: Array<String>) {
    infixExpression()
}