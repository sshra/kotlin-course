package com.stimmax.ru.stimmax.kotlincourse.lessons.lesson14.homeworks

// У него должны быть свойства “группа”, “место проведения”, “стоимость”, “вместимость зала”.
// Также приватное поле “проданные билеты”. Добавьте метод, который выводит информацию о концерте и метод
// “купить билет”, который увеличивает количество проданных билетов на один.

class Concert(val band: String, val location: String, val ticketPrice: Double, val hallVolume: Int) {
    private var soldTicketNumber: Int = 0

    fun info() {
        println("We have a concert of band $band on $location.")
    }

    fun purchaseTicket(): Boolean {
        if (soldTicketNumber < hallVolume) {
            soldTicketNumber ++
            return true
        } else {
            return false
        }
    }
}