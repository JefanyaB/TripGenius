package com.jef.tripgenius.ui.screen.login

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.jef.tripgenius.R
import com.jef.tripgenius.ui.components.CustomButton
import com.jef.tripgenius.ui.components.EmailTextField
import com.jef.tripgenius.ui.components.PasswordTextField


@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    toHome: () -> Unit,
    toRegister: () -> Unit,
    loginViewModel: LoginViewModel = hiltViewModel()
){
    Column(modifier = modifier.padding(16.dp)) {
        val email by loginViewModel.email
        val password by loginViewModel.password

        Text(stringResource(R.string.login), style = MaterialTheme.typography.displaySmall)
        EmailTextField(
            email = email,
            onValueChange = loginViewModel:: onEmailChanged,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(15.dp))
        PasswordTextField(
            password = email,
            onValueChange = loginViewModel:: onPasswordChanged,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(15.dp))
        CustomButton(
            text = "Login".uppercase(),
            onClick = {
                loginViewModel.LoginUser(toHome)
            },
            modifier = Modifier.fillMaxWidth()
        )
    }
}