package com.stimmax.ru.stimmax.kotlincourse.lessons.lesson10

fun main() {
    val pair = 1 to "a"

    val emptyMap = mapOf<String, String>()
    val someMap = mapOf("two" to 2)

    val a1 = mapOf<String, Int>("a" to 1);

    val a2 = mutableMapOf<String, String>("a2" to "b", "to" to "beer")

    val studyPlan = mutableMapOf<String, MutableList<String>>()
    val contacts = mutableMapOf<String, MutableMap<String, String>>()
    contacts["Sergey"] = mutableMapOf("tel" to "985 6754 098")
    contacts["Sergey"]?.plus("addr" to "")
}

fun func(dict: Map<String, String>, key: String) {
    println(if (dict.contains(key)) dict.get(key) else "No found")

    var found = false
    for ((k, v) in dict) {
        if (key == k) {
            println(v)
            found = true
            break;
        }
    }
    if (!found) {
        println("Value has not been found!")
    }
}