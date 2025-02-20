package org.ye.service

import android.app.Person
import org.ye.Personne
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface Service {
    @GET("/exos/long/list")
    fun getListLong(): Call<List<Long>>

    @GET("/exos/truc/list")
    fun getListComplex(): Call<List<Personne>>

    @POST("exos/truc/doubler")
    fun postObjet(@Body personne: Personne): Call<Personne>
}

