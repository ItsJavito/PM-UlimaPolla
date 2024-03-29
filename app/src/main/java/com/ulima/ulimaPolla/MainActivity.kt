package com.ulima.ulimaPolla

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.ulima.ulimaPolla.presentation.main.screen.Navegacion
import com.ulima.ulimaPolla.presentation.main.viewmodels.MainViewModel
import com.ulima.ulimaPolla.ui.theme.UlimaPollaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UlimaPollaTheme {
                // A surface container using the 'background' color from the theme
                var name : String? = intent.getStringExtra("name");
                MainViewModel.user = name!!;
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    // Text(text = name!!)
                }
                //MainScreen()
                Navegacion(codigo = name)
            }
        }
    }
}
