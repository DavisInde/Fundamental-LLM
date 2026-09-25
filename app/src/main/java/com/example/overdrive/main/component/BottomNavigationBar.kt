package com.example.overdrive.main.component

import androidx.compose.material3.NavigationBar
import androidx.compose.runtime.Composable
import com.example.overdrive.main.features.home.HomeNavigationItem

enum class Pages {
    HOME,
    ACCOUNT
}

@Composable
fun BottomNavigationBar(selectedPages: Pages) {
    NavigationBar() {
        HomeNavigationItem(selectedPages == Pages.HOME)
    }
}