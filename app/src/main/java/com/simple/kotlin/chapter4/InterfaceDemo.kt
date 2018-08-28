package com.simple.kotlin.chapter4

import android.view.View
import com.simple.kotlin.chapter3.params
import com.simple.kotlin.chapter4.annotation.PoKo
import kotlin.reflect.KProperty


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


//    println(K.ofDouble(12.8).myTest())
//    println(K.myStaticMethod())

//    println("simple".multiply(12))
//    println("kotlin" * 12)
//    "kotlin".extendString = "ktv"
//    println("kotlin".extendString)

//    val de = Delegates()
//    println(de.hello)
//    println(de.hello2)
//    println(de.hello3)
//    de.hello3 = "hello3"
//    println(de.hello3)

    val myClass = MyDataClass("Simple", 28)
    println(myClass)
    println(myClass.component1())
    println(myClass.component2())
//
//    val myClass1 = MyDataClass1("Simple", 28)
//    println(myClass1)
//    val (a, b, c, d, e, f) = myClass1
//    println("$a$b$c$d$e$f")

//    var inner = Outter.Inner()
//    var inner1 = Outter().Inner1()

//    val view = MyView()
//    view.myClick = object: Outter(), View.OnClickListener {
//        override fun myMethod(string: String) {
//            println("myMethod")
//        }
//
//        override fun onClick(v: View?) {
//            println("hello , simple")
//        }
//    }

    println(Subject.CHINESE.deName)
    println(Subject.CHINESE.id)
    println(Subject.CHINESE.name)
    println(Subject.CHINESE.ordinal)

    Subject.values().map(::println)

    println(Subject.valueOf("MATHE"))


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

//伴生对象和静态成员
class K private constructor(val value: Double) {
    companion object {
        fun ofDouble(double: Double): K {
            return K(double)
        }

        @JvmStatic
        fun myStaticMethod(): Int {
            return 12
        }

        fun myStaticMethod1(): Int {
            return 13
        }

        @JvmField
        val tag = 12
    }

    fun myTest(): String {
        return "the number is $value"
    }
}

//扩展成员

fun String.multiply(int: Int): String {
    val stringBuilder = StringBuilder()
    for (i in 0 until int) {
        stringBuilder.append(this)
    }
    return stringBuilder.toString()
}

operator fun String.times(int: Int): String {
    val stringBuilder = StringBuilder()
    for (i in 0 until int) {
        stringBuilder.append(this)
    }
    return stringBuilder.toString()
}

var String.extendString: String
    set(value) {

    }
    get() = "Simple"


//属性代理

class Delegates {
    val hello by lazy {
        "hello"
    }

    val hello2 by X()

    var hello3 by X()
}

class X {

    private var value: String? = null

    operator fun getValue(any: Any?, property: KProperty<*>): String {
        return value ?: "hello2"
    }

    operator fun setValue(any: Any?, property: KProperty<*>, value: String) {
        this.value = value
    }

}

//数据类 data
data class MyDataClass(val name: String, val age: Int)


class MyDataClass1(val name: String, val age: Int) {
    operator fun component1(): String {
        return "s"
    }

    operator fun component2(): String {
        return "i"
    }

    operator fun component3(): String {
        return "m"
    }

    operator fun component4(): String {
        return "p"
    }

    operator fun component5(): String {
        return "l"
    }

    operator fun component6(): String {
        return "e"
    }
}

//noArg插件和allOpen插件
@PoKo
data class MyDataClass2(val name: String, val age: Int)

class MyDataClass3(override val name: String, override val age: Int) : MyDataClass2(name, age)

//内部类
open class Outter {

    val outterA: Int = 9

    class Inner {
        init {
            println(Outter().outterA)
        }
    }

    inner class Inner1 {
        val outterA: Int = 8

        init {
            println(this@Outter.outterA)
            println(this.outterA)
        }
    }

    open fun myMethod(string: String) {

    }
}

//匿名内部类
class MyView {
    var myClick: View.OnClickListener? = null
}

//枚举类型

enum class Subject(val id: Int, val deName: String) {
    ENGLISH(1, "英语"), CHINESE(2, "语文"), MATHE(3, "数学")
}

//密封类
sealed class PlayerCmd {

}

class Play(val url: String, val position: Long = 0) : PlayerCmd()
class Seek() : PlayerCmd()
object Pause : PlayerCmd()
object Resume : PlayerCmd()
object Stop: PlayerCmd()


fun main(args: Array<String>) {
    interfaceDemo()
}