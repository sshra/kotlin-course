package com.stimmax.ru.stimmax.kotlincourse.lessons.lesson13.homeworks

import kotlin.random.Random

fun main() {

    // Для решения каждой задачи постарайтесь использовать наиболее подходящий метод, не повторяясь с решением других задач.

    // Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах.
    // Определите среднее время выполнения теста.
    val set1 = mapOf("test1" to 1.1, "test2" to 2.3)
    val avTime = set1.values.average()

    // Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов а значения -
    // строка с метаданными. Выведите список всех тестовых методов.
    val set2 = mapOf("test1" to "metadata1", "test2" to "metadata2")
    println("Task 2: ${set2.keys.joinToString(", ")}")

    //В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.
    val set3 = set2.toMutableMap()
    set3["test3"] = "metadata3"

    //Посчитайте количество успешных тестов в словаре с результатами (ключ - название, значение - результат из passed, failed, skipped).
    val set4 = buildMap {
        for (i in 1 .. 10) {
            put("key$i", (setOf("passed", "failed", "skipped")).random())
        }
    }
    val passedCount = set4.count { it.value == "passed" }

    //Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен (ключ - название, значение - статус исправления).
    val set5 = buildMap {
        for (i in 1 .. 10) {
            put("bug-$i", (setOf(true, false)).random())
        }
    }.toMutableMap()
    val fixedBugs = set5.filter { it.value }
    fixedBugs.forEach { set5.remove(it.key) }
    println("Task 5: $set5")

    // Для словаря с результатами тестирования веб-страниц (ключ — URL страницы, значение — статус ответа),
    // выведите сообщение о странице и статусе её проверки.
    val set6 = buildMap {
        for (i in 1 .. 10) {
            put("https://google.com/page-url-$i", (setOf(200, 404, 500)).random())
        }
    }
    println("Task 6")
    set6.forEach { println("${it.key}: ${it.value}") }

    //Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог.
    val set7 = buildMap {
        for (i in 1 .. 10) {
            put("service-$i", Random.nextDouble(10.0))
        }
    }
    val slowServices = set7.filter { it.value > 5.0 }
    println("Task 7: $slowServices")

    //В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в виде строки).
    // Для указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.
    val set8 = buildMap {
        for (i in 1 .. 10) {
            put("endpoint-$i", (setOf(200, 404, 500)).random().toString())
        }
    }
    println("Task 8")

    val defValue = "Haven't been tested"
    println("Endpoint 8: ${set8.getOrElse("endpoint-8", { defValue })}")
    println("Endpoint 15: ${set8.getOrElse("endpoint-15", { defValue })}")

    // Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации, значение -
    // сама конфигурация), получите значение для "browserType". Ответ не может быть null.
    val set9 = buildMap {
        for (i in 1 .. 10) {
            put("conf-$i", "Conf settings # $i")
        }
    }
    println(set9.getOrDefault("conf-15","Default settings"))


    //Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, добавив новую версию.
    val set10 = buildMap {
        for (i in 1 .. 3) {
            put("Software v$i", "Data of software v$i")
        }
    }

    val usageSample = set10.toMutableMap().apply {
        put("Software v11", "Data of software v11")
    }
    println(usageSample)

    // Используя словарь с настройками тестирования для различных мобильных устройств (ключ — модель устройства,
    // значение - строка с настройками), получите настройки для конкретной модели или верните настройки по умолчанию.
    val set11 = buildMap {
        for (i in 1 .. 3) {
            put("Device Model $i", "Settings data of devive $i")
        }
    }

    val setting5 = set11.getOrDefault("Device Model 5", "Default settings")

    // Проверьте, содержит ли словарь с ошибками тестирования (ключ - код ошибки, значение - описание ошибки)
    // определенный код ошибки.
    val set12 = buildMap {
        for (i in 0 .. 9) {
            put(i, "Description of error # $i")
        }
    }

    val isContainsCode10 = set12.contains(10)

    // Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version",
    // а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped"). Отфильтруйте словарь,
    // оставив только те сценарии, идентификаторы которых соответствуют определённой версии тестов, то-есть в ключе
    // содержится требуемая версия.
    val set13 = buildMap {
        for (i in 1 .. 10) {
            put("${i}_${Random.nextInt(3)}", setOf("Passed", "Failed", "Skipped").random())
        }
    }
    println("Task 13")
    println(set13.filter { it.key.split("_")[1] == "1" })

    // У вас есть словарь, где ключи — это названия функциональных модулей приложения, а значения — результаты их
    // тестирования. Проверьте, есть ли модули с неудачным тестированием.
    val set14 = buildMap {
        for (i in 1 .. 10) {
            put("Module $i", setOf("Passed", "Failed", "Skipped").random())
        }
    }
    println("Task 14")
    println("Has failed modules: ${set14.containsValue( "Failed" )}")

    //Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.
    val set15 = buildMap {
        for (i in 1 .. 10) {
            put("Key $i", "Value $i")
        }
    }.toMutableMap()

    set15.putAll(buildMap {
        for (i in 5 .. 15) {
            put("Key $i", "Value $i sec")
        }
    })
    println("Task 15")
    println("${set15}")

    // Объедините два неизменяемых словаря с данными о багах.
    val set16 = mutableMapOf<String, Boolean>()
        .putAll(set5 + set5)

    // Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.
    val set17 = mutableMapOf<String, Double>()
    set17.clear()

    // Исключите из отчета по автоматизированному тестированию те случаи, где тесты были пропущены
    // (имеют статус “skipped”). Ключи - название теста, значения - статус.
    val set18 = set13.filterValues { it != "skipped" }.toMutableMap() // переиспользую словарь из 13го задания


    // Создайте копию словаря с конфигурациями тестирования удалив из него несколько конфигураций.
    val set19 = set9 - "conf-1" - "conf-2"
    println(set19)

    // Создайте отчет о тестировании, преобразовав словарь с результатами тестирования (ключ — идентификатор теста,
    // значение — результат) в список строк формата "Test ID: результат".
    set13.forEach { println("Test ${it.key.split("_")[0]}: ${it.value}") }

    // Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.
    val task21 = set13.toMutableMap().toMap()

    // Преобразуйте словарь, содержащий числовой ID теста и данные о времени выполнения тестов, заменив идентификаторы
    // тестов на их строковый аналог (например через toString()).
    val data22 = buildMap {
        for (i in 1 .. 10) {
            put(i, Random.nextDouble(10.0))
        }
    }.toMutableMap()
        .mapKeys { it.key.toString() }

    // Для словаря с оценками производительности различных версий приложения (ключи - строковая версия, значения -
    // дробное число времени ответа сервера) увеличьте каждую оценку на 10%, чтобы учесть новые условия тестирования.
    var data23: Map<String, Double> = mapOf("Key" to 4.0)
    data23 = data23.mapValues { it.value * 1.1 }

    //Проверьте, пуст ли словарь с ошибками компиляции тестов.
    val data24: Map<String, String> = mapOf("Test" to "Error message")
    val isEmptyData24 = data24.isEmpty()

    // Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.
    val data25: Map<String, String> = mapOf("Test" to "Test results")
    val isNotEmptyData25 = data25.isNotEmpty()

    // Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.
    val data26: Map<String, Boolean> = mapOf("Test" to true, "Test2" to false)
    val allAreFine = !data26.containsValue(false)

    // Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.
    val data27: Map<String, Boolean> = mapOf("Test" to true, "Test2" to false)
    val hasErrors = data27.containsValue(false)

    // Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты, которые не прошли успешно
    // и содержат в названии “optional”.
    val data28: Map<String, Boolean> = mapOf("Test" to true, "Test2" to false, "Test3 (optional)" to false )
    val data28result = data28.filter() { it.key.contains("optional") && !it.value }

}

