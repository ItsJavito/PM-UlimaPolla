package com.ulima.ulimaPolla.presentation.main.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.ulima.ulimaPolla.model.entity.Team

@Composable
fun ListaTeams(
    teams : List<Team>
){
    LazyColumn{
        items(teams){
            team -> TeamComponent(team = team)
        }
    }
}