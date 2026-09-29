package com.example.overdrive.data.service

import com.example.overdrive.data.api.Huawei

class ApiProvider private constructor() {
    companion object {
        val instance: ApiProvider = ApiProvider()
    }

    private val client = HttpClient.instance

    fun provideHuaweiApi(): Huawei {
        return client.realClient.create(Huawei::class.java)
    }

}