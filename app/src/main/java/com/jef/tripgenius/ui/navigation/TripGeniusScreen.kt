package com.jef.tripgenius.ui.navigation

sealed class TripGeniusScreen(val route:String){
    object LoginScreen : TripGeniusScreen("login")
    object RegisterScreen : TripGeniusScreen("register")
    object HomeScreen : TripGeniusScreen("home")
    object ProfileScreen : TripGeniusScreen("profile")
    object ListScreen : TripGeniusScreen("list")
    object HistoryScreen : TripGeniusScreen("history")
    object DetailScreen : TripGeniusScreen("detail/{id}"){
        fun createRoute(id:String) = "result/$id"
    }
}