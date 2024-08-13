package org.example.lesson4

fun main() {

    val tableToday = 13
    val tableTomorrow = 9

    println("Доступность столиков на сегодня: ${tableToday < TABLES}")
    println("Доступность столиков на завтра: ${tableTomorrow < TABLES}")
}

const val TABLES = 13
