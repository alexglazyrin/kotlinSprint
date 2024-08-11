package org.example.lesson3

fun main() {

    var userSurname = "Андреева"
    val userName = "Татьяна"
    val userPatronymic = "Cергеевна"
    val userAge = 20

    when (userAge) {
        in 0..21 -> userSurname = "Aндреевна"
        in 22..100 -> userSurname = "Сидорова"
    }

    println("$userSurname $userName $userPatronymic, $userAge")
}