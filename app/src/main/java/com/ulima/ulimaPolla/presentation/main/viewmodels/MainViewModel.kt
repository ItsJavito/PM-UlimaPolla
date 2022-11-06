package com.ulima.ulimaPolla.presentation.main.viewmodels

import android.content.Context
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ulima.ulimaPolla.model.entity.Match
import com.ulima.ulimaPolla.model.entity.Team
import com.ulima.ulimaPolla.model.remote.HTTPManager
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.http.HTTP

class MainViewModel(
    val context: Context
) : ViewModel() {
    val listaTeams = mutableStateListOf<Team>()
    val listaMatches = mutableStateListOf<Match>()
    val team = mutableStateOf<Team>(Team(0 , "", "" , 0 , "", "" , "" , ""));
    fun getTeams(){
        viewModelScope.launch {
            //llamamos a la consulta por retrofit
            withContext(Dispatchers.IO) {
                HTTPManager.instance.getTeams()?.teams;
            }?.forEach {
                listaTeams.add(it);
            }
        }
    }
    fun getMatches(){
        viewModelScope.launch {
            withContext(Dispatchers.IO){
                HTTPManager.instance.getMatches()?.matches
            }?.forEach {
                listaMatches.add(it)
            }
        }
    }
    fun getTeam(id : Int){
        viewModelScope.launch {
            team.value =  withContext(Dispatchers.IO){
                HTTPManager.instance.getTeam(id)
            }!!
        }
    }
}