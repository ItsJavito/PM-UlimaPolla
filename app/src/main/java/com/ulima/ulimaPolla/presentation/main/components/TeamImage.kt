package com.ulima.ulimaPolla.presentation.main.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import coil.compose.AsyncImage
import coil.decode.SvgDecoder
import coil.request.ImageRequest

@Composable
fun TeamImage(url : String) {
    val dotPos = url.lastIndexOf(".");
    val extension = url.substring(dotPos , url.length);
    if(extension.equals(".png")){
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(url)
                .crossfade(true)
                .build(),
            contentDescription = "fotoTeam"
        )
    }
    else if(extension.equals(".svg")){
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(url)
                .crossfade(true)
                .decoderFactory(SvgDecoder.Factory())
                .build(),
            contentDescription = "fotoTeam"
        )
    }
}