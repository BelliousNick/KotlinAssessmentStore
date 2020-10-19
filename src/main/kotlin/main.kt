package com.kotlin.main

import java.text.NumberFormat
import java.util.*


//All prices in cents
const val PRICE_OF_APPLE: Int = 60
const val PRICE_OF_ORANGE: Int = 25

//Assume CSV
const val delim = ","

fun main(args: Array<String>) {

    println("Enter your order!")
    val input: String? = readLine()
    val newOrder = readOrder(input)

    println(processOrder(newOrder))

}

fun processOrder(order :Order): String {
    var price = (order.apples * PRICE_OF_APPLE) + (order.oranges * PRICE_OF_ORANGE)
    val formatter : NumberFormat = NumberFormat.getCurrencyInstance(Locale.US)
    val formattedPrice = formatter.format(price / 100.0)
    val recipt: String = "Your order of ${order} comes to ${formattedPrice}"
    return recipt
}

fun readOrder(input: String?) : Order {
    val order = Order()
    val orderList = input?.split(delim)
    if (orderList != null) {
        for (item in orderList) {
            when (item) {
                "Apple" -> order.apples++
                "Orange" -> order.oranges++
                else -> println("Skipped Bad Order")
            }
        }
    }
    return order
}