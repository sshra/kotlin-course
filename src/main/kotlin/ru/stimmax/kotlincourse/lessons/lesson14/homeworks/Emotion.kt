package com.stimmax.ru.stimmax.kotlincourse.lessons.lesson14.homeworks

class Emotion(val type: String, val intensity: Int) {
    fun express() {
        println("Emotion type: $type, intensity: $intensity.")
    }
}