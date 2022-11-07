package com.ulima.ulimaPolla.presentation.main.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ulima.ulimaPolla.model.entity.Team


@Composable
fun DetalleComponent(stateTeam : MutableState<Team>){
    val team = stateTeam.value;
    val bottom1 = 10.dp;
    val bottom2 = 12.dp;
    val start = 30.dp;
    val tamFont = 20.sp;
    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .padding(top=20.dp)
        ){
            Text(
                text = team.name,
                textAlign = TextAlign.Center,
                fontSize = 30.sp
            )
        }

        if(team.crest.isNotEmpty()){
            TeamImage(url = team.crest, width = 500.dp , height = 300.dp)
        }
        Row(modifier = Modifier.padding(bottom = 20.dp)) {}

            //Direccion
        Text(text = "Dirección" ,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = start, bottom = bottom1),
            fontSize = tamFont)
        Text(text = team.address,
            modifier = Modifier.padding(start = start ,bottom = bottom2))

            //Sitio web
        Text(text = "Sitio Web" ,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = start, bottom = bottom1),
            fontSize = tamFont)
        Text(text = evaluarVariable(team.website , "No tiene sitio web"),
            modifier = Modifier.padding(start = start ,bottom = bottom2))

            //Colores
        Text(text = "Colores",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = start, bottom = bottom1),
            fontSize = tamFont)

        Text(text = team.clubColors,
            modifier = Modifier.padding(start = start,bottom = bottom2))

            //Estadio
        Text(text = "Estadio" ,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = start, bottom = bottom1),
            fontSize = tamFont)
        Text(text = evaluarVariable(team.venue , "No tiene estadio"),
            modifier = Modifier.padding(start = start,bottom = bottom2))

    }
}

private fun evaluarVariable( variable : String? , texto : String): String {
    return if(variable.isNullOrBlank()) texto else variable
}