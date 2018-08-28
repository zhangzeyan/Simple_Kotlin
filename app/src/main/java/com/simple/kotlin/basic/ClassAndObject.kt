package com.simple.kotlin.basic


class ClassAndObject constructor(var member:String)

class ClassAndObjectSimple(var member:String)

class ClassAndObjectInit(var member:String){
    init {
        println(member)
    }
}


fun classAndObject(){
    ClassAndObjectInit("simple")
}


fun main(args: Array<String>) {
    classAndObject()
}