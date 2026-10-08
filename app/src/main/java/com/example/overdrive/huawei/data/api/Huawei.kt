package com.example.overdrive.huawei.data.api

import com.example.overdrive.huawei.data.response.ActivityResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface HuaweiApi {
    @GET("healthkit/v2/activityRecords")
    suspend fun getActivities(
        @Query("startTime") startTime: String,
        @Query("endTime") endTime: String
    ) : ActivityResponse
}