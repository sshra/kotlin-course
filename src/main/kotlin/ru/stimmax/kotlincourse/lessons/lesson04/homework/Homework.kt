package ru.stimmax.kotlincourse.lessons.lesson04.homework

import java.lang.Boolean.TRUE
import java.lang.Boolean.FALSE

val v1: Byte = 42
val v2: Long = 98765432123456789L
val v3: Float = 23.45f
val v4: Double = 0.123456789
val v5: String = "Kotlin & Java"

// тут FALSE нужно написать как false или импортировать java.lang.Boolean.FALSE
// далее буду использвать импорт
// val v6: Boolean = FALSE

val v7: Char = 'c'
val v8: Int = 500
val v9: Long = 4294967296L
val v10: Float = 18.0f
val v11: Double = -0.001
val v12: String = "OpenAI"
val v13: String = "true"
val v14: List<Byte> = listOf(3, 14)
val v15: Char = '9'
val v16: Short = 2048
val v17: Long = 10000000000L
val v18: Set<String> = setOf("OpenAI", "Quantum Computing")
val v19: Float = 5.75f

// строка требует двойныз кавычек
// val v20: String = `1.414`

val v21: String = "Artificial Intelligence"
val v22: Array<Any> = arrayOf('x', "A")
val v23: String = "Android Studio"
val v24: Char = '@'
val v25: Short = 1024
val v26: Long = 1234567890123L
val v27: Float = 10.01f
val v28: Double = -273.15
val v29: String = "SpaceX"
val v30: Boolean = FALSE
val v31: Double = 0.007

// Должны быть обычные двойный кавычки
// val v32: String = “🤯”

val v33: Map<String, Byte> = mapOf("true" to 2, "false" to 34)

// строка требует двойныз кавычек
// val v34: String = ‘65535’

val v35: Long = 72057594037927935L
val v36: Float = 2.71828f
val v37: Double = 101.0101
val v38: String = "Quantum Computing"
val v39: Map<Int, String> = mapOf(2 to "true", 34 to "false")
val v40: Char = 'x'
val v41: Short = 314
val v42: Long = 123456789123456789L
val v43: Float = 6.626f
val v44: Boolean = TRUE

// вторая часть дз
// Подбери подходящий тип который будет:

// Хранить букву, на которую указывает палец медиума во время спиритического сеанса.
var mediumChar: Char? = null

//Хранить количество ложек сахара, которые я кладу в одну чашку чая.
var sugarAmount: Byte = 0

// Хранить список расходов на доставку еды, чтобы ещё раз убедиться, что готовить было дешевле.
var foodDeliveryExpense: Double = 0.0

//Хранить длину очереди в столовой до миллиардной доли сантиметра.
var queueLength: Double = 0.0

//Хранить факт, закрыт ли баг после того, как его просто переименовали в фичу.
var isBugClosed: Boolean = true

//Хранить количество свистков чайника за день.
var teapotNoiseCount: Short = 0

//Хранить количество нажатий котом на клавиатуру ноутбука за всё время твоей работы.
var catButtonTapsCount: Short = 0

//Хранить количество попыток пересчитать звёзды на небе за всю историю человечества.
var starsAttemptsCount: Long = 0

//Хранить массу воздуха в спускающем матрасе после нападения кота в долях грамма.
var airWeight: Double = 0.0

//Хранить словарь «название стартапа → сумму потерь инвесторов».
val startups: Map<String, Double> = mapOf()

//Хранить строку «починилось само», чтобы закрывать тикеты без лишних слов.
const val selfRepairedText: String = "починилось само"

//Хранить список тем для митингов, которые на самом деле никому не нужны.
val meetingTopics: MutableList<String> = mutableListOf()
