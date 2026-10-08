package com.example.overdrive.huawei.data.service

import okhttp3.OkHttpClient
import retrofit2.Retrofit

class HttpClient private constructor() {

    companion object {
        val instance: HttpClient = HttpClient()
    }

    private val client: OkHttpClient by lazy {
        OkHttpClient.Builder().build()
    }

    val realClient: Retrofit by lazy {
        val okhttpClient = client
        Retrofit.Builder()
            .client(okhttpClient)
            .baseUrl("https://health-api.cloud.huawei.com/")
            .build()
    }

}