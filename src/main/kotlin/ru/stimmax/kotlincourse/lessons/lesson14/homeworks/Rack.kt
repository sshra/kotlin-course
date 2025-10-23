package com.stimmax.ru.stimmax.kotlincourse.lessons.lesson14.homeworks

class Rack(val maxShelfs: Int) {
    private val shelfs = mutableListOf<Shelf>()

    fun addShelf(shelf: Shelf): Boolean {
        if (shelfs.size >= maxShelfs || shelfs.contains(shelf)) return false
        shelfs.add(shelf)
        return true
    }

    fun removeShelf(index: Int): List<String> {
        if (shelfs.size > index) {
            val shelf = shelfs.removeAt(index)
            return shelf.getItems()
        } else {
            return emptyList<String>()
        }
    }

    fun removeItem(item: String): Boolean {
        for (shelf in shelfs) {
            if (shelf.removeItem(item)) {
                return true
            }
        }
        return false
    }

    fun containsItem(item: String): Boolean {
        for (shelf in shelfs) {
            if (shelf.containsItem(item)) {
                return true
            }
        }
        return false
    }

    fun getShelves():List<Shelf> = shelfs.toList()

    fun printContents() {
        for (index in shelfs.indices) {
            val shelf = shelfs.get(index)
            println("--------------------------------")
            println("-- Shelf #$index, capacity: ${shelf.getCurrentCapacity()}/${shelf.capacity}")
            println("-------------------------------")
            var i = 0
            for (item in shelf.getItems()) {
                println("${++i}. ${item}")
            }
        }
    }

    fun advancedRemoveShelf(shelfIndexToDelete: Int): List<String> {
        val removedItems = removeShelf(shelfIndexToDelete)
            .sortedWith(compareBy<String> { it.length } )
            .reversed()

        println(removedItems.toString())
        if (removedItems.size == 0) {
            return removedItems
        }

        val undistributedItems = mutableListOf<String>()
        for (item in removedItems) {
            var distributed = false
            for (shelf in shelfs) {
                if (shelf.addItem(item)) {
                    distributed = true
                    break
                }
            }
            if (!distributed) {
                undistributedItems.add(item)
            }
        }

        return undistributedItems.toList()
    }
}