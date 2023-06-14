package com.jef.tripgenius.ui.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun CustomButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    text:String,
    enabled : Boolean = true
){
    Button(
        modifier = modifier,
        contentPadding = PaddingValues(16.dp),
        enabled = enabled,
        onClick = onClick
    ){
        Text(text, fontWeight = FontWeight.Bold)
    }
}