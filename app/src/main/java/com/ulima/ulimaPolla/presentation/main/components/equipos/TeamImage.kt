package com.ulima.ulimaPolla.presentation.main.components

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.decode.SvgDecoder
import coil.request.ImageRequest

@Composable
fun TeamImage(url : String , width : Dp , height : Dp) {
    val dotPos = url.lastIndexOf(".");
    val extension = url.substring(dotPos , url.length);
    if(extension.equals(".png")){
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(url)
                .crossfade(true)
                .build(),
            modifier = Modifier.size(width = width, height = height),
            contentDescription = "fotoTeam",

        )
    }
    else if(extension.equals(".svg")){
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(url)
                .crossfade(true)
                .decoderFactory(SvgDecoder.Factory())
                .build(),
            modifier = Modifier.size(width = width, height = height),
            contentDescription = "fotoTeam"
        )
    }
}