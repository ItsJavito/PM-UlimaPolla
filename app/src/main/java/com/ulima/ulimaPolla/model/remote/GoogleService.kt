package com.ulima.ulimaPolla.model.remote

import com.ulima.ulimaPolla.model.entity.PollaResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface GoogleService {

    @GET("/macros/s/AKfycbw4I0b8t6lz-TroeFBXsit315VyU61EUzCubejETlLq5c_lNFlnk1Jat0oQ1OTlbAtdzg/exec")
    fun postPolla(
        @Query("usuario") user : String,
        @Query("idpartido") idPartido : String,
        @Query("ganador") ganador : String
    ) : Call<PollaResponse>
}