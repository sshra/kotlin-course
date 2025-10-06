package com.stimmax.ru.stimmax.kotlincourse.lessons.lesson09

fun main() {

    val a1 = Array<Int>(10) { 0 }

    for (i in a1.indices) {
        a1[i] = (i + 1) * 10
    }

    val a2 = Array<Int>(10) { 0 }

    for (i in a2.indices) {
        a2[i] = a1[i]
    }

    val a3 = listOf<Int>(1, 2, 3)
    val a4 = arrayOf("", "")

    val a9 = setOf(2, 4, 6)
    val a10 = setOf(1, 2, 3)

    val a11: Set<Int> = a9 + a10

}