package com.ulima.ulimaPolla.model.remote

import com.ulima.ulimaPolla.model.entity.*
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class HTTPManager {
    private var footballService : FootballService;
    private var googleService : GoogleService;

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.football-data.org")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val retrofit2 = Retrofit.Builder()
            .baseUrl("https://script.google.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        footballService = retrofit.create(FootballService::class.java);
        googleService = retrofit2.create(GoogleService::class.java)
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

    fun getTeams() : ConsultaEquipos? {
        return footballService.getTeams().execute().body();
    }

    fun getMatches() : ConsultaMatches? {
        return footballService.getMatches().execute().body();
    }

    fun getTeam(id : Int) : Team? {
        return footballService.getTeam(id).execute().body();
    }

    fun postPolla(user : String , idPartido : String, ganador : String) : PollaResponse? {
        return googleService.postPolla(user, idPartido , ganador).execute().body();
    }
}