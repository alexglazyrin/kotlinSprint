package org.example.lesson3

fun main() {

    var motionFrom = "D2"
    var motionTo = "D4"
    var motionNumber = 0

    var motionToServer = "$motionFrom-$motionTo;$motionNumber"

    val parts = motionToServer.split("-")
    motionFrom = parts[0]
    val parts2 = parts[1].split(";")
    motionTo = parts2[0]
    motionNumber = parts2[1].toInt()

    println("""
        $motionFrom
        $motionTo
        $motionNumber
    """.trimIndent())
}