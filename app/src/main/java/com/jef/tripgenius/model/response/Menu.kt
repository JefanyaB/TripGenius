package com.jef.tripgenius.model.response

import com.jef.tripgenius.R

data class Menu(
    val image: Int,
    val title: String,
    val price: String,
)

val dummyMenu = listOf(
    Menu(R.drawable.menu1, "Tiramisu Coffee Milk", "Rp 28.000"),
    Menu(R.drawable.menu2, "Pumpkin Spice Latte", "Rp 18.000"),

)

val dummyBestSellerMenu = dummyMenu.shuffled()