package org.example.lesson2

fun main(){

    val studentPoint1: Int = 3
    val studentPoint2: Int = 4
    val studentPoint3: Int = 3
    val studentPoint4: Int = 5

    val overagePoint: Double = (studentPoint1 + studentPoint2 + studentPoint3 + studentPoint4)/4.0
    println("%.2f".format(overagePoint))
}