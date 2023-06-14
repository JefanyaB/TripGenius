package com.jef.tripgenius.ui.screen.login

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jef.tripgenius.data.TripGeniusRepository
import com.jef.tripgenius.ui.common.UiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class LoginViewModel @Inject constructor(private val repository : TripGeniusRepository) : ViewModel() {

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
        viewModelScope.launch {
            repository.loginUser(_email.value, _password.value)
                .collect {
                    when (it){
                        is UiState.Loading -> {
                        }
                        is UiState.Success -> {
                            Log.d("berhasil", "ini Jalan")
                            toHome()
                        }
                        is UiState.Error -> {

                        }
                    }
                }
        }
    }

}