package com.ulima.ulimaPolla

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ulima.ulimaPolla.presentation.login.screen.LoginScreen
import com.ulima.ulimaPolla.ui.theme.UlimaPollaTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginScreen(onLoginClick = pasarAlMain)
        }
    }
    //funcion para pasar al main, si se ingresa correctamente
    val pasarAlMain : (String) -> Unit  = { name: String ->
        val intent = Intent(this,  MainActivity::class.java);
        intent.putExtra("name", name);
        startActivity(intent);
        finish()
    }
}