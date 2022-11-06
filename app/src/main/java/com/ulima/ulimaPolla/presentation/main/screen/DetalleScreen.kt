package com.ulima.ulimaPolla.presentation.main.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.ulima.ulimaPolla.model.entity.Team
import com.ulima.ulimaPolla.presentation.main.viewmodels.MainViewModel

@Composable
fun DetalleScreen(
    teamId : Int
){
    val vm = MainViewModel(LocalContext.current)
    LaunchedEffect(key1 = true){
        vm.getTeam(teamId)
    }
    val team : Team = vm.team.value
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = team.name)
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(team.crest)
                .crossfade(true)
                .build(),
            modifier = Modifier.size(width = 500.dp, height = 500.dp),
            contentDescription = "fotoTeam",
        )
        Text(text = "Dirección" , fontWeight = FontWeight.Bold)
        Text(text = team.address)
        Text(text = "Sitio Web" , fontWeight = FontWeight.Bold)
        Text(text = team.website)
        Text(text = "Colores" , fontWeight = FontWeight.Bold)
        Text(text = team.clubColors)
        Text(text = "Estadio" , fontWeight = FontWeight.Bold)
        Text(text = team.venue)
    }
}
