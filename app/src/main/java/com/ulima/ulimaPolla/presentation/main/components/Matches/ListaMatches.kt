package com.ulima.ulimaPolla.presentation.main.components.Matches

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ulima.ulimaPolla.model.entity.Match

@Composable
fun ListaMatches(
    matches: List<Match>,
    estado: MutableState<Int>
){
    Column(modifier = Modifier
        .padding(bottom = 100.dp)
        .verticalScroll(rememberScrollState())){
        matches.filter{
          it.awayTeam.name != null
        }.forEach {
            MatchComponent(match = it, estado = estado)
        }
    }
}