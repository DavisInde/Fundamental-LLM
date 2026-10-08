package com.example.overdrive.main.domain.activity

import java.time.LocalDate

data class ActivityData (
    val date: LocalDate,
    val activities: List<ActivityType>
)

enum class ActivityType {
    WALK,
    STRENGTH,
    RUN,
    POOL,
    REST
}