package com.jef.tripgenius.ui.screen.register

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.jef.tripgenius.data.TripGeniusRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor(private val repository: TripGeniusRepository) : ViewModel() {
    private val _name = mutableStateOf("")
    val name: State<String>
        get()=_name

    private val _email = mutableStateOf("")
    val email: State<String>
        get()=_email

    private val _password = mutableStateOf("")
    val password: State<String>
        get()=_password

    private val _username = mutableStateOf("")
    val username: State<String>
        get()=_username

    private val _phone = mutableStateOf("")
    val phone: State<String>
        get()=_phone

    private val _homeTown = mutableStateOf("")
    val homeTown: State<String>
        get() = _homeTown

    fun onEmailChanged(email: String){
        _email.value = email
    }
    fun onPasswordChanged(password: String){
        _password.value = password
    }
    fun onNameChanged(name: String){
        _name.value = name
    }
    fun onUsernameChanged(username: String){
        _username.value = username
    }
    fun onPhoneChanged(phone: String){
        _phone.value = phone
    }
    fun onHomeTownChanged(homeTown: String){
        _homeTown.value = homeTown
    }
}