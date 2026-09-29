package com.example.overdrive.main.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.overdrive.main.features.account.HealthAccountScreen
import com.example.overdrive.main.features.home.HomeScreen

@Composable
fun MainScreen(
    selectedPages: Pages
) {
    Scaffold (
        bottomBar = { BottomNavigationBar(selectedPages) }
    ) {
        Box(modifier = Modifier.padding(it)) {
            when(selectedPages) {
                Pages.HOME -> HomeScreen()
                Pages.ACCOUNT -> HealthAccountScreen()
            }
        }
    }
}