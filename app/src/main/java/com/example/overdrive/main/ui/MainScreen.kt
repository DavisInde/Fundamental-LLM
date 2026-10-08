package com.example.overdrive.main.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.overdrive.main.ui.component.BottomNavigationBar
import com.example.overdrive.main.ui.component.MainPage
import com.example.overdrive.main.ui.features.account.HealthAccountScreen
import com.example.overdrive.main.ui.features.home.HomeScreen

@Composable
fun MainScreen() {
    var selectedPage: MainPage by rememberSaveable {
        mutableStateOf(MainPage.HOME)
    }

    Scaffold (
        bottomBar = {
            BottomNavigationBar(
                selectedPage = selectedPage,
                onSelected = { targetPage ->
                    if (selectedPage != targetPage) selectedPage = targetPage
                }
            )
        }
    ) {
        Box(modifier = Modifier.padding(it)) {
            when(selectedPage) {
                MainPage.HOME -> HomeScreen()
                MainPage.HEALTH -> HealthAccountScreen()
            }
        }
    }
}