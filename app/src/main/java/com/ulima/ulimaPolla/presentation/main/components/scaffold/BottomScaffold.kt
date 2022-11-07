package com.ulima.ulimaPolla.presentation.main.components.scaffold

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun BottomScaffold(
    navController: NavHostController,
){
    val isSelectedEquipos = remember {
        mutableStateOf(true)
    }
    val isSelectedPolla = remember {
        mutableStateOf(false)
    }

    var colorEquipos = remember {
        mutableStateOf(Color.DarkGray)
    }
    var colorPolla = remember {
        mutableStateOf(Color.LightGray)
    }
    Row(
        modifier = Modifier.fillMaxWidth()
            .height(100.dp),
    ) {
        //Box 1
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.weight(1f)
                .fillMaxHeight()
                .padding(0.dp)
                .background(colorEquipos.value)
                .clickable {
                    //si estaba en la pantalla de polla
                    if(isSelectedPolla.value){
                        isSelectedPolla.value = false;
                        isSelectedEquipos.value = true;
                        colorEquipos.value = Color.DarkGray
                        colorPolla.value = Color.LightGray
                        navController.navigate("ListaEquipos");
                    }
                    else if(isSelectedEquipos.value){
                        // no hace nada, y no hagas nada porfa
                    }
                }
                .border(1.dp, Color.DarkGray)
        ){
            Text(
                text = "Equipos",
                textAlign = TextAlign.Center,
                fontSize = 25.sp
            )
        }
        //Box 2
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.weight(1f)
                .fillMaxHeight()
                .padding(0.dp)
                .background(colorPolla.value)
                .clickable {
                    //si estaba en la pantalla de equipos
                    if(isSelectedEquipos.value){
                        isSelectedPolla.value = true;
                        isSelectedEquipos.value = false;
                        colorPolla.value = Color.DarkGray
                        colorEquipos.value = Color.LightGray
                        navController.navigate("matches")
                    }
                    else if(isSelectedPolla.value){
                        // no hace nada, y no hagas nada porfa
                    }
                }
                .border(1.dp, Color.DarkGray)
        ){
            Text(
                text = "Polla",
                textAlign = TextAlign.Center,
                fontSize = 25.sp
            )
        }
    }
}