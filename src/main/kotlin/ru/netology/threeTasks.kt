package ru.netology

fun main() {

    val feeRate: Float = 0.75F / 100
    val minFee: Int = 35_00
    val amount: Int = 5_250_00
    val fee: Int = if (amount * feeRate > minFee) (amount * feeRate).toInt() else minFee

    println("Комиссия составила ${fee / 100} руб. ${fee % 100} коп.")


}