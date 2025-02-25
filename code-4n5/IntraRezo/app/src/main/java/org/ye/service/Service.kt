package org.ye.service

import android.app.Person
import org.ye.Nombre
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface Service {
    @GET("/exos/long/list")
    fun getListLong(): Call<List<Long>>

    @GET("exam/representations/{nombre}")
    fun getListComplex(@Path("nombre") nombre: String): Call<List<Nombre>>

}

