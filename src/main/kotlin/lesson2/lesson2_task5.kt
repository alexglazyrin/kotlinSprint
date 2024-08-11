package org.example.lesson2

import java.lang.Math.pow

fun main() {

    val startBalance = 70_000
    val depositPercent = 16.7
    var finalDeposit: Double = startBalance.toDouble()
    val accrualPeriods = 1
    val depositPeriod: Double = 20.0

    finalDeposit = startBalance * pow((1 + (depositPercent / 100) * accrualPeriods), depositPeriod)
    println("Сумма на вкладе за $depositPeriod лет: ${"%.3f".format(finalDeposit)}")
}