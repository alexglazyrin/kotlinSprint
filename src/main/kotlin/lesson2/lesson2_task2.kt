package org.example.lesson2

fun main() {

    val worker = 50
    val workerSalary = 30_000
    val student = 30
    val studentSalary = 20_000

    val workerSalarySummary = workerSalary * worker
    val allSalarySummary = workerSalarySummary + (studentSalary * student)
    val overrageSalary = allSalarySummary / (worker + student)

    println("Сумма затрат на зарплаты постоянным работникам: $workerSalarySummary рублей")
    println("Сумма затрат на зарплаты всем работникам: $allSalarySummary рублей")
    println("Средняя зарплата сотрудника: $overrageSalary рублей")
}