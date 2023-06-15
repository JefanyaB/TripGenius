package com.jef.tripgenius.data

import android.hardware.biometrics.BiometricPrompt.AuthenticationResult
import com.jef.tripgenius.model.request.LoginRequest
import com.jef.tripgenius.model.response.LoginResponse
import com.jef.tripgenius.retrofit.ApiService
import com.jef.tripgenius.ui.common.UiState
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class TripGeniusRepository @Inject constructor(
    private val apiService: ApiService

) {

    suspend fun loginUser(email: String, password: String) : Flow<UiState<LoginResponse>> = flow{
        emit(UiState.Loading)
        try {
            val loginRequest = LoginRequest(email,password)
            emit(UiState.Success(apiService.postLogin(loginRequest)))
        } catch (e: Exception){
            emit(UiState.Error(e.message ?: "Error Happened"))
        }
    }
}