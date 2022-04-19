package ru.netology

fun main() {

    var currentPrice: Int = 1_012_00
    var musicFan: Boolean = true
    val discountFan: Float = (1.0f / 100)
    val discount: Float = (5.0f / 100)
    val discountFix: Int = 100_00

    val priceMin: Int = 1_000_00
    val priceMax: Int = 10_000_00
    val pricePlus: Int = 1_00
    var discountPrice: Int = 0


    if (currentPrice < priceMin + pricePlus) {
        discountPrice = currentPrice;

    } else if (currentPrice >= priceMin + pricePlus && currentPrice < priceMax + pricePlus) {
        discountPrice = currentPrice - discountFix;

    } else if (currentPrice >= priceMax + pricePlus) {
        discountPrice = (currentPrice * (1 - discount)).toInt()
    }

    if (musicFan) {
        discountPrice = (discountPrice * (1 - discountFan)).toInt()
    }

    println("Сумма покупок ${currentPrice / 100} руб. ${currentPrice % 100} коп.")
    println("Сумма с учетом скидок  ${discountPrice / 100} руб. ${discountPrice % 100} коп.")
    println("Ваша скидка составила ${(currentPrice - discountPrice) / 100} руб. ${(currentPrice - discountPrice) % 100} коп.")


    // другой вариант: сумма больше, а статуса "меломана" нет
    currentPrice = 10_200_00
    musicFan = false


    if (currentPrice < priceMin + pricePlus) {
        discountPrice = currentPrice;

    } else if (currentPrice >= priceMin + pricePlus && currentPrice < priceMax + pricePlus) {
        discountPrice = currentPrice - discountFix;

    } else if (currentPrice >= priceMax + pricePlus) {
        discountPrice = (currentPrice * (1 - discount)).toInt()
    }

    if (musicFan) {
        discountPrice = (discountPrice * (1 - discountFan)).toInt()
    }

    println("\n\nСумма покупок ${currentPrice / 100} руб. ${currentPrice % 100} коп.")
    println("Сумма с учетом скидок  ${discountPrice / 100} руб. ${discountPrice % 100} коп.")
    println("Ваша скидка составила ${(currentPrice - discountPrice) / 100} руб. ${(currentPrice - discountPrice) % 100} коп.")


}