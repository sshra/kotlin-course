package com.stimmax.ru.stimmax.kotlincourse.lessons.lesson11.homework

fun main() {
    printNumbersUntil(-1)
}

// ******** Задачи на сигнатуру метода ******
// Напишите сигнатуру метода в которую входит модификатор доступа, название функции, список аргументов с типами и возвращаемое значение. В теле метода можешь сделать возврат объекта нужного типа если это требуется для устранения ошибок.

// Не принимает аргументов и не возвращает значения.
fun f1() {

}

// Принимает два целых числа и возвращает их сумму.
fun sum_f2(a: Int, b: Int): Int = a + b

// Принимает строку и ничего не возвращает.
fun f3(s: String) {

}

// Принимает список целых чисел и возвращает среднее значение типа Double.
fun average(nums: List<Int>): Double {
    var result: Double = 0.0

    if (nums.size > 0) {
        for (num in nums) {
            result += num.toDouble()
        }
        result /= nums.size
    }
    return result
}

// Принимает nullable строку и возвращает её длину в виде nullable целого числа и доступна только в текущем файле.
private fun strLen(s: String?): Int? = if (s == null) null else s.length

// Не принимает аргументов и возвращает nullable вещественное число.
fun f6(): Float? {
    return null
}

// Принимает nullable список целых чисел, не возвращает значения и доступна только в текущем файле.
private fun f7(lst: List<Int>?) {

}

// Принимает целое число и возвращает nullable строку.
fun f8(num: Int): String? {
    return null
}

//Не принимает аргументов и возвращает список nullable строк.
fun f9(): List<String>? {
    return null
}

// Принимает nullable строку и nullable целое число и возвращает nullable булево значение.
fun f10(s: String?, num: Int?): Boolean? {
    return null
}

// ****** Задачи на написание кода ********
// Напишите валидную сигнатуру метода а так же рабочий код для задач.

// Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
fun multiplyByTwo(num: Int): Int = num * 2

// создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное,
// и false в противном случае.
fun isEven(num: Int): Boolean = num % 2 == 0

// Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n.
// Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
fun printNumbersUntil(n: Int) {
    var i = 1
    while (i <= n) {
        println(i)
        i ++
    }
}

// Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное
// число в списке. Если отрицательных чисел нет, функция должна вернуть null.
fun findFirstNegative(nums: List<Int>): Int? {
    for (num in nums) {
        if (num < 0) return num
    }
    return null
}

// Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и
// выводить каждую строку. Если встречается null значение, функция должна прекратить выполнение с
// помощью return без возврата значения.
fun processList(strs: List<String?>) {
    for (str in strs) {
        if (str == null) {
            return
        }
        println(str)
    }
}