package com.stimmax.ru.stimmax.kotlincourse.lessons.lesson12

fun main() {
    val numbers = listOf(-1, 2, -3, 4, -5, 8, 264)

    numbers.firstOrNull { it > 0}
    numbers.filter { it in 18 .. 30}
    numbers.filterNotNull()

    val strings = listOf("Vasya", "Petya", "Mohamed")

    strings.groupBy { it[0] }

//    val positive = mutableListOf<Int>()
//
//    numbers.forEach {
//        val isPositive = it > 0
//        if (isPositive) {
//            positive.add(it)
//        }
//    }
//
//    numbers.filter { it > 10 }.forEach { println(it) }
//
//    numbers.last()
//    numbers.first()
//
//    val numberSquareMap: Map<Int, Int> = numbers.associate { it to it * it }
//
//    val sorted = numbers.groupBy { if (it > 0) " Pos " else " Neg " }
//    println(sorted)




}