package org.example.lesson4

fun main() {

    val isSunny = true
    val isOpen = true
    val humidity = 20
    val season = "Зима"


    println(
        "Благоприятные ли условия сейчас для роста бобовых? " +
                "${
                    isSunny == GOOD_IS_SUNNY
                            && isOpen == GOOD_IS_OPEN
                            && humidity >= MIN_GOOD_HUMIDITY
                            && !season.equals(
                        NOT_GOOD_SEASON,
                        true
                    )
                }"
    )

}

const val GOOD_IS_SUNNY = true
const val GOOD_IS_OPEN = true
const val MIN_GOOD_HUMIDITY = 20
const val NOT_GOOD_SEASON = "зима"