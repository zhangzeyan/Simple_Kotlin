package com.simple.kotlin.expression

class ClassMember(var field: String = "abc", notFile: String) {

    var name: String
        get() {
            return name
        }
        set(value) {
            name = value
        }

    var age: Int = 10
//        get
        set(value) {
            age = value + 10
        }


    lateinit var myLateinit: String

    val mylazy: String by lazy {
        "lazy"
    }

    val n: Int = 15
        get() = field
}


fun classMember() {
    val cm = ClassMember("abcd", "b")
    println(cm.age)
    println(cm.mylazy)
    println(cm.field)
    println(cm.n)
}


fun main(args: Array<String>) {
    classMember()
}