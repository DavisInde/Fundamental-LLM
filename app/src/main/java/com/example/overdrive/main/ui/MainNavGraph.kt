package com.example.overdrive.main.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.overdrive.huawei.view.HuaweiAuthView
import kotlinx.serialization.Serializable

sealed interface NavigationDestination {
    @Serializable
    object Home: NavigationDestination

    @Serializable
    object HuaweiAuth: NavigationDestination
}

@Composable
fun MainNavigationGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = NavigationDestination.Home) {
        composable<NavigationDestination.Home> {
            MainScreen()
        }

        composable<NavigationDestination.HuaweiAuth> {
            HuaweiAuthView()
        }
    }
}

val LocalNavController = staticCompositionLocalOf<NavController> {
    error("No NavController provided")
}