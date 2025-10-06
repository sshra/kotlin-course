package com.stimmax.ru.stimmax.kotlincourse.lessons.lesson09.homeworks

import kotlin.random.Random

fun main() {
    // Работа с массивами Array
    // Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
    val a1 = arrayOf(1, 2, 3, 4, 5)

    // Создайте пустой массив строк размером 10 элементов.
    val a2 = Array(10) {""}

    // Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
    val a3 = DoubleArray(5) { index ->  index * 2.0 }

    // Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение,
    // равное его индексу, умноженному на 3.
    val a4 = Array(5) { 0 }
    for (i in a4.indices) {
        a4[i] = i * 3
    }

    // Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
    val a5 = arrayOf<String?>(null, "", "")

    // Создайте массив целых чисел и скопируйте его в новый массив в цикле .
    val a6 = arrayOf(1, 2, 3, 4, 5)
    val a6_1 = Array<Int>(5) { 0 }
    for (i in a6.indices) {
        a6_1[i] = a6[i]
    }

    // Создайте два массива целых чисел одинаковой длины.Создайте третий массив, вычев значения одного из другого.
    val a7 = Array(10) { index -> index * 2 }
    val a7_1 = Array(a7.size) { index -> index * 3 }
    val a7_2 = Array(a7.size) { index -> a7_1[index] - a7[index] }

    // Создайте массив целых чисел . Найдите индекс элемента со значением 5.Если значения 5 нет в массиве, возвращаем-1.
    // Реши задачу через цикл while.
    val a8 = Array(10) { index -> index * 10 }
    var i = a8.lastIndex
    var found = -1
    while (i >= 0) {
        if (a8[i] == 5) {
            found = i
            break
        }
        i --
    }
    println("Index is $found.")

    // Создайте массив целых чисел . Используйте цикл для перебора массива и вывода каждого элемента в консоль .
    // Напротив каждого элемента должно быть написано “чётное” или “нечётное”.
    val a9 = Array(10) { Random.nextInt(100) }
    for (elm in a9) {
        println("$elm is ${ if (elm % 2 == 0) "even" else "odd"}")
    }

    // Создай функцию, которая принимает массив строк и строку для поиска. Функция должна находить в массиве элемент,
    // в котором принятая строка является подстрокой (метод contains()). Верни найденный элемент из функции в виде строки
    println (task10(
        arrayOf("Test String", "Super Test String"),
        "Super")
    )

    // ********* Работа со списками List ************
    // Создайте пустой неизменяемый список целых чисел.
    val list1 = listOf<Int>()

    // Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").
    val list2 = listOf("Hello", "World", "Kotlin")

    // Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
    val list3 = mutableListOf<Int>(1, 2, 3, 4, 5)

    // Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).
    list3.add(6)
    list3.add(7)
    list3.add(8)

    // Имея изменяемый список строк, удалите из него определенный элемент (например, "World").
    val list5 = mutableListOf("Hello", "World", "Kotlin")
    list5.remove("World")

    // Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.
    val list6 = listOf(1, 2, 3, 4, 5)
    for (elm in list6) {
        println(elm)
    }

    // Создайте список строк и получите из него второй элемент, используя его индекс.
    val list7 = listOf("Hello", "World", "Kotlin")
    println(list7[1])

    // Имея изменяемый список чисел, измените значение элемента на определенной позиции (например, замените элемент на позиции 2 на новое значение).
    val list8 = mutableListOf(1, 2, 3, 4, 5)
    list8[2] = 30

    // Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков. Реши задачу с помощью циклов.
    val list9_1 = listOf("Hello", "World", "Kotlin")
    val list9_2 = listOf("Kotlin", "Lang")
    val list9 = mutableListOf<String>()
    for (elm in list9_1) {
        list9.add(elm)
    }
    for (elm in list9_2) {
        list9.add(elm)
    }

    // Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.
    val list10 = List<Int>(10) { Random.nextInt(100) }
    var min: Int? = null
    var max: Int? = null
    for (elm in list10) {
        if (min == null || min < elm) {
            min = elm
        }
        if (max == null || max > elm) {
            max = elm
        }
    }
    println("Max value is $max, min value is $min")

    // Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.
    val list11 = mutableListOf<Int>()
    for (elm in list10) {
        if (elm % 2 == 0) {
            list11.add(elm)
        }
    }

    // ********** Работа с Множествами Set **********
    // Создайте пустое неизменяемое множество целых чисел.
    val set1 = setOf<Int>()

    // Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).
    val set2 = setOf<Int>(1, 2, 3)

    // Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java", "Scala").
    val set3 = mutableSetOf("Kotlin", "Java", "Scala")

    // Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").
    set3.add("Swift")
    set3.add("Go")

    // Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).
    val set5 = mutableSetOf(1, 2, 3, 4, 5)
    set5.remove(2)

    // Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.
    val set6 = setOf(1, 2, 3, 4, 5)
    for (elm in set6) {
        println("$elm")
    }

    // Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве
    // указанная строка. Нужно вернуть булево значение true если строка есть. Реши задачу через цикл.
    setTask7(setOf("Kotlin", "Java", "Scala"), "Scala")

    // Создайте два множества строк и объедините их в одно новое множество, содержащее все уникальные элементы обоих
    // множеств. Реши задачу с помощью циклов.
    val set8_1 = setOf("Kotlin", "Java", "Scala")
    val set8_2 = setOf("Kotlin", "Swift")
    val set8 = mutableSetOf<String>()
    for (elm in set8_1) {
        set8.add(elm)
    }
    for (elm in set8_2) {
        set8.add(elm)
    }

    // Создайте два множества целых чисел и найдите их пересечение (общие элементы). Реши задачу через вложенные циклы.
    val set9_1 = setOf<Int>(1,2,3,4,5)
    val set9_2 = setOf<Int>(5,6,7,8,9)
    // val set9 = set9_1 + set9_2
    val set9 = mutableSetOf<Int>()

    for (elm in set9_1) {
        for (elm2 in set9_2) {
            if (elm == elm2) {
                set9.add(elm)
            }
        }
    }

    // Создайте два множества строк и найдите разность первого множества относительно второго (элементы,
    // присутствующие в первом множестве, но отсутствующие во втором). Реши задачу через вложенные циклы и
    // переменные флаги.
    val set10_1 = setOf("Kotlin", "Java", "Scala")
    val set10_2 = setOf("Kotlin", "Swift")
    val set10 = mutableSetOf("Kotlin", "Swift")
    for (elm in set10_1) {
        var found = false
        for (elm2 in set10_2) {
            if (elm == elm2) {
                found = true
                break;
            }
        }
        if (!found) {
            set10.add(elm)
        }
    }

    // Создайте множество строк и конвертируйте его в список с использованием цикла.
    val set11 = setOf("Kotlin", "Java", "Scala")
    // val listFromSet = listOf(set11)
    val listFromSet = mutableListOf<String>()
    for (elm in set11) {
        listFromSet.add(elm)
    }
}

// task 10
fun task10(a: Array<String>, s: String): String {
    for (elm in a) {
        if (elm.contains(s)) return elm
    }
    return ""
}

fun setTask7(a: Set<String>, s: String): Boolean {
     // return a.contains(s)
    var result = false
    for (elm in a) {
        if (elm == s) {
            result = true
            break
        };
    }
    return result
}
