package com.ulima.ulimaPolla.presentation.main.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun BottomScaffold(
    navController: NavHostController
){
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Button(
            onClick = {navController.navigate("ListaEquipos")}
            ){
            Text(text = "Equipos")
        }
        Button(
            onClick = {navController.navigate("PollaScreen")}
        ){
            Text(text = "Polla")
        }
    }
}