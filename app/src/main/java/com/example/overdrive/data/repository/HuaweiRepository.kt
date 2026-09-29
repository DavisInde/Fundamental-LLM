package com.example.overdrive.data.repository

import com.example.overdrive.data.service.ApiProvider
import com.example.overdrive.domain.activity.ActivityDetailModel

class HuaweiRepository {
    val healthService = ApiProvider.instance.provideHuaweiApi()

    suspend fun getActivityRecords(startTime: String, endTime: String): List<ActivityDetailModel> {
        try {
            val response = healthService.getActivities(startTime = startTime, endTime = endTime)
            return response.activityRecord.map { it.toDomain() }
        } catch(e: Throwable) {

        }
    }

}