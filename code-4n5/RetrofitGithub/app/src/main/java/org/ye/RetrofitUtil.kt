package org.depinfo.retrofit_demo.http

import org.ye.service.Service
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory

object RetrofitUtil {
    fun get(): Service {
        val retrofit = Retrofit.Builder()
            .addConverterFactory(ScalarsConverterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://api.github.com/")
            .build()
        val service = retrofit.create<Service>(Service::class.java)
        return service
    }
}

