package org.example.lesson5

fun main() {

    println("Введите первое число: ")
    val firstNumber = readln().toInt()
    println("Введите второе число: ")
    val secondNumber = readln().toInt()
    var isWin = false
    var isHalfWin = false

    if ((firstNumber == FIRST_WIN_NUMBER && secondNumber == SECOND_WIN_NUMBER) ||
        (firstNumber == SECOND_WIN_NUMBER && secondNumber == FIRST_WIN_NUMBER)
    ) {
        isWin = true
    } else if ((firstNumber == FIRST_WIN_NUMBER || secondNumber == FIRST_WIN_NUMBER) ||
        (firstNumber == SECOND_WIN_NUMBER || secondNumber == SECOND_WIN_NUMBER)
    ) {
        isHalfWin = true
    }

    if (isWin)
        println("Вы выиграли главный приз")
    else if (isHalfWin)
        println("Вы выиграли поощрительный приз")
    else
        println("Испытайте удачу еще раз")
}

const val FIRST_WIN_NUMBER = 16
const val SECOND_WIN_NUMBER = 25