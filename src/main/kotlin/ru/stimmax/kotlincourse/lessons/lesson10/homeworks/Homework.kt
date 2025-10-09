package com.stimmax.ru.stimmax.kotlincourse.lessons.lesson10.homeworks

import java.util.Date
import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    // ******* Задачи на работу со словарём ********

    //    Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.
    val map1 = mapOf<Int, Int>()

    // Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float, а значения - double
    val map2 = mapOf(1f to 0.0, 2f to 2.0, 3.0f to 4.0)

    // Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.
    val map3 = mutableMapOf(1 to "0.0", 2 to "2.0", 3 to "4.0")

    // Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".
    map3[4] = "Example"
    map3[5] = "Text"

    // Используя словарь из предыдущего задания, извлеките значение, используя ключ. Попробуй получить
    // значение с ключом, которого в словаре нет.
    println(map3[4])
    println(map3[6])

    // Удалите определенный элемент из изменяемого словаря по его ключу.
    map3.remove(5)

    // Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение.
    // Не забудь обработать деление на 0 (в этом случае выведи слово “бесконечность”)
    val map7 = mutableMapOf<Double, Int>()
    for (i in 1..20) {
        map7.set(Random.nextInt(100).toDouble(), Random.nextInt(10))
    }

    var i = 0;
    for ((k, v) in map7) {
        try {
            print( (i++).toString().padStart(3) + ". $k / $v = ")
            print(k / v)
        } catch (e: Exception) {
            print("Infinity!")
        }
        println()
    }

    //Измените значение для существующего ключа в изменяемом словаре .
    map3[4] = "100.0"

    //Создайте два словаря и объедините их в третьем изменяемом словаре через циклы .
    val map9_1 = mutableMapOf<Double, Int>()
    val map9_2 = mutableMapOf<Double, Int>()
    var map9 = mutableMapOf<Double, Int>()

    for (i in 1..20) {
        map9_1.set(Random.nextInt(100).toDouble(), Random.nextInt(10))
        map9_2.set(Random.nextInt(100).toDouble(), Random.nextInt(10))
    }

    for ((key, value) in map9_1) {
        map9[key] = value
    }
    for ((key, value) in map9_2) {
        map9[key] = value
    }
    // map9.putAll(map9_1)
    // map9.putAll(map9_2)

    //Создайте словарь, где ключами являются строки, а значениями-списки целых чисел. Добавьте несколько элементов в этот словарь.
    var map10 = mutableMapOf<String, List<Int>>()

    for (i in 1..20) {
        map10.put(
            Random.nextInt(100).toString(),
            List<Int>( Random.nextInt(5)) { Random.nextInt(100) }
        )
    }
    println("Map10: $map10")

    // Создай словарь, в котором ключи-это целые числа, а значения-изменяемые множества строк. Добавь данные в словарь.
    // Получи значение по ключу (это должно быть множество строк) и добавь в это множество ещё строку.
    // Распечатай полученное множество.
    var map11 = mutableMapOf<Int, MutableSet<String>>()
    map11[10] = mutableSetOf("Scala", "Go", "Pascal")

    println("Map 11[10] initially: ${map11[10]}")
    map11[10]?.add("Kotlin")
    println("Map 11[10] eventually: ${map11[10]}")

    // Создай словарь, где ключами будут пары чисел. Через перебор найди значение у которого пара будет содержать
    // цифру 5 в качестве первого или второго значения.
    val map12 = mutableMapOf<Pair<Int, Int>, String>()
    for (i in 1..20) {
        map12.put(
            Random.nextInt(10) to Random.nextInt(10),
            Random.nextInt(1000).toString()
        )
    }

    val lookFor = 5
    for ((k, v) in map12) {
        if (k.first == lookFor || k.second == lookFor) {
            println("map12: Elm $k -> $v")
        }
    }

    // ****** Задачи на подбор оптимального типа для словаря *********
    // Словарь библиотека: Ключи - автор книги, значения - список книг
    val idealMap1 = mutableMapOf<String, MutableList<String>>()

    // Справочник растений: Ключи - типы растений (например, "Цветы", "Деревья"), значения - списки названий растений
    val idealMap2 = mutableMapOf<String, MutableList<String>>()

    // Четвертьфинала: Ключи - названия спортивных команд, значения - списки игроков каждой команды
    val idealMap3 = mutableMapOf<String, List<String>>()

    // Курс лечения: Ключи - даты, значения - список препаратов принимаемых в дату
    val idealMap4 = mapOf<Date, List<String>>()

    // Словарь путешественника: Ключи - страны, значения - словари из городов со списком интересных мест.
    val idealMap5 = mapOf<String, Map<String, List<String>>>()

}