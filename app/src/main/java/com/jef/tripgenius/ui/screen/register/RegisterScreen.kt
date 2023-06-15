package com.jef.tripgenius.ui.screen.register

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.jef.tripgenius.R
import com.jef.tripgenius.ui.components.CustomButton
import com.jef.tripgenius.ui.components.EmailTextField
import com.jef.tripgenius.ui.components.PasswordTextField

@Composable
fun RegisterScreen(
    modifier: Modifier = Modifier,
    toLogin: () -> Unit,
    registerViewModel:RegisterViewModel
){
    Column(modifier = modifier.padding(16.dp)) {
        val email by registerViewModel.email
        val password by registerViewModel.password

        Text(stringResource(R.string.login), style = MaterialTheme.typography.displaySmall)
        EmailTextField(
            email = email,
            onValueChange = registerViewModel:: onEmailChanged,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(15.dp))
        PasswordTextField(
            password = password,
            onValueChange = registerViewModel:: onPasswordChanged,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(15.dp))
        CustomButton(
            text = "Login".uppercase(),
            onClick = {

            },
            modifier = Modifier.fillMaxWidth()
        )
    }
}