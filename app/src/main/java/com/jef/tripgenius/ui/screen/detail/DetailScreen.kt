package com.jef.tripgenius.ui.screen.detail

import android.provider.Settings.Global.getString
import android.telecom.Call.Details
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jef.tripgenius.Banner
import com.jef.tripgenius.R
import com.jef.tripgenius.TripGeniusApp
import com.jef.tripgenius.model.DataItem
import com.jef.tripgenius.model.DestinasiResponse
import com.jef.tripgenius.model.response.Menu
import com.jef.tripgenius.ui.components.MenuItem
import com.jef.tripgenius.ui.components.SearchBar
import com.jef.tripgenius.ui.theme.TripGeniusTheme


@Composable
fun DetailScreen(modifier: Modifier, detail : DataItem) {
    Column(
        modifier = modifier
            .verticalScroll(rememberScrollState())
            .width(450.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.gunung),
            contentDescription = "Banner Image",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .height(90.dp)
                .fillMaxWidth()
        )
        Text(
            text = detail.name,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(R.drawable.baseline_star_24),
                contentDescription = "Banner Image",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .size(15.dp)
                    .fillMaxWidth()
            )
            Text(
                text = detail.rating,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                fontSize = 10.sp,
                fontWeight = FontWeight.Bold,
            )
        }
        Text(
            text = "Deskripsi",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
        )
        Text(
            text = detail.description,
            fontSize = 10.sp,
        )
        Text(
            text = "Rekomendasi Hotel",
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ){

        }

    }
}



@Composable
@Preview(showBackground = true)
fun DetailScreenPreview() {
    MaterialTheme {
       DetailScreen(
           Modifier,
           detail = DataItem("Gunung", "gunung nya indah", "Gunung", "Bandung",
               "Gunung Tanggkuban Perahu", "3", "Gunung Tangkuban Parahu) adalah salah satu gunung yang terletak di Lembang, Kabupaten Bandung Barat, Provinsi Jawa Barat, Indonesia. Sekitar 20 km ke arah utara Kota Bandung, dengan rimbun pohon pinus dan hamparan kebun teh di sekitarnya, Gunung Tangkuban Parahu mempunyai ketinggian setinggi 2.084 meter. Bentuk gunung ini adalah Stratovulcano dengan pusat erupsi yang berpindah dari timur ke barat. Jenis batuan yang dikeluarkan melalui letusan .",
               1,"12","1","2" ) )
    }
}