package com.ulima.ulimaPolla.presentation.login.components

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavigationGraph(
    navController : NavHostController,
    codigo : String
){
    NavHost(
        navController = navController,
        startDestination = "ListaEquipos"
    ){
        composable("ListaEquipos"){

        }
        composable("polla/{index}"){

        }
        composable("equipo/{index}"){

        }
    }
}