package com.stimmax.ru.stimmax.kotlincourse.lessons.lesson12.homeworks

import kotlin.random.Random

fun main() {
    val col = getRandomIntList(null)
    println(col)

    // ******* Задачи на приведение коллекции к значению *******
    // Проверить, что размер коллекции больше 5 элементов.
    if (col.size > 5) {
        // TODO:
    }

    // Проверить, что коллекция пустая
    if (col.isEmpty()) {
        // TODO:
    }

    // Проверить, что коллекция не пустая
    if (col.isNotEmpty()) {
        // TODO:
    }

    // Взять элемент по индексу или создать значение если индекса не существует
    val get5 = col.getOrElse(5, { 1000 })

    // Собрать коллекцию в строку
    val str = col.joinToString(", ")

    // Посчитать сумму всех значений
    val sum = col.sum()

    // Посчитать среднее
    val av = col.average()

    // Взять максимальное число
    val max= col.max()

    // Взять минимальное число
    val min = col.min()

    // Взять первое число или null
    val first = col.firstOrNull()

    // Проверить что коллекция содержит элемент
    if (col.contains(10)) {
        // TODO:
    }

    // ********** Задачи на обработку коллекций *********
    // Отфильтровать коллекцию по диапазону 18-30
    col.filter { it in 18..30 }

    // Выбрать числа, которые не делятся на 2 и 3 одновременно
    col.filter { it % 6 != 0 }

    // Очистить текстовую коллекцию от null элементов
    col.filterNotNull()

    // Преобразовать текстовую коллекцию в коллекцию длин слов
    val colText = listOf("Java", "Scala", "Go", "Fortran", "Go")
    val colOfLen = colText.map { it.length }

    // Преобразовать текстовую коллекцию в мапу, где ключи - перевёрнутые слова, а значения - длина слов
    val map: Map<String, Int> = colText.associate { it.reversed() to it.length }

    // Отсортировать список в алфавитном порядке
    colText.sorted()

    // Взять первые 3 элемента списка
    col.take(3)

    // Распечатать квадраты элементов списка
    println("Squares:")
    col.forEach { println(it * it) }

    // Группировать список по первой букве слов
    colText.groupBy { it[0] }

    // Очистить список от дублей
    colText.distinct()

    // Отсортировать список по убыванию
    col.sortedDescending()

    // Взять последние 3 элемента списка
    col.takeLast(3)

    // task 24
    println("Task24:")
    for (i in 1 .. 10) {
        println(task24(getRandomIntList(100)))
    }

    // task 25
    println("Task25:")
    val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
    println(task25(grades))

    // task 26
    println("Task26:")
    val list = listOf(
        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка", "Картина",
        "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник", "Коврик", "вешалка", "Подставка",
        "телевизор", "Комод", "полка", "Абажур", "диван", "Кресло", "занавеска", "Бра", "пепельница", "Глобус",
        "статуэтка", "Поднос", "фигурка", "Ключница", "плед", "Тумба", "игрушка", "Настенные часы", "подсвечник",
        "Журнальный столик", "сувенир", "Корзина для белья", "посуда", "Настольная лампа", "торшер", "Этажерка"
    )
    println(task26(list))

    // task 27
    println("Task27:")
    println(task27(list))

    // task 28
    println("Task28:")
    val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
    println(task28(numbers))

    // task 29
    println("Task29:")
    val ages = listOf(22, 18, 30, 45, 17, null, 60)
    println(task29(ages, 100))

}

private fun getRandomIntList(n: Int?): List<Int> = List<Int>(n ?: Random.nextInt(10)) { Random.nextInt(100) }

// Задача 24. Характеристика числовой коллекции
// Напиши функцию, которая принимает коллекцию чисел и возвращает строку с характеристикой коллекции
// используя конструкцию when
fun task24(lst: List<Int>): String {
    return when {
        lst.isEmpty() -> "Empty"
        lst.size < 5 -> "Short"
        lst.getOrElse(0, { -1}) == 0 -> "Start"
        lst.sum() > 10000 -> "Massive"
        lst.average() == 10.0 -> "Balanced"
        lst.joinToString().length == 20 -> "Gluing"
        lst.max() < 10 -> "Negative"
        lst.min() > 1000 -> "Positive"
        lst.containsAll(listOf(3, 14)) -> "Fucksome"

        else -> "Unique"
    }
}

// Задача 25. Анализ учебных оценок
fun task25(lst: List<Int>): List<Int> = lst.filter { it >= 60 }.sorted().take(3)

// Задача 26. Создание каталога по первой букве
fun task26(lst: List<String>): Map<Char, List<String>> =
    lst
        .map { it.lowercase() }
        .groupBy { it[0] }

// Задание 27. Подсчёт средней длины слов в списке
fun task27(lst: List<String>): String =
    String.format("%.2f", lst.map { it.length }.average())

// Задание 28: Категоризация чисел
fun task28(lst: List<Int>): Map<String, List<Int>> =
    lst.distinct().sortedDescending().groupBy { if (it % 2 == 0) "even" else "odd" }

// Задание 29: Поиск первого подходящего элемента
fun task29(lst: List<Int?>, n: Int): Int? =
    lst.filterNotNull().firstOrNull() { it > n }
