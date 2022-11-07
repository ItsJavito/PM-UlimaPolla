package com.ulima.ulimaPolla.presentation.main.components.Matches

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.ulima.ulimaPolla.model.entity.Match

@Composable
fun MatchComponent(match : Match){
    var apuesta = remember {
        mutableStateOf("")
    }

    Row(
        Modifier.fillMaxSize()
    ) {
        Column(modifier = Modifier.weight(4.0f)) {
            TextMatch(match = match)
        }
        Column(modifier = Modifier.weight(2.0f)) {
            OutlinedTextField(value = apuesta.value , onValueChange = {
                apuesta.value = it
            },
            label = {Text("Apuesta")})
        }
    }
}
@Composable
fun TextMatch(match : Match){
    Text(text = match.homeTeam.name + " vs " + match.awayTeam.name)
}
