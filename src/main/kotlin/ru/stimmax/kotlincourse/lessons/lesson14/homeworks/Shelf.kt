package com.stimmax.ru.stimmax.kotlincourse.lessons.lesson14.homeworks

class Shelf(val capacity: Int) {
    private val items = mutableListOf<String>()
    private var curLength = 0

    fun addItem(name: String): Boolean {
        if (!canAccommodate(name)) return false;
        curLength += name.length
        items.add(name)
        return true
    }

    fun removeItem(nameToRemove: String): Boolean {
        val result = items.remove(nameToRemove)
        if (result) {
            curLength -= nameToRemove.length
        }
        return result
    }

    fun canAccommodate(nameOfCandidate: String): Boolean {
        return curLength + nameOfCandidate.length <= capacity
    }

    fun containsItem(nameOfCandidate: String): Boolean {
        return items.contains(nameOfCandidate)
    }

    fun getItems(): List<String> {
        return items.toList()
    }

    fun getCurrentCapacity() = curLength
}