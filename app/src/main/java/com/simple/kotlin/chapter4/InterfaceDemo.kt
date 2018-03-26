package com.simple.kotlin.chapter4


fun interfaceDemo() {
//    var c = C("Simple")
//    println(c.aMethod())
//    println(c.bMethod())
//    println(c.myTest())

//    val h1 = H1()
//    val h2 = H2()
//    val h = H(h1, h2)
//    h.fMethod()
//    h.fMethod1()

//    println(G3(99).x())
//    println(G3(100).x())
//    println(G3(200).x())
//    println(G3(-1).x())

//    J.jMethod()


    println(K.ofDouble(12.8).myTest())
    println(K.myStaticMethod())

}

//抽象类和接口
abstract class B {
    abstract fun bMethod()
}

interface A {
    var a: String
    fun myTest() {
        println(a)
    }

    fun aMethod()
}


class C(override var a: String) : B(), A {

    override fun aMethod() {
        println("a method $a")
    }

    override fun bMethod() {
        println("b method $a")

    }

}

//属性复写

open class D(open val b: String, a: Int)

class E(override val b: String, a: Int) : D(b, a)


//接口代理
interface F {
    fun fMethod()
}

interface F1 {
    fun fMethod1()
}


class H(val fMethod: F, val fMethod1: F1) : F by fMethod, F1 by fMethod1

class H1 : F {
    override fun fMethod() {
        println("H1 run fMethod")
    }
}

class H2 : F1 {
    override fun fMethod1() {
        println("H2 run fMethod1")
    }
}

//复写父类接口方法
abstract class G {
    open fun x(): Int = 11
}

interface G1 {
    fun x(): Int = 12
}

interface G2 {
    fun x(): Int = 13
}

class G3(val y: Int) : G(), G1, G2 {
    override fun x(): Int {
        return when (y) {
            in 0 until 100 -> super<G>.x()
            in 100 until 200 -> super<G1>.x()
            in 200..Int.MAX_VALUE -> super<G2>.x()
            else -> y
        }
    }
}

//单例 object
object J {
    fun jMethod() {
        println("simple")
    }
}

//伴生对象
class K  private constructor(val value: Double) {
    companion object {
        fun ofDouble(double: Double):K{
            return K(double)
        }

        @JvmStatic
        fun myStaticMethod():Int{
            return 12
        }

        fun myStaticMethod1():Int{
            return 13
        }

        @JvmField
        val tag = 12
    }

    fun myTest(): String{
        return "the number is $value"
    }
}