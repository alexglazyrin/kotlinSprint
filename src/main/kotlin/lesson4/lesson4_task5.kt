package org.example.lesson4

fun main() {
    val isSafe = false
    val crewCount = 60
    val foodCrates = 51
    val isGoodWeather = true

    if (
        (isSafe == IS_SAFE
                && crewCount in CREW_COUNT_MIN..CREW_COUNT_MAX
                && foodCrates >= FOOD_CRATES_COUNT_MIN
                && isGoodWeather == GOOD_WEATHER)
        || (isSafe != IS_SAFE
                && crewCount >= CREW_COUNT_MAX
                && foodCrates >= FOOD_CRATES_COUNT_MIN
                && isGoodWeather == GOOD_WEATHER)
    ) {
        println("Корабль может приступить к долгосрочному плаванию!")
    } else {
        println("Корабль не может приступить к долгосрочному плаванию!")
    }
}

const val IS_SAFE = true
const val CREW_COUNT_MIN = 55
const val CREW_COUNT_MAX = 70
const val FOOD_CRATES_COUNT_MIN = 50
const val GOOD_WEATHER = true