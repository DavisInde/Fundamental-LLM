package com.example.overdrive.main.ui.features.account

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.example.overdrive.huawei.HuaweiApp
import com.example.overdrive.main.ui.LocalNavController
import com.example.overdrive.main.ui.NavigationDestination
import com.example.overdrive.main.ui.features.account.component.HealthAppItem

@Composable
fun HealthAccountScreen() {
    val viewModel: HealthAccountViewModel = remember { HealthAccountViewModel() }
    val navController = LocalNavController.current
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(items = viewModel.healthAccounts) {
            HealthAppItem(
                item = it,
                authorize = { item ->
                    when {
                        item is HuaweiApp -> navController.navigate(NavigationDestination.HuaweiAuth)
                    }
                }
            )
        }
    }
}