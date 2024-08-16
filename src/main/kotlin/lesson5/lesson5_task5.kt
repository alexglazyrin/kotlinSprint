package org.example.lesson5

fun main() {

    val numbers = listOf(
        getRandomNumber(),
        getRandomNumber(),
        getRandomNumber()
    )

    println("Введите три числа (разделяя пробелом): ")

    val userNumbers = readln().split(" ").map { it.toString().toInt() }
    val winNumberCount = numbers.intersect(userNumbers).size

    when (winNumberCount) {
        3 -> println("Вы угадали все 3 числа и выиграли джекпот!")
        2 -> println("Вы угадали 2 числа из 3 и получаете крупный приз!")
        1 -> println("Вы угадали 1 число из 3 и получаете утешительный приз!")
        else -> println("Вы не угадали ни одного числа. Попробуйте еще раз!")
    }

    println(numbers)
}

fun getRandomNumber(): Int {
    return (1..42).random()
}

const val MIN_NUMBER = 1
const val MAX_NUMBER = 42