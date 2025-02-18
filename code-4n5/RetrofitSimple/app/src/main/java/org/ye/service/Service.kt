package org.ye.service

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface Service {
    @GET("exos/long/double/{nombre}")
    fun doublerNombre(@Path("nombre") nombre: String): Call<String>
}

