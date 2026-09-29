package com.example.overdrive.data.api

import com.example.overdrive.data.response.ActivityResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface Huawei {
    @GET("healthkit/v2/activityRecords")
    suspend fun getActivities(
        @Query("startTime") startTime: String,
        @Query("endTime") endTime: String
    ) : ActivityResponse
}