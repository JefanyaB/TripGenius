package com.jef.tripgenius.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.jef.tripgenius.ui.screen.login.LoginScreen

@Composable
fun NavGraph(
    navController: NavHostController,
    startDestination: String,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier,
    ) {
        composable(TripGeniusScreen.LoginScreen.route){
            LoginScreen(
                toHome = {
                    navController.navigate(TripGeniusScreen.HomeScreen.route){
                        popUpTo(TripGeniusScreen.LoginScreen.route){
                            inclusive = true
                        }
                    }
                },
                toRegister = {
                    navController.popBackStack()
                    navController.navigate(TripGeniusScreen.RegisterScreen.route)
                }
            )
        }
    }
}