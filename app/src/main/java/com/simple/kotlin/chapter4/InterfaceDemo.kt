package com.simple.kotlin.chapter4


fun interfaceDemo(){
    var c = C("Simple")
    println(c.aMethod())
    println(c.bMethod())
    println(c.myTest())
}

abstract class B{
    abstract fun bMethod()
}

interface A{
    var a:String
    fun myTest(){
        println(a)
    }
    fun aMethod()
}


class C(override var a: String) : B(),A{

    override fun aMethod() {
        println("a method $a")
    }

    override fun bMethod() {
        println("b method $a")

    }

}