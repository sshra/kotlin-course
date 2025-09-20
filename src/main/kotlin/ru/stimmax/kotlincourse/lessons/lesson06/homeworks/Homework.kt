package com.stimmax.ru.stimmax.kotlincourse.lessons.lesson06.homeworks

fun main() {
    filmCategoriesByAge(0)
}

/**
 *  Implementation of Task 1
 */
fun season(month: Byte) {
    val season = when (month) {
        12.toByte(), in 1..2 -> "Winter"
        in 3..5 -> "Spring"
        in 6..8 -> "Summer"
        in 9 .. 11 -> "Autumn"
        else -> "Incorrect month index"
    }
    println(season)
}

/**
 * Implementation of Task 2
 */
fun petAge(age: Short) {
    val humanAge: Double? = when (age) {
        in 0 .. 2 -> age * 10.5
        in 3 .. 50 -> (21 + (age - 2) * 4).toDouble()
        else -> null
    }

    println(humanAge ?: "Incorrect dog age!")
}

/**
 * Implementation of Task 3
 * parameter routeLength: Double (km)
 */
fun bestTransport(routeLength: Double) {
    var result: String? = null
    if (routeLength < 0.0) {
        result = "Error: distance can't be negative!"
    } else if (0.0 <= routeLength && routeLength <= 1.0) {
        result = "walk"
    } else if (1 < routeLength && routeLength <= 5) {
        result = "bicycle"
    } else {
        result = "car"
    }

    println(result)
}

/**
 * Implementation of Task 4
 * parameter routeLength: Double (km)
 */
fun bonusScore(spentAmount: Double) {
    var score: Int? = null
    if (spentAmount >= 0.0) {
       score = if (spentAmount <= 1000)
                (spentAmount / 100 * 2).toInt()
            else
                20 + ((spentAmount - 1000) / 100 * 3).toInt()
    }
    println(score ?: "Incorrect Amount value (it should not be negative.")
}

/**
 * Implementation of Task 5
 */
fun documentType(filename: String) {
    val extension = filename.substringAfterLast('.', "")
    var returnType: String = "Unknown type"

    if (extension == "txt") {
        returnType = "Text"
    } else if (extension in arrayOf("jpg", "png", "svg", "bmp", "webp")) {
        returnType = "Image"
    } else if (extension in arrayOf("xls", "xlsx")) {
        returnType = "Table"
    }

    println(returnType)
}

/**
 * Implementation of Task 6
 */
const val ABSOLUTE_ZERO_CELCIUM = -273.15
const val ABSOLUTE_ZERO_FAHRENHEIT = -459.67
fun temperatureConvertor(temperature: Double, type: Char) {

    var result: Double? = null
    val resultType: Char? = when (type) {
        'C' -> 'F'
        'F' -> 'C'
        else -> null
    }

    if (resultType == null) {
        println("Incorrect temperature type (it should be C/F)")
    } else {
        if (type == 'C' && temperature >= ABSOLUTE_ZERO_CELCIUM) {
            result = temperature * 1.8 + 32
        } else if (type == 'F' && temperature >= ABSOLUTE_ZERO_FAHRENHEIT) {
            result = (temperature - 32) * 0.5556
        }

        println(result ?: "Given temperature value is below the absolute zero!")
        println(if (result == null) "" else resultType)
    }
}

/**
 * Implementation of Task 7
 */
fun outfitRecommendation(temperature: Int) {
    val result = when (temperature) {
        in -30 ..9 -> "Jacket and Warm Hat"
        in 10 ..18 -> "Light Jacket"
        in 19 ..35 -> "Shorts and T-shirt"
        else -> "Please, stay home! Don't go outside."
    }

    println(result)
}

/**
 * Implementation of Task 8
 */
fun filmCategoriesByAge(age: Int) {
    val categories: Map<Int, String> = mapOf(
        0 to "for children",
        10 to "for teenagers",
        18 to "18+"
    )

    val availableCategories: MutableList<String> = mutableListOf()

    for ((key, value) in categories) {
        if (age >= key) {
            availableCategories.add(value)
        }
    }

    println(availableCategories)
}