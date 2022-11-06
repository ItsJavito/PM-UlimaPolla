package com.ulima.ulimaPolla.model.remote

import com.ulima.ulimaPolla.model.entity.Match
import com.ulima.ulimaPolla.model.entity.Team
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class HTTPManager {
    private var footballService : FootballService

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.football-data.org")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        footballService = retrofit.create(FootballService::class.java)
    }
    //singleton
    companion object{
        private var _instance : HTTPManager? = null
        val instance : HTTPManager
            get() {
                if(_instance == null){
                    _instance = HTTPManager()
                }
                return _instance!!
            }
    }

    fun getTeams() : List<Team>? {
        val listaTeams = footballService.getTeams().execute().body()
        return listaTeams;
    }

    fun getMatches() : List<Match>? {
        val listaMatch = footballService.getMatches().execute().body();
        return listaMatch;
    }

    fun getTeam(id : Int) : Team? {
        return footballService.getTeam(id).execute().body();
    }
}