package com.ulima.ulimaPolla.model.remote

import com.ulima.ulimaPolla.model.entity.Match
import com.ulima.ulimaPolla.model.entity.Team
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

interface FootballService {
    @Headers("X-Auth-Token: b35204e71d984c56b95d9465edce2261")
    @GET("/v4/competitions/WC/teams")
    fun getTeams() : Call<List<Team>>

    @Headers("X-Auth-Token: b35204e71d984c56b95d9465edce2261")
    @GET("/v4/competitions/WC/matches")
    fun getMatches() : Call<List<Match>>

    @Headers("X-Auth-Token: b35204e71d984c56b95d9465edce2261")
    @GET("/v4/teams/{id}")
    fun getTeam(
        @Path("id") id: Int,
    ) : Call<Team>
}