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

    private val _email = mutableStateOf("")
    val email: State<String>
        get()=_email

    private val _password = mutableStateOf("")
    val password: State<String>
        get()=_password

    fun onEmailChanged(email: String){
        _email.value = email
    }

    fun onPasswordChanged(password: String){
        _password.value = password
    }
    fun LoginUser(toHome: () -> Unit){

    }


}