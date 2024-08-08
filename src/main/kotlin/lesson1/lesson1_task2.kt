package org.example.lesson1

fun main() {

    val orderCount = 75
    val finalMessage = "Спасибо за покупку!"
    var workerCount = 2000

    println("Количество покупок: $orderCount. $finalMessage")
    //println("Количество сотрудников магазина: $wockerCount")
    workerCount--
    println("Количество сотрудников магазина: $workerCount")
}