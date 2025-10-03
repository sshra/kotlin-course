package com.stimmax.ru.stimmax.kotlincourse.lessons.lesson08.homeworks

fun main() {
    val testFrases = arrayOf(
        "Это невозможно выполнить за один день",
        "Я не уверен в успехе этого проекта",
        "Произошла катастрофа на сервере",
        "Этот код работает без проблем",
        "Удача"
    );

    for (test in testFrases) {
        println(stringTransform(test));
    }

    dateExtraction("Пользователь вошел в систему -> 2021-12-01 09:48:23")

    println(getAbbreviation("In my humble opinion"))
}

// 1. Преобразование строк
fun stringTransform(s: String): String {
    var result = s
        .replace("невозможно", "совершенно точно возможно, просто требует времени")
        .replace("катастрофа", "интересное событие");

    if (result.startsWith("Я не уверен")) {
        result += ", но моя интуиция говорит об обратном"
    }

    val withoutProblems = "без проблем"
    if (result.endsWith(withoutProblems)) {
        result = result.substring(0, result.length - withoutProblems.length) + "с парой интересных вызовов на пути"
    }

    if (s.split(" ").size == 1) {
        result = "Иногда," + s + ", но не всегда"
    }

    return result
}

// 2. Извлечение даты из строки лога
fun dateExtraction(log: String) {
    val datePattern = Regex("""\d{4}-\d{2}-\d{2}""")
    val timePattern = Regex("""\d{2}:\d{2}:\d{2}""")

    try {
        println(
            "Date: ${datePattern.findAll(log).first().groupValues[0]}  Time: ${
                timePattern.findAll(log).first().groupValues[0]
            }"
        )
    } catch (e: Exception) {
        println ("Date-time record is not found!")
    }
}

// 3. Маскирование личных данных
fun maskCreditCard(card: String): String {
    return "**** **** **** " + card.split(" ")[3]
}

// 4. Форматирование адреса электронной почты
fun formatEmail(mail: String): String {
    return mail.replace("@", " [at] ").replace(".", " [dot] ")
}

// 5. Извлечение имени файла из пути.
fun extractFileName(path: String): String {
    return path.split("/").last()
}

// 6. Создание аббревиатуры из фразы.
fun getAbbreviation(phrase: String): String {
    var result = ""
    for (word in phrase.split(" ")) {
        result += word[0]
    }

    return result.uppercase()
}
