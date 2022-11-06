package com.ulima.ulimaPolla.presentation.login.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Green
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
        //Primer hijo
        Text(text = "Polla Ulima",
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(20.dp),
            fontSize = 25.sp);
        //Segundo Hijo
        Column(
            modifier = Modifier.fillMaxWidth()
        )
        {
            Text(text = "Ingrese su código:",
                textAlign = TextAlign.Start,
                modifier = Modifier.padding(10.dp),
                fontSize = 20.sp)
            OutlinedTextField(modifier = Modifier.fillMaxWidth()
                .padding(start = 10.dp, top = 0.dp, end = 10.dp, bottom = 0.dp),
                value = name,
                onValueChange = onNameChange,
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Green,
                    unfocusedBorderColor = Color.Gray))
        }
        //Tercer Hijo
        Button(
            modifier = Modifier.fillMaxWidth()
                .padding(15.dp),
            onClick = {
            if(name.trim().isNotBlank()){
                onLoginClick(name)
            }
        }) {
            Text(text = "Login")
        }
    }
}