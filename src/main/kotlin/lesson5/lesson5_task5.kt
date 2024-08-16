package org.example.lesson5

fun main() {

    val randomNumber = { (1..42).random().toInt() }

    val numbers = listOf(
        randomNumber(),
        randomNumber(),
        randomNumber()
    )
    println(numbers)

    println("Введите три числа (разделяя пробелом): ")

    val userNumbers = readln().split(" ").map { it.toString().toInt() }
    val winNumberCount = numbers.intersect(userNumbers).size

    when (winNumberCount) {
        3 -> println("Вы угадали $winNumberCount числа и выиграли джекпот!")
        2 -> println("Вы угадали $winNumberCount числа из 3 и получаете крупный приз!")
        1 -> println("Вы угадали $winNumberCount число из 3 и получаете утешительный приз!")
        else -> println("Вы не угадали ни одного числа. Попробуйте еще раз!")
    }

    println(numbers)
}