package com.jef.tripgenius

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.getValue
import com.jef.tripgenius.ui.theme.TripGeniusTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @Inject
    lateinit var viewModel : MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
            TripGeniusTheme {
                val startDestination by viewModel.startDestination
                TripGeniusApp(startDestination = startDestination)
            }
        }
    }
}
