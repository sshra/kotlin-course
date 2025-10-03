package com.stimmax.ru.stimmax.kotlincourse.lessons.lesson08.homeworks

fun main() {
    println(caps("FUHIUHDIUFH FHOHO oifdoi OIihfoi Ohfo "))

    val mySpy = Spy("To be or not to be")
    println(mySpy.encrypt())
    println(mySpy.decrypt())

    tableMul(10, 15)
}

// 7. Все слова с большой буквы
fun caps(phrase: String): String {

    var result = ""
    var lastCharIsLetter = false
    for (char in phrase.lowercase().toCharArray()) {
        when (char) {
            in 'a' .. 'z', in 'а' .. 'я' -> {
                if (lastCharIsLetter) {
                    result += char
                } else {
                    result += char.uppercase()
                }
                lastCharIsLetter = true
            }
            else -> {
                result += char
                lastCharIsLetter = false
            }
        }
    }

    return result
}

// 8. Игра в разведчика
class Spy(var s: String) {
    init {
        if (s.length % 2 == 1) {
            s += " "
        }
    }

    fun encrypt(): String {
        var result = ""
        for (i in 0 .. s.length - 1 step 2) {
            val sub = s.substring(i, i + 2)
            result += sub.substring(1, 2) + sub.substring(0, 1)
        }
        s = result
        return s
    }

    fun decrypt(): String {
        s = encrypt()
        return s
    }
}

// 9. Таблица умножения
fun tableMul(a: Int, b: Int) {
    val size = (a * b).toString().length + 1

    print("".padStart(size))
    for (j in 1 .. b) {
        print(j.toString().padStart(size))
    }
    println()

    for (i in 1 .. a) {
        print( i.toString().padStart(size))

        for (j in 1 .. b) {
            print( (i * j).toString().padStart(size))
        }
        println()
    }
}