package org.example.lesson2

fun main() {

    val crystalOre = 7
    val metalOre = 11
    val buff = 20

    val bonusCrystalOre = crystalOre * buff / 100
    val bonusMetalOre = metalOre * buff / 100

    println("Бонусная кристаллическая руда: ${bonusCrystalOre.toInt()}")
    println("Бонусная металлическая руда: ${bonusMetalOre.toInt()}")

}