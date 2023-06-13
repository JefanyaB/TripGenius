package com.jef.tripgenius.ui.screen.login

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.jef.tripgenius.R

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    toHome: () -> Unit,
    toRegister: () -> Unit,
    viewModel: LoginViewModel
){
    Column(modifier = modifier.padding(16.dp)){
        Text(stringResource(R.string.login), style = MaterialTheme.typography.displaySmall)

    }

}