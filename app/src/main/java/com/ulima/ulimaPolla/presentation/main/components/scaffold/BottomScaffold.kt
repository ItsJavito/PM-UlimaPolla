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
    val isSelected = remember {
        mutableStateOf(false)
    }
    Row(
        modifier = Modifier.fillMaxWidth()
            .height(100.dp)
            .background(Color.LightGray),
    ) {
        //Box 1
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.weight(1f)
                .fillMaxHeight()
                .padding(0.dp)
                .clickable {
                    navController.navigate("ListaEquipos");
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
                .clickable {
                    navController.navigate("matches")
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