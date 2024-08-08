package org.example.lesson2

fun main(){

    val startBalance = 70_000
    val depositPercent = 16.7
    var finalDeposit: Double = startBalance.toDouble()

    for (year in 1..20){
        finalDeposit = finalDeposit + finalDeposit * depositPercent / 100
        println("Сумма на вкладе после $year года: ${"%.3f".format(finalDeposit)}")
    }
}