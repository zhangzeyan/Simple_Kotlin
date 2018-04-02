package com.simple.kotlin.chapter5

import android.system.Os.close
import java.io.BufferedReader
import java.io.FileReader


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
    val add5 = add(5)
    println(add5)
    println(add5(2))

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