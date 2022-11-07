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
import com.ulima.ulimaPolla.presentation.main.components.DetalleComponent
import com.ulima.ulimaPolla.presentation.main.viewmodels.MainViewModel

@Composable
fun DetalleScreen(
    teamId : Int
){
    val vm = MainViewModel(LocalContext.current)
    LaunchedEffect(key1 = true){
        vm.getTeam(teamId)
    }
    DetalleComponent(stateTeam = vm.team)
}
