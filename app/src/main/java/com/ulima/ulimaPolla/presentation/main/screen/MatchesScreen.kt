package com.ulima.ulimaPolla.presentation.login.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ulima.ulimaPolla.R
import com.ulima.ulimaPolla.presentation.main.components.Matches.ListaMatches
import com.ulima.ulimaPolla.presentation.main.viewmodels.MainViewModel


@Composable
fun MatchesScreen(
    vm : MainViewModel = MainViewModel(LocalContext.current)
){
    var estado = remember{
        mutableStateOf(0)
    }
    LaunchedEffect(key1 = true){
        vm.getMatches()
    }
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .padding(top = 20.dp)

        ){
            Text(
                text = "Polla",
                textAlign = TextAlign.Center,
                fontSize = 30.sp,
                modifier = Modifier.weight(8f)
                    .padding(top=8.dp)
            )
            Image(
                painterResource(R.drawable.save_floppy_disk_diskette_512),
                contentDescription = "estrella" ,
                Modifier.size(size = 40.dp)
                    .align(Alignment.CenterVertically)
                    .weight(2f)
                    .padding(bottom = 10.dp)
                    .clickable {
                        estado.value = 1;
                    }
            )

        }
        ListaMatches(matches = vm.listaMatches , estado = estado)
        //Row fantasma - Row Muerto - Row
    }

}