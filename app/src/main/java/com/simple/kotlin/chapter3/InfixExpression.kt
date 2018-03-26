package com.simple.kotlin.chapter3

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