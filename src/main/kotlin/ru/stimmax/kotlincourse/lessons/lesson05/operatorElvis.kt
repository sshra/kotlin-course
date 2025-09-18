package com.stimmax.ru.stimmax.kotlincourse.lessons.lesson05

fun main() {
    val userLang: String? = null
    val defaultLang = "English"
    val currentLang = userLang ?: defaultLang

    println (currentLang)

    val innerAccumulator = 5000
    val externalAccumulator: Int? = 2000
    val powerBank = innerAccumulator + (externalAccumulator ?: 0)

    println ( powerBank )

    val goodsInContainer: String? = null
    val checkedGoods = goodsInContainer ?: "Товара нет"

    println (checkedGoods)

    val price = 80.0
    val discountInPercent: Double? = null
    val discount = price * (discountInPercent ?: 100.0) / 100.0
    val discountPrice = price - price * discount

    println (discountPrice)
}
