package com.jef.tripgenius.ui.screen.login

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
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


class LoginViewModel(private val pref: UserPreferences): ViewModel() {

    private val _loginResponse = MutableLiveData<LoginResponse>()
    val loginResponse: LiveData<LoginResponse> = _loginResponse

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> = _isLoading

    private val _errorResponse = MutableLiveData<ErrorResponse>()
    val errorResponse: LiveData<ErrorResponse> = _errorResponse

    private val _email = mutableStateOf("")
    val email: State<String>
        get()=_email

    private val _password = mutableStateOf("")
    val password: State<String>
        get()=_password




}