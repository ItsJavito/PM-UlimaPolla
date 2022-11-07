package com.ulima.ulimaPolla.presentation.main.components

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.ulima.ulimaPolla.model.entity.Team
import com.ulima.ulimaPolla.presentation.main.viewmodels.MainViewModel

@Composable
fun TeamComponent(team : Team){
    println(team.crest);
    val navController = MainViewModel.navController
    Row(modifier =
        Modifier.fillMaxWidth()
            .border(2.dp, Color.Black) // borde
            .padding(2.dp).
            clickable {
                //TODO: LOGICA PARA IR AL DETALLE DEL EQUIPO
                navController.navigate("equipo/${team.id}")
            }
        ) {
        Column(
            modifier = Modifier.weight(2.0f),
            horizontalAlignment = Alignment.CenterHorizontally
            ) {
            TeamImage(url = team.crest, width = 100.dp , height = 80.dp)
        }
        Column(modifier = Modifier.weight(5.0f),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.SpaceBetween) {
            Text(text = team.name , fontWeight = FontWeight.Bold)
            Text(text = "fundado" + team.founded)
        }
    }
}