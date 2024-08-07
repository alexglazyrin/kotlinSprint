package org.example.lesson1

fun main() {

    val flyingGagarinInSeconds = 6480 // Нашел только про 108 минут информацию.
    val hour = String.format("%02d", (flyingGagarinInSeconds / 3600))
    val minutes = String.format("%02d", (flyingGagarinInSeconds % 3600 / 60))
    val seconds = String.format("%02d", (flyingGagarinInSeconds % 3600 % 60))

    println("Полет Ю. Гагарина длился: $hour:$minutes:$seconds")
}