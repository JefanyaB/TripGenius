package com.jef.tripgenius

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jef.tripgenius.model.BottomBarItem
import com.jef.tripgenius.model.response.Menu
import com.jef.tripgenius.model.response.dummyMenu
import com.jef.tripgenius.ui.components.HomeSection
import com.jef.tripgenius.ui.components.MenuItem
import com.jef.tripgenius.ui.components.SearchBar
import com.jef.tripgenius.ui.screen.home.TripGeniusApp
import com.jef.tripgenius.ui.theme.TripGeniusTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TripGeniusTheme {
                TripGeniusApp()
            }
        }
    }
}
