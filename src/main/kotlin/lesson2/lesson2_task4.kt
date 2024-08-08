package org.example.lesson2

fun main(){

    val crystalOre = 7
    val metalOre = 11
    val buff = 0.2f

    val bonusCrystalOre = crystalOre * buff
    val bonusMetalOre = metalOre * buff

    println("Бонусная кристаллическая руда: ${bonusCrystalOre.toInt()}")
    println("Бонусная металлическая руда: ${bonusMetalOre.toInt()}")

}