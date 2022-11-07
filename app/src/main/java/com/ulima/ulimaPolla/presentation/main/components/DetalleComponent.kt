package com.ulima.ulimaPolla.presentation.main.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.decode.SvgDecoder
import coil.request.ImageRequest
import com.ulima.ulimaPolla.model.entity.Team

@Composable
fun DetalleComponent(stateTeam : MutableState<Team>){
    val team = stateTeam.value;
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = team.name)
        if(team.crest.isNotEmpty()){
            TeamImage(url = team.crest, width = 500.dp , height = 500.dp)
        }
        Text(text = "Dirección" , fontWeight = FontWeight.Bold)
        Text(text = team.address)
        Text(text = "Sitio Web" , fontWeight = FontWeight.Bold)
        Text(text = evaluarVariable(team.website , "No tiene sitio web"))
        Text(text = "Colores" , fontWeight = FontWeight.Bold)
        Text(text = team.clubColors)
        Text(text = "Estadio" , fontWeight = FontWeight.Bold)
        Text(text = evaluarVariable(team.venue , "No tiene estadio"))
    }
}

private fun evaluarVariable( variable : String? , texto : String): String {
    return if(variable.isNullOrBlank()) texto else variable
}