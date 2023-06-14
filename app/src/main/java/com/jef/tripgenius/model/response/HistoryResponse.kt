package com.jef.tripgenius.model.response

import com.google.gson.annotations.SerializedName

data class HistoryResponse(

	@field:SerializedName("data")
	val data: HistorySuccess? = null,

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)

data class HistorySuccess(

	@field:SerializedName("kendaraan")
	val kendaraan: Any? = null,

	@field:SerializedName("restaurant")
	val restaurant: Any? = null,

	@field:SerializedName("hotel")
	val hotel: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("destinasi")
	val destinasi: String? = null
)
