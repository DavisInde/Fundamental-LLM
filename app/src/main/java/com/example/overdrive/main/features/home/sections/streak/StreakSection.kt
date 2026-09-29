package com.example.overdrive.main.features.home.sections.streak

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.overdrive.domain.activity.ActivityData

@Composable
fun StreakSection(
    activities: List<ActivityData>
) {
    LazyVerticalGrid(
        modifier = Modifier.fillMaxWidth(),
        columns = GridCells.Fixed(7)
    ) {
        items(items = WeekDays.days()) {
            StreakDay(it)
        }

        items(items = activities) {

        }
    }
}
