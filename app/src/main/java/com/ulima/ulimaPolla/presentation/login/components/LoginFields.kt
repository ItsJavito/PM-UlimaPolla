package com.ulima.ulimaPolla.presentation.login.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ulima.ulimaPolla.R


@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun LoginFields (
    name: String,
    onNameChange: (String) -> Unit,
    onLoginClick: (String) -> Unit
){
    val keyboardController = LocalSoftwareKeyboardController.current
//Padre
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    )
    {
        //Columna fantasma - Hijo Fantasma - Hijo 0
        Column(){}
        //Primer hijo
        Image(
            painterResource(R.drawable.polla),
            contentDescription = "polla" ,
            Modifier.size(size = 100.dp)
                .padding(top = 30.dp)
        )
        //Segundo hijo
        Text(text = "Polla Ulima",
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(20.dp),
            fontSize = 25.sp)
        //Tercer Hijo
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Text(text = "20192624 \n",
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(0.dp),
                fontSize = 20.sp)
            Text(text = "20191425 \n",
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(0.dp),
                fontSize = 20.sp)
            Text(text = "20191923",
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 20.dp),
                fontSize = 20.sp)
        }
        //Cuarto hijo
        OutlinedTextField(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 50.dp, top = 0.dp, end = 50.dp, bottom = 0.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number,
            imeAction = ImeAction.Done),
            keyboardActions = KeyboardActions(
                onDone = {keyboardController?.hide()}),
            value = name,
            onValueChange = onNameChange,
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Green,
                unfocusedBorderColor = Color.Gray))
        //Quinto Hijo
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {}
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                modifier =Modifier
                    .padding(15.dp),
                onClick = {
                    if(name.trim().isNotBlank()){
                        onLoginClick(name)
                    }
                }) {
                Text(text = "Ingresar")
            }
        }
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {}
    }
}