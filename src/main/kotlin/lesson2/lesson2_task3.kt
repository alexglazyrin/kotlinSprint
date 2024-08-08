package org.example.lesson2

fun main(){

    val departureTimeHours = 9
    val departureTimeMinutes = 39
    val travelTime = 457
    val arrivalTimeInMinutes = departureTimeHours * 60 + departureTimeMinutes + travelTime

    var arrrivalTimeHours = arrivalTimeInMinutes / 60
    var arrrivalTimeMinutes = arrivalTimeInMinutes % 60

    println("Время прибытия поезда: ${arrrivalTimeHours}:${arrrivalTimeMinutes}")

}