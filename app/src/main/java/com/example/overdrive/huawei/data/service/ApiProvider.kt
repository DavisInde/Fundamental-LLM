package com.example.overdrive.huawei.data.service

import com.example.overdrive.huawei.data.api.HuaweiApi

class ApiProvider private constructor() {
    companion object {
        val instance: ApiProvider = ApiProvider()
    }

    private val client = HttpClient.instance

    fun provideHuaweiApi(): HuaweiApi {
        return client.realClient.create(HuaweiApi::class.java)
    }

}