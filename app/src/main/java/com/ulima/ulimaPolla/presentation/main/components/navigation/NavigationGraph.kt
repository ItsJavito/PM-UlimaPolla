package com.ulima.ulimaPolla.presentation.login.components

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.ulima.ulimaPolla.presentation.login.screen.MatchesScreen
import com.ulima.ulimaPolla.presentation.main.screen.DetalleScreen

import com.ulima.ulimaPolla.presentation.main.screen.MainScreen
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
            MainScreen()
        }
        composable("equipo/{index}"){
            backStackEntry ->
            val id = backStackEntry.arguments?.getString("index")!!;
            DetalleScreen(teamId = Integer.parseInt(id))
        }
        composable("matches"){
            MatchesScreen()
        }
    }
}