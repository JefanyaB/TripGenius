package com.jef.tripgenius.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PasswordTextField(modifier: Modifier, password:String, onValueChange:(String)->Unit) {
    OutlinedTextField(
        value = password, //display state
        onValueChange = onValueChange,
        label = { Text("Password") },
        visualTransformation = PasswordVisualTransformation() ,
        modifier = modifier
            .clip(RoundedCornerShape(6.dp))
            .background(Color(0x1F6E8C))
            .padding(14.dp)


    )
}
@Preview(showBackground = true)
@Composable
fun PasswordView(){
    PasswordTextField(modifier = Modifier, password = "" , onValueChange = {} )
}