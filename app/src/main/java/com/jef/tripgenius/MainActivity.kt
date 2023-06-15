package com.jef.tripgenius

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.getValue
import androidx.lifecycle.ViewModelProvider
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
            TripGeniusTheme(darkTheme = false, dynamicColor = false) {
                // Initialize the viewModel property
                viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
                // Now that the viewModel property has been initialized, we can access the startDestination property
                val startDestination by viewModel.startDestination
                TripGeniusApp(startDestination = startDestination)
            }
        }
    }
}
