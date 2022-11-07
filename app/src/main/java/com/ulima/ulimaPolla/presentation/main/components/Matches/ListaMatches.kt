package com.ulima.ulimaPolla.presentation.main.components.Matches

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ulima.ulimaPolla.model.entity.Match

@Composable
fun ListaMatches(
    matches: List<Match>
){
    LazyColumn(modifier = Modifier.padding(bottom = 70.dp)){
        items(matches){
                match -> MatchComponent(match = match)
        }
    }
}