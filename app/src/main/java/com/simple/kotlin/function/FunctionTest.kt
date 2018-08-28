package com.simple.kotlin.function

import java.io.OutputStream
import java.nio.charset.Charset


fun functionTest() {

//    val hw = Hello::world
//    println(hw)
//
//    val arrays: Array<String> = arrayOf("a", "", "b", "", "c")
//    println(arrays.size)
//    arrays.filter(String::isNotEmpty).forEach(::println)
//    println(arrays.filter(String::isNotEmpty).size)


    //forEach使用
//    val list = listOf(2, 4, 6, 8)
//    val arraysOld = ArrayList<Int>()
//    list.forEach {
//        arraysOld.add(it * 3 + 3)
//    }
//
//    arraysOld.forEach(::println)
//
//    //map使用
//    val arraysNew = list.map {
//        it * 3 + 3
//    }
//    arraysNew.forEach(::println)
//
//    val arraysNew1 = list.map(Int::toDouble)
//    arraysNew1.forEach(::println)


    //flatMap使用
//    val arrayLists = listOf(
//            1..4,
//            6..8,
//            12..14
//    )
//
//    val flatList = arrayLists.flatMap {
//        it.map {
//            it
//        }
//    }
//
//    flatList.forEach(::println)

    //reduce使用
//    println(flatList.reduce { acc, i -> acc + i })

//    println(factorial(4))
//    (0..4).map(::factorial).forEach(::println)

    //fold使用
//    println((1..4).fold(2){acc, i -> acc+i })
//    println((1..4).fold(StringBuilder()){ acc, i -> acc.append(i).append(",")})
//    println((1..4).joinToString(","))

    //filter使用
//    println((1..4).map(::factorial).filter { it % 2 == 1 })
//    println((1..4).map(::factorial).filterIndexed { index, i -> index % 2 == 1 })


    //takeWhile使用
//    println((1..4).map(::factorial).takeWhile { it % 3 != 0 })
//
//    //.let使用
//    findPerson()?.let { (name, age) ->
//        println(name)
//        println(age)
//    }
//
//    findPerson()?.let { person ->
//        person.work()
//    }
//
//    //apply使用
//    findPerson()?.apply {
//        println(name)
//        work()
//    }
//
//    //with使用
//    with(findPerson1()) {
//        work()
//    }

    //尾递归优化
//    val MAX_NODE_COUNT = 100000
//    val head = ListNode(0)
//    var p = head
//    for (i in 1..MAX_NODE_COUNT) {
//        p.next = ListNode(i)
//        p = p.next!!
//    }

    //闭包
//    val add5 = add(5)
//    println(add5)
//    println(add5(2))

    //函数复合
//    val andWhen = add3 andWhen mul2
//    println(andWhen(9))
//
//    val andWhen1 = add3 andWhen1 mul2
//    println(andWhen1(9))

    //柯里化
//    log("simple")(System.out)("hello")
//    ::log.mynew()("simple")(System.out)("hello")


//    //偏函数
    val bytes = "我是中国人".toByteArray(charset("GBK"))
    val stringFromGBK = makeStringFromGbkBytes(bytes)
    println(stringFromGBK)

}

class Hello {
    fun world() {
        println("Hello World")
    }
}

fun factorial(n: Int): Int {
    if (n == 0) return 1
    return (1..n).reduce { acc, i -> acc * i }
}


data class Person(val name: String, val age: Int) {
    fun work() {
        println("$name, $age is programmer.")
    }
}

fun findPerson(): Person? {
    return Person("Simple", 28)
}

fun findPerson1(): Person {
    return Person("Simple", 28)
}

tailrec fun findListNode(head: ListNode?, value: Int): ListNode? {
    head ?: return null
    if (head.value == value) return head
    return findListNode(head.next, value)
}

data class ListNode(val value: Int, var next: ListNode? = null)


fun add(x: Int) = fun(y: Int) = x + y

fun add1(x: Int): (Int) -> Int {
    return fun(y: Int): Int {
        return x + y
    }
}

val add3 = { i: Int -> i + 3 }
val mul2 = { i: Int -> i * 2 }

infix fun <P1, P2, R> Function1<P1, P2>.andWhen(function: Function1<P2, R>): Function1<P1, R> {
    return fun(p1: P1): R {
        return function.invoke(this.invoke(p1))
    }
}

infix fun <P1, P2, R> Function1<P2, R>.andWhen1(function: Function1<P1, P2>): Function1<P1, R> {
    return fun(p1: P1): R {
        return this.invoke(function.invoke(p1))
    }
}


fun log(tag: String, target: OutputStream, message: Any?) {
    target.write("$tag $message".toByteArray())
}

//fun log(tag: String) = fun(target: OutputStream) = fun(message: Any?) = target.write("$tag $message".toByteArray())

fun <P1, P2, P3, R> Function3<P1, P2, P3, R>.mynew() = fun(p1: P1) = fun(p2: P2) = fun(p3: P3) = this(p1, p2, p3)


val makeString = fun(byteArray: ByteArray, charset: Charset): String {
    return String(byteArray,charset)
}

val makeStringFromGbkBytes = makeString.partial2(charset("GBK"))

fun<P1,P2,R> Function2<P1,P2,R>.partial2(p2: P2)= fun(p1: P1)= this(p1,p2)


fun main(args: Array<String>) {
    functionTest()
}