package org.example.lesson5

fun main() {

    val firstNumber = (1..42).random()
    val secondNumber = (1..42).random()
    val thirdNumber = (1..42).random()


    val numbers = listOf(firstNumber, secondNumber, thirdNumber)

    println("Введите три числа: ")
    println("Первое: ")
    val firstUserNumber = readln().toInt()
    println("Второе: ")
    val secondUserNumber = readln().toInt()
    println("Третье: ")
    val thirdUserNumber = readln().toInt()

    val userNumbers = listOf(firstUserNumber, secondUserNumber, thirdUserNumber)
    val winNumberCount = numbers.intersect(userNumbers).size

    when (winNumberCount) {
        3 -> println("Вы угадали все 3 числа и выиграли джекпот!")
        2 -> println("Вы угадали 2 числа из 3 и получаете крупный приз!")
        1 -> println("Вы угадали 1 число из 3 и получаете утешительный приз!")
        else -> println("Вы не угадали ни одного числа. Попробуйте еще раз!")
    }

    println(numbers)
}