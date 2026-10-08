package com.example.overdrive.huawei.data.response

import kotlinx.serialization.Serializable

@Serializable
data class ActivityResponse (
    val activityRecord: List<ActivityRecord>
)

@Serializable
data class ActivityRecord(
    val id : String?,
    val name : String?,
    val desc : String?,
    val appInfo: String?,
    val deviceInfo: String?,
    val activeTime: String?,
    val activityType: Int?,
    val startTime : Long?,
    val endTime : Long?,
    val modifyTime : Long?,
    val activitySummary : ActivitySummary?
)

@Serializable
data class ActivitySummary(
    val paceSummary: PaceSummary,
    val activityFeatures: PerformanceSummary,
)

@Serializable
data class PaceSummary(
    val avgPace: Double?,
    val bestPace: Double?,
    val paceMap: Map<String, Double>?,
    val partTimeMap: Map<String, Double>?
)

@Serializable
data class PerformanceSummary(
    val aerobicTrainingStress: Double?,
    val anaerobicTrainingStress: Double?,
    val recoveryTime: Int?,
    val vo2Max: Int?,
    val loadPeak: Int?,
    val paceZoneStatistics: Map<String, Int>?,
    val heartRateZoneStatistics: Map<String, Int>?,
    val runningAbility: Double?,
    val aerobicLoadPeak: Int?,
    val anaerobicLoadPeak: Int?
)