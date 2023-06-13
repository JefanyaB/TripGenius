package com.jef.tripgenius.model.response

import com.google.gson.annotations.SerializedName

data class LoginResponse(

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("avatar")
	val avatar: String,

	@field:SerializedName("message")
	val message: String,

	@field:SerializedName("accessToken")
	val accessToken: String,

	@field:SerializedName("email")
	val email: String,

	@field:SerializedName("status")
	val status: Boolean,

	@field:SerializedName("username")
	val username: String
)
