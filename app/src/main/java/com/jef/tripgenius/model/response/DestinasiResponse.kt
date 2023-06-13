package com.jef.tripgenius.model

import com.google.gson.annotations.SerializedName

data class DestinasiResponse(

	@field:SerializedName("data")
	val data: List<DataItem?>? = null,

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)

data class DataItem(

	@field:SerializedName("coodinate")
	val coodinate: String,

	@field:SerializedName("image")
	val image: String,

	@field:SerializedName("city")
	val city: String,

	@field:SerializedName("price")
	val price: String,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("rating")
	val rating: String,

	@field:SerializedName("description")
	val description: String,

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("category")
	val category: String,

	@field:SerializedName("lat")
	val lat: String,

	@field:SerializedName("long")
	val jsonMemberLong: String
)
