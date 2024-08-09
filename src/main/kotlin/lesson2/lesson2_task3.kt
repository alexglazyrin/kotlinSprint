package org.example.lesson2

fun main(){

    val departureTimeHours = 9
    val departureTimeMinutes = 39
    val travelTime = 457
    val minutesInHour = 60
    val arrivalTimeInMinutes = departureTimeHours * minutesInHour + departureTimeMinutes + travelTime

    var arrrivalTimeHours = arrivalTimeInMinutes / minutesInHour
    var arrrivalTimeMinutes = arrivalTimeInMinutes % minutesInHour

    println("Время прибытия поезда: ${arrrivalTimeHours}:${arrrivalTimeMinutes}")

}