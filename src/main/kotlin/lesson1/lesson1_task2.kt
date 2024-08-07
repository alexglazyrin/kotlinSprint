package org.example.lesson1

fun main() {

    var orderCount = 75
    val finalMessage = "Спасибо за покупку!"
    var wockerCount = 2000

    println("Количество покупок: $orderCount. $finalMessage")
    //println("Количество сотрудников магазина: $wockerCount")
    println("Количество сотрудников магазина: ${wockerCount - 1}")
}