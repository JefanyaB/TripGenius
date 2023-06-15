package com.jef.tripgenius


import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.jef.tripgenius.data.TripGeniusRepository
import com.jef.tripgenius.ui.navigation.TripGeniusScreen
import javax.inject.Inject

class MainViewModel @Inject constructor(private val repository: TripGeniusRepository): ViewModel(){
    private val _isLoading: MutableState<Boolean> = mutableStateOf(true)
    val isLoading: State<Boolean> = _isLoading

    private val _startDestination: MutableState<String> = mutableStateOf(TripGeniusScreen.LoginScreen.route)
    val startDestination: State<String> = _startDestination

    init{
        _startDestination.value = TripGeniusScreen.LoginScreen.route
    }
}