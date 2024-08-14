package org.example.lesson4

fun main() {

    var dayCount = 5
    var isEven = true

    if (dayCount % 2 == 0) {

        println(
            """
            Упражнения для рук: $isEven
            Упражнения для ног: ${!isEven}
            Упражнения для спины: ${!isEven}
            Упражнения для пресса: $isEven
        """.trimIndent()
        );
    } else {

        println(
            """
            Упражнения для рук: ${!isEven}
            Упражнения для ног: $isEven
            Упражнения для спины: $isEven
            Упражнения для пресса: ${!isEven}
        """.trimIndent()
        );
    }
}