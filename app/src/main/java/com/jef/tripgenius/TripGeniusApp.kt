package com.jef.tripgenius

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.jef.tripgenius.ui.components.BottomBar
import com.jef.tripgenius.ui.navigation.NavGraph
import com.jef.tripgenius.ui.navigation.TripGeniusScreen


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TripGeniusApp(
    modifier: Modifier = Modifier,
    startDestination: String,
    navController: NavHostController = rememberNavController()
){
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Scaffold(
        modifier = modifier,
        bottomBar = {
            if (currentRoute in listOf(TripGeniusScreen.HomeScreen.route,TripGeniusScreen.ProfileScreen.route,TripGeniusScreen.ListScreen.route,TripGeniusScreen.HistoryScreen.route))
                BottomBar(navController)
        }
    ) { paddingValues ->
        NavGraph(
            navController = navController,
            startDestination = startDestination,
            modifier = Modifier.padding(paddingValues)
        )
    }
}