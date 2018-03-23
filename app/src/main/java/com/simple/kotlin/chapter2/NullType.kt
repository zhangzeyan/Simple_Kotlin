package com.simple.kotlin.chapter2


fun nullType() {

    println(getNick()!!.length)

    println(getName()?.length)

    println(getName() ?: return)
    println("will not run")
}


fun getNick(): String? {
    return "simple"
}


fun getName(): String? {
    return null
}

