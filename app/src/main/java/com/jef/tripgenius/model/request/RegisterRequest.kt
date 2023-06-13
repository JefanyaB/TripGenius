package com.jef.tripgenius.model.request

data class RegisterRequest (
    var name: String,
    var username: String,
    var email: String,
    var password: String,
    var phone: String,
    var home_town: String
)