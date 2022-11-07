package com.ulima.ulimaPolla.presentation.main.components.Matches

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ulima.ulimaPolla.model.entity.Match
import com.ulima.ulimaPolla.presentation.main.viewmodels.MainViewModel

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun MatchComponent(match : Match , estado : MutableState<Int> ){
    val vm = MainViewModel(LocalContext.current);
    val keyboardController = LocalSoftwareKeyboardController.current
    var apuesta = remember {
        mutableStateOf("")
    }
    Row(
        Modifier.fillMaxSize()
            .border(2.dp, color = Color.Black)
            .height(100.dp),
    ) {
        Column(modifier = Modifier.weight(4.0f)
            .fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally)
        {
            TextMatch(match = match)
        }
        Column(modifier = Modifier.weight(2.0f)) {
            OutlinedTextField(value = apuesta.value ,
                modifier = Modifier.padding(10.dp),
                onValueChange = { if(it == "0" || it == "1" || it == "2" || it == "") apuesta.value = it },
                label = {Text("Apuesta")},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done),
                keyboardActions = KeyboardActions(
                    onDone = {keyboardController?.hide()})
            )
        }
    }
    if(estado.value == 1 && apuesta.value != ""){
        LaunchedEffect(key1 = true){
            vm.postPolla(MainViewModel.user , match.id.toString() , apuesta.value)
        }
    }
}
@Composable
fun TextMatch(match : Match) {
    Text(
        text = match.homeTeam.name + " vs " + match.awayTeam.name,
        fontSize = 25.sp,
        textAlign = TextAlign.Center
    )
}
