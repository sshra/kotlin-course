package com.stimmax.ru.stimmax.kotlincourse.lessons.lesson14.homeworks

class Moon(var isVisible: Boolean = false, var phase: String) {
    fun showPhase() {
        println("Current Moon phase: $phase")
    }
}