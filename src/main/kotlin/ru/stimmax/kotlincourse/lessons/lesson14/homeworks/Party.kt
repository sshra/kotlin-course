package com.stimmax.ru.stimmax.kotlincourse.lessons.lesson14.homeworks

class Party(val location: String, val attendees: Int) {
    fun details() {
        println("Where: ${this.location}, guests: $attendees.")
    }
}