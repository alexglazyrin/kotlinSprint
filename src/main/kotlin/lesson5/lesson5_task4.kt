package org.example.lesson5

fun main() {

    println("Введи, пожалуйста, свое имя пользовател: ")
    val userName = readln()
    if (userName == ADMIN_NAME) {
        println("Введите пароль: ")
        val userPassword = readln()
        if (userPassword == ADMIN_PASSWORD) {
            println("Добро пожаловать, $userName")
        } else {
            println("Доступ запрещен!")
        }
    }else{
        println("$userName, вам необходимо зарегистрироваться!")
    }
}

const val ADMIN_NAME = "Zaphod"
const val ADMIN_PASSWORD = "PanGalactic"