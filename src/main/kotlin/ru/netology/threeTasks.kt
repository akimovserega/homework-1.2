package ru.netology

fun main() {

    val likes: Int = 1101

    // если последняя цифра 1, но не 11, то "человеку"
    // если 0
    if (likes < 1) {
        println("У Вас нет лайков")
    } else {
        println("Понравилось ${if (likes % 10 == 1 && likes % 100 != 11) "$likes человеку" else "$likes людям"}")
    }


}