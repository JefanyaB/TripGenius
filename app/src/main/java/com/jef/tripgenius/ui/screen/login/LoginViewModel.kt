package com.jef.tripgenius.ui.screen.login

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.gson.Gson
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import com.jef.tripgenius.model.UserPreferences
import com.jef.tripgenius.model.request.LoginRequest
import com.jef.tripgenius.model.response.Data
import com.jef.tripgenius.model.response.ErrorResponse
import com.jef.tripgenius.model.response.LoginResponse
import com.jef.tripgenius.retrofit.ApiConfig


class LoginViewModel(private val pref: UserPreferences): ViewModel(){

    private val _loginResponse = MutableLiveData<LoginResponse>()
    val loginResponse: LiveData<LoginResponse> = _loginResponse

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> = _isLoading

    private val _errorResponse = MutableLiveData<ErrorResponse>()
    val errorResponse: LiveData<ErrorResponse> = _errorResponse


    companion object{
        const val TAG = "MainViewModel"
    }

    fun loginUser(email : String, password : String) {
        _isLoading.value = true
        val loginRequest = LoginRequest(email, password)
        val client = ApiConfig().getApiService().postLogin(loginRequest)

        client.enqueue(object : Callback<LoginResponse> {
            override fun onResponse(
                call: Call<LoginResponse>,
                response: Response<LoginResponse>
            ) {
                _isLoading.value = false
                if (response.isSuccessful) {
                    _loginResponse.value = response.body()
                } else {
                    val error = response.errorBody()
                    val errorJsonString = error?.string()
                    val gson = Gson()
                    _errorResponse.value = gson.fromJson(errorJsonString, ErrorResponse::class.java)
                    Log.e(TAG, "onFailure: ${response.message()}")
                }
            }
            override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
                _isLoading.value = false
                Log.e(TAG, "onFailure: ${t.message.toString()}")
            }

        })
    }
    fun loginDataBase(user: Data){
        viewModelScope.launch{
            pref.login(user)
        }
    }
}