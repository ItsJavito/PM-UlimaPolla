package com.ulima.ulimaPolla.presentation.login.screen

import android.content.Intent
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.core.content.ContextCompat.startActivity
import com.ulima.ulimaPolla.presentation.login.components.LoginFields

@Composable
fun LoginScreen(onLoginClick : (String) -> Unit){
    var name = remember {
        mutableStateOf("")
    }
    LoginFields(
        name = name.value,
        onNameChange = { name.value = it},
        onLoginClick = onLoginClick
    )
}


