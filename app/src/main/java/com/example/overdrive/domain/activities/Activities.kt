package com.example.overdrive.domain.activities

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