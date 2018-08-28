package com.simple.kotlin.basic


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


fun main(args: Array<String>) {
    nullType()
}
