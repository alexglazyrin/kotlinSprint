package org.example.lesson3

fun main() {

    var motionFrom = "E2"
    var motionTo = "E4"
    var motionNumber = 1

    var motionToServer = "[$motionFrom-$motionTo;$motionNumber]"
    println(motionToServer)

    motionFrom = "D2"
    motionTo = "D3"
    motionNumber++

    motionToServer = "[$motionFrom-$motionTo;$motionNumber]"
    println(motionToServer)
}