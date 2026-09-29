package com.example.overdrive.domain.activity

data class ActivityDetailModel(
    val id : String,
    val name : String,
    val desc : String,
    val startTime : Long,
    val endTime : Long,
    val modifyTime : Long,
    val activitySummary : ActivitySummaryModel
)

data class ActivitySummaryModel(
    val startTime: Long,
    val endTime: Long,
    val dataTypeName: String,
    val value : ActivityValueModel
)

data class ActivityValueModel(
    val fieldName: String,
    val floatValue: Float
)