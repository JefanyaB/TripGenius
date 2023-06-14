package com.jef.tripgenius.ui.navigation

import androidx.compose.ui.graphics.vector.ImageVector

data class TripGeniusItem(
    val title : String,
    val icon : ImageVector,
    val screen : TripGeniusScreen
)