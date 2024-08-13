package org.example.lesson4

fun main() {

    var armDay = true
    var legDay = false
    var backDay = false
    var squadDay = true
    var dayCount = 5

    if (dayCount % 2 == 0) {
        armDay = true
        legDay = false
        backDay = false
        squadDay = true

        println(
            """
            Упражнения для рук: $armDay
            Упражнения для ног: $legDay
            Упражнения для спины: $backDay
            Упражнения для пресса: $squadDay
        """.trimIndent()
        );
    } else {
        armDay = false
        legDay = true
        backDay = true
        squadDay = false

        println(
            """
            Упражнения для рук: $armDay
            Упражнения для ног: $legDay
            Упражнения для спины: $backDay
            Упражнения для пресса: $squadDay
        """.trimIndent()
        );
    }
}