package com.ulima.ulimaPolla.presentation.main.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.ulima.ulimaPolla.presentation.main.components.ListaTeams
import com.ulima.ulimaPolla.presentation.main.viewmodels.MainViewModel

@Composable
fun MainScreen(
    vm : MainViewModel = MainViewModel(LocalContext.current)
){
    LaunchedEffect(key1 = true){
        vm.getTeams()
    }
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        ListaTeams(teams = vm.listaTeams)
        //Row fantasma - Row Muerto - Row
    }

}