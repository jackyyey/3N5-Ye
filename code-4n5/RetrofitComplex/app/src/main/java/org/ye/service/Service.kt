package org.ye.service

import org.ye.Personne
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface Service {
    @GET("/exos/truc/complexe")
    fun getPersonne(@Query("name") name: String): Call<Personne>
}

