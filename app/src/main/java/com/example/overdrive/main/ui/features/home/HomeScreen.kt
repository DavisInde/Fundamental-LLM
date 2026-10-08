package com.example.overdrive.main.ui.features.home

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.overdrive.R
import com.example.overdrive.main.ui.component.MainPage
import com.example.overdrive.main.ui.features.home.sections.RecentActivitiesSection

@Composable
fun HomeScreen() {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        item {
//            StreakSection()
        }

        item {
            RecentActivitiesSection()
        }
    }
}
