package org.example.lesson1

fun main() {

    val year = 1961
    var hour: String = "09"
    var minute: String = "07"

    println("Время взлета:")
    println("Год: $year")
    println("Часы: $hour")
    println("Минуты: $minute")

    hour = "10"
    minute = "55"

    println("Время посадки: $hour:$minute")
}