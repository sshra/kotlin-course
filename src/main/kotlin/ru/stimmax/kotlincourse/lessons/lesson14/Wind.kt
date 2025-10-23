package com.stimmax.ru.stimmax.kotlincourse.lessons.lesson14

class Wind(var speedKmPerHour: Double) {
    fun convertToMetersPerSeconds() = speedKmPerHour / 3.6

    fun setSpeed(speed: Double) {
        if (speed >= 0) {
            speedKmPerHour = speed
        }
    }
}