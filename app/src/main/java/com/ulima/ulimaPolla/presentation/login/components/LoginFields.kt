package com.ulima.ulimaPolla.presentation.login.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginFields (
    name: String,
    onNameChange: (String) -> Unit,
    onLoginClick: (String) -> Unit
){
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
        Icon(Icons.Rounded.Home,contentDescription = "",
        modifier = Modifier.size(size = 100.dp)
            .padding(top = 30.dp))
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
            Text(text = "2019264 \n",
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
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
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