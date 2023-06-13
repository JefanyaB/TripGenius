package com.jef.tripgenius.ui.components

import android.view.MenuItem
import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jef.tripgenius.R
import com.jef.tripgenius.model.DataItem
import com.jef.tripgenius.model.DestinasiResponse
import com.jef.tripgenius.model.response.Menu

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuItem(
    menu: Menu,
    modifier: Modifier = Modifier,
) {
    ElevatedCard(
        modifier = modifier.width(450.dp),
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.background,
        ),
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(menu.image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(120.dp)
                    .clip(RoundedCornerShape(8.dp))
            )
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Text(
                    text = menu.title,
                    maxLines = 2,
                    overflow= TextOverflow.Ellipsis,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                )
                Text(
                    text = menu.price,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold,
                )
            }
//            IconButton(onClick = { }) {
//                Icon(
//                    imageVector = Icons.Outlined.ExpandMore,
//                    contentDescription = "Show more"
//                )
//            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun MenuItemPreview() {
    MaterialTheme {
        MenuItem(
            menu = Menu(R.drawable.menu2, "Hot Pumpkin Spice Latte Premium", "Rp 18.000"),
            modifier = Modifier.padding(8.dp)
        )
    }
}