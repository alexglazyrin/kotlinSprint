package org.example.lesson1

fun main() {

    val flyingGagarinInSeconds = 6480 // Нашел только про 108 минут информацию.
    val hour = flyingGagarinInSeconds / 3600
    val minutes = flyingGagarinInSeconds % 3600 / 60
    val seconds = flyingGagarinInSeconds % 3600 % 60

    println("Полет Ю. Гагарина длился: $hour:$minutes:$seconds")
}