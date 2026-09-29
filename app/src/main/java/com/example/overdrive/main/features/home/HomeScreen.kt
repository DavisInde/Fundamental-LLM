package com.example.overdrive.main.features.home

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.overdrive.main.features.home.sections.RecentActivitiesSection
import com.example.overdrive.main.features.home.sections.streak.StreakSection

@Composable
fun HomeScreen() {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        item {
            StreakSection()
        }

        item {
            RecentActivitiesSection()
        }
    }
}

@Composable
fun RowScope.HomeNavigationItem(isSelected: Boolean) {
    NavigationBarItem(
        selected = isSelected,
        icon = {},
        onClick = {}
    )
}