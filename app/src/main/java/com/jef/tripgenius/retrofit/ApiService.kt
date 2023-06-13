package com.jef.tripgenius.retrofit

import com.jef.tripgenius.model.DestinasiResponse
import com.jef.tripgenius.model.request.LoginRequest
import com.jef.tripgenius.model.request.RegisterRequest
import com.jef.tripgenius.model.response.LoginResponse
import com.jef.tripgenius.model.response.RegisterResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface ApiService {
    @POST("/v1/auth/register")
    fun registerUser(
        @Body request: RegisterRequest,
    ): Call<RegisterResponse>

    @POST("/v1/auth/login")
    fun loginUser(
        @Body request: LoginRequest,
    ): Call<LoginResponse>

    @GET("/v1/data/destination")
    fun stories(
        @Header("Authorization") token: String
    ): Call<DestinasiResponse>

}