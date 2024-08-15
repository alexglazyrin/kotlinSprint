package org.example.lesson5

import java.time.Year

fun main() {

    println("Введите год вашего рождения:")

    val userYearBorn = readln()!!.toInt()
    val thisYear = Year.now().toString().toInt()

    if (thisYear - userYearBorn >= AGE_OF_MAJORITY)
        println("Показать экран со скрытым контентом")

}

const val AGE_OF_MAJORITY = 18