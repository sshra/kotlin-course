package com.stimmax.ru.stimmax.kotlincourse.lessons.lesson14.homeworks

fun main() {
    val p = Party("InDaHouse", 10)
    p.details()

    val rack = Rack(3)
    rack.addShelf(Shelf(32).apply {
        addItem("1st Item")
        addItem("Second Item")
    })
    rack.addShelf(Shelf(64).apply {
        addItem("First Item")
        addItem("Second Item")
        addItem("3rd Item")
    })

    rack.printContents()
}