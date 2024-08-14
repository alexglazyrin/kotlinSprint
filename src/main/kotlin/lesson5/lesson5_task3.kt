package org.example.lesson5

fun main() {

    println("Введите первое число: ")
    val firstNumber = readLine()!!.toInt()
    println("Введите второе число: ")
    val secondNumber = readLine()!!.toInt()
    var isWin = false
    var isHalfWin = false

    when (firstNumber) {
        FIRST_WIN_NUMBER -> {
            if (secondNumber == SECOND_WIN_NUMBER)
                isWin = true
            isHalfWin = true
        }
        SECOND_WIN_NUMBER -> {
            if (secondNumber == FIRST_WIN_NUMBER)
                isWin = true
            isHalfWin = true
        }
    }
    when (secondNumber) {
        FIRST_WIN_NUMBER -> {
            if (firstNumber == SECOND_WIN_NUMBER)
                isWin = true
            isHalfWin = true
        }
        SECOND_WIN_NUMBER -> {
            if (firstNumber == FIRST_WIN_NUMBER)
                isWin = true
            isHalfWin = true
        }
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