package org.example.lesson5

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {

    val firstNumber = (1..10).random()
    val secondNumber = (1..10).random()

    println("Введите сумму двух чисел: $firstNumber, $secondNumber")

    val userAnswer = readLine()?.toInt()
    val systemResponse: String

    if (userAnswer == firstNumber + secondNumber) {
        systemResponse = "Добро пожаловать!"
    } else {
        systemResponse = "Доступ запрещен!"
    }
    println(systemResponse)
}