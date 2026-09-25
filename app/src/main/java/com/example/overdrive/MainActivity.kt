package com.example.overdrive

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.overdrive.main.component.MainNavigationPage
import com.example.overdrive.main.component.MainScreen
import com.example.overdrive.main.component.Pages
import com.example.overdrive.main.features.home.HomeScreen
import com.example.overdrive.ui.theme.OverdriveTheme

class MainActivity : ComponentActivity() {
    private var selectedPage: Pages = Pages.HOME

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OverdriveTheme {
                MainScreen(selectedPage)
            }
        }
    }
}