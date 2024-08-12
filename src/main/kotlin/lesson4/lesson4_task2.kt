package org.example.lesson4

fun main() {

    val cargoWeight = 20
    val cargoVolume = 80

    println("Груз с весом $cargoWeight кг и объемом $cargoVolume л соответствует категории 'Average': " +
            "${(AVERAGE_MIN_WEIGHT < cargoWeight
                    && cargoWeight <= AVERAGE_MAX_WEIGHT) 
                    && cargoVolume < AVERAGE_MAX_VOLUME}")

}

const val AVERAGE_MIN_WEIGHT = 35
const val AVERAGE_MAX_WEIGHT = 100
const val AVERAGE_MAX_VOLUME = 100