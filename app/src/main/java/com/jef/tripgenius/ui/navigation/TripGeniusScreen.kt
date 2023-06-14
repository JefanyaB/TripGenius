package com.jef.tripgenius.ui.navigation

sealed class TripGeniusScreen(val route:String){
    object LoginScreen : TripGeniusScreen("login_screen")
    object RegisterScreen : TripGeniusScreen("register_screen")
    object HomeScreen : TripGeniusScreen("home_screen")
    object ProfileScreen : TripGeniusScreen("profile_screen")
    object ListScreen : TripGeniusScreen("list_screen")
    object HistoryScreen : TripGeniusScreen("history_screen")
    object DetailScreen : TripGeniusScreen("detail_screen")
}