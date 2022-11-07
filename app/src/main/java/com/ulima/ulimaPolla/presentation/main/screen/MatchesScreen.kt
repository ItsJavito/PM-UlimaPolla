package com.ulima.ulimaPolla.presentation.login.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .padding(top=20.dp)
        ){
            Text(
                text = "Polla",
                textAlign = TextAlign.Center,
                fontSize = 30.sp
            )
        }
        ListaMatches(matches = vm.listaMatches)
        //Row fantasma - Row Muerto - Row
    }

}