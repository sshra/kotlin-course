package com.stimmax.ru.stimmax.kotlincourse.lessons.lesson05.homeworks

fun main() {
    // Задача 1
    val soundVolumeStart: Double = 100.0
    val soundDegradeKoef: Double? = null
    val soundVolumeFinal: Double = soundVolumeStart * (soundDegradeKoef ?: 0.5)

    println("Final sound level is " + soundVolumeFinal.toString())

    // Задача 2
    val shipmentPrice: Double? = 2000.0 // $
    val shipmentInsuranceRate: Double = 0.005 // 0.5%
    val shipmentPriceTotal = (shipmentPrice ?: 50.0) * (1.0 + shipmentInsuranceRate)

    println("Shipment price total is " + shipmentPriceTotal.toString())

    // Задача 3
    val values: Array<Double?> = arrayOf(5.0, 10.0, null)
    // ищем показатели со значением NULL
    val nullValues = values.filter { it == null  }

    if (nullValues.size > 0 ) {
        println("One or more values have been lost!")
    } else {
        println("All values are OK!")
    }

    //  Задача 3.1
    val value: Double? = 10.0
    val message = "Value has been lost!"
    println("The value status: " + (value ?: message))

}