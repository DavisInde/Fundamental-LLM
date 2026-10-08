package com.example.overdrive.main.ui.features.home.sections.streak

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

enum class WeekDays(
    val label: String
) {
    MONDAY("Mon"),
    TUESDAY("Tue"),
    WEDNESDAY("Wed"),
    THURSDAY("Thu"),
    FRIDAY("Fri"),
    SATURDAY("Sat"),
    SUNDAY("Sun");

    companion object {
        fun days() = enumValues<WeekDays>()
        fun dayCount() = days().size
    }
}

@Composable
fun StreakDay(week: WeekDays) {
    Text(
        text = week.label
    )
}