package com.ulima.ulimaPolla.presentation.main.components

import android.widget.ImageView
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.ulima.ulimaPolla.model.entity.Team

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun TeamComponent(team : Team){
    println(team.crest);
    Row(modifier =
        Modifier.fillMaxWidth()
            .border(2.dp, Color.Black) // borde
            .padding(2.dp).
            clickable {
                // TODO: LOGICA PARA IR AL DETALLE DEL EQUIPO
            }
        ) {
        Column(modifier = Modifier.weight(2.0f)) {
            TeamImage(url = team.crest)
        }
        Column(modifier = Modifier.weight(5.0f)) {
            Text(text = team.name , fontWeight = FontWeight.Bold)
            Text(text = "fundado" + team.founded)
        }
    }
}