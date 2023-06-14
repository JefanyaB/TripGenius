package com.jef.tripgenius.ui.screen.home

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
import androidx.navigation.NavHostController
import com.jef.tripgenius.R
import com.jef.tripgenius.model.BottomBarItem
import com.jef.tripgenius.model.response.Menu
import com.jef.tripgenius.model.response.dummyMenu
import com.jef.tripgenius.ui.components.HomeSection
import com.jef.tripgenius.ui.components.MenuItem
import com.jef.tripgenius.ui.components.SearchBar
import com.jef.tripgenius.ui.theme.TripGeniusTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TripGeniusApp(modifier: Modifier = Modifier) {

    Banner()

    HomeSection(
        title = stringResource(R.string.title_menu),
        content = { MenuRow(listMenu = dummyMenu) }
    )
}

@Composable
fun Banner(
    modifier: Modifier = Modifier,
) {
    Box(modifier = modifier) {
        Image(
            painter = painterResource(R.drawable.background),
            contentDescription = "Banner Image",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.height(160.dp)
        )
        SearchBar()
    }
}

@Composable
fun MenuRow(
    listMenu: List<Menu>,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        state = rememberLazyListState(),
    ) {
        items(listMenu, key = { it.title }) { menu ->
            MenuItem(menu)
        }
    }
}

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun TripGeniusPreview() {
    TripGeniusTheme{
        TripGeniusApp()
    }
}