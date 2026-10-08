package com.example.overdrive.huawei.data.repository

import com.example.overdrive.huawei.data.response.ActivityRecord
import com.example.overdrive.huawei.data.service.ApiProvider
import com.example.overdrive.main.domain.response.Response

class HuaweiRepository {
    private val healthService = ApiProvider.instance.provideHuaweiApi()

    suspend fun saveApiToken(token: String) {

    }

    suspend fun getActivityRecords(startTime: String, endTime: String): Response<List<ActivityRecord>> {
        try {
            val response = healthService.getActivities(startTime = startTime, endTime = endTime)
            val mapped = response.activityRecord
            return Response.Success(mapped)
        } catch(error: Throwable) {
            return Response.Failure(error)
        }
    }

}