package com.stimmax.ru.stimmax.kotlincourse.lessons.lesson07.homeworks

fun main() {
    task1()
    println("task 2 for arg == 10: " + task2_summator(10) )
    println("task 3 for arg == 4: " + task3_factorial(4) )
    println("task 4 for arg == 10: " + task4_evenSumm(10) )
    task5_rectangle(5, 3)
    // task 6
    val subsums = task6_subSumms(4)
    println("Summ even, odd up to 4: " + subsums[0] + ", " + subsums[1])
}

// Используя вложенный цикл реализовать таблицу умножения, как на картинке.
fun task1() {
    for (i in 1..10) {
        println()
        for (j in 1..10) {
            print("" + i * j + " ")
        }
    }
    println()
}

// Напишите функцию, которая суммирует числа от 1 до 'arg' с помощью цикла for. 'arg' - целочисленный аргумент функции.
fun task2_summator(arg: Int): Int {
    var accumulator = 0;
    for (i in 1 .. arg) {
        accumulator += i
    }
    return accumulator
}

// Напишите функцию, которая вычисляет факториал числа 'arg' с использованием цикла while.
fun task3_factorial(arg: Int): Int {
    var accumulator = 1;
    var i = 2
    while (i <= arg) {
        accumulator *= i++
    }
    return accumulator
}

// Напишите функцию, которая находит сумму всех четных чисел от 2 до 'arg', используя цикл while.
fun task4_evenSumm(arg: Int): Int {
    var accumulator = 0;
    var i = 2
    while (i <= arg) {
        accumulator += i
        i += 2
    }
    return accumulator
}

// Напишите функцию, которая используя вложенные циклы while, выведет заполненный прямоугольник размером 5x3 из символов *.
fun task5_rectangle(width: Int, height: Int) {
    var row = 0
    while (row++ < height ) {
        var col = 0
        println()
        while (col++ < width ) {
            print('*')
        }

    }
    println()
}

// Напишите функцию, которая используя цикл for найдёт суммы чётных и нечётных значений чисел от 1 до arg.
fun task6_subSumms(arg: Int): Array<Int> {
    var odd = 0; // неч
    var even = 0 // чет
    for (i in 1 .. arg) {
        if (i % 2 == 0) {
            even += i
        } else {
            odd += i
        }
    }
    return arrayOf(even, odd)
}