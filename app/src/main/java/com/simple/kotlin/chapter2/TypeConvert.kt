package com.simple.kotlin.chapter2


val a: Int = 12
val b = a.toString()
val c = a.toFloat()
val d = a.toDouble()

val s = "173"
val s1 = s.toInt()
val s2 = s.toDouble()

fun typeConvert() {

    println(b)
    println(c)
    println(d)

    println(s1)
    println(s2)

    val c: Parent = Child("child", "parent")
    if (c is Child) {
        println(c.child)
        println(c.getName())
    }

    var p: Parent = Parent("parent")
    var c1: Child? = p as? Child
    println(c1)
}


class Child(var child: String, parent: String) : Parent(parent) {
    fun getName(): String {
        return "simple" + child
    }
}

open class Parent(var parent: String)
