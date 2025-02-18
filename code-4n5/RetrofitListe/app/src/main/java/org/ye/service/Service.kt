package org.ye.service

import org.ye.Personne
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface Service {
    @GET("/exos/long/list")
    fun getListLong(): Call<List<Long>>

    @GET("/exos/truc/list")
    fun getListComplex(): Call<List<Personne>>
}

