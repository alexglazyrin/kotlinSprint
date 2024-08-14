package org.example.lesson5

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {

    val firstNumber = Random.nextInt(0, 100)
    val secondNumber = Random.nextInt(0, 100)

    println("Введите сумму двух чисел: $firstNumber, $secondNumber")

    val userAnswer = readLine()!!.toInt()
    val systemResponse: String

    if (userAnswer == firstNumber + secondNumber) {
        systemResponse = "Добро пожаловать!"
    } else {
        systemResponse = "Доступ запрещен!"
    }
    println(systemResponse)
}