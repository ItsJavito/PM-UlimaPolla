package com.ulima.ulimaPolla.presentation.main.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.ViewModel
import com.ulima.ulimaPolla.presentation.main.components.ListaTeams
import com.ulima.ulimaPolla.presentation.main.viewmodels.MainViewModel
import com.ulima.ulimaPolla.presentation.main.viewmodels.MainViewModelFactory

@Composable
fun MainScreen(
    vm : MainViewModel = MainViewModel(LocalContext.current)
){
    LaunchedEffect(key1 = true){
        vm.getTeams()
    }
    ListaTeams(teams = vm.listaTeams)
}