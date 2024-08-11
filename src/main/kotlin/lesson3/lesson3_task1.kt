package org.example.lesson3

fun main() {
    val userName = "User"
    val hourOfDay: Int = 19
    var welcomeMsg: String? = null

    when (hourOfDay) {
        in 0..5 -> welcomeMsg = "Доброй ночи"
        in 6..12 -> welcomeMsg = "Доброе утро"
        in 13..18 -> welcomeMsg = "Добрый день"
        in 19..24 -> welcomeMsg = "Добрый вечер"
    }

    println("$welcomeMsg, $userName!")
}