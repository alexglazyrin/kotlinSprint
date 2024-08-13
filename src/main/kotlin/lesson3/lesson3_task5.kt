package org.example.lesson3

fun main() {

    var motionFrom = "D2"
    var motionTo = "D4"
    var motionNumber = 0

    var motionToServer = "$motionFrom-$motionTo;$motionNumber"

    val parts = motionToServer.split("-", ";")
    motionFrom = parts[0]
    motionTo = parts[1]
    motionNumber = parts[2].toInt()

    println("""
        $motionFrom
        $motionTo
        $motionNumber
    """.trimIndent())
}