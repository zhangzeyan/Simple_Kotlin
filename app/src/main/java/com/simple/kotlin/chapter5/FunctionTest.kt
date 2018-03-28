package com.simple.kotlin.chapter5


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
//
//    //reduce使用
//    println(flatList.reduce { acc, i -> acc + i })
//
//    println(factorial(4))
//    (0..4).map(::factorial).forEach(::println)

    //fold使用
    println((1..4).fold(2){acc, i -> acc+i })
    println((1..4).fold(StringBuilder()){ acc, i -> acc.append(i).append(",")})
    println((1..4).joinToString(","))

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