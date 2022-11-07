package com.ulima.ulimaPolla.presentation.login.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.ulima.ulimaPolla.presentation.main.components.ListaTeams
import com.ulima.ulimaPolla.presentation.main.components.Matches.ListaMatches
import com.ulima.ulimaPolla.presentation.main.viewmodels.MainViewModel


@Composable
fun MatchesScreen(
    vm : MainViewModel = MainViewModel(LocalContext.current)
){
    LaunchedEffect(key1 = true){
        vm.getMatches()
    }
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        ListaMatches(matches = vm.listaMatches)
        //Row fantasma - Row Muerto - Row
    }

}