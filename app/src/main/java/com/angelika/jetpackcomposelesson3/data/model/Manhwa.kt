package com.angelika.jetpackcomposelesson3.data.model

data class Manhwa(
    val name: String,
    val author: String,
    val rating: Double,
    val releaseDate: Int,
    val lastRealise: Int,
    val month: String,
    val year: Int,
    val money: Int,
    val image: String
)