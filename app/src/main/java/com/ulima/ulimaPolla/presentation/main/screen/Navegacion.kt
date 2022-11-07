package com.ulima.ulimaPolla.presentation.main.screen

import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.ulima.ulimaPolla.presentation.login.components.NavigationGraph
import com.ulima.ulimaPolla.presentation.main.components.scaffold.BottomScaffold
import com.ulima.ulimaPolla.presentation.main.viewmodels.MainViewModel

@Composable
fun Navegacion(
    codigo : String?
){
    val navController = rememberNavController()
    MainViewModel.navController = navController;
    val scaffoldState = rememberScaffoldState()

    Scaffold(
        bottomBar = {
            BottomScaffold(navController = navController)
        },
    )
    //No toques. DE VERDAD NO TOQUES. RICARDO EN SERIO NO LO TOQUES
    {it
        NavigationGraph(
            navController =  navController,
            codigo =  codigo!!,
        )
    }
}