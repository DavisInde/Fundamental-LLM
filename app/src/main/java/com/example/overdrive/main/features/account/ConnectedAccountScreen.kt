package com.example.overdrive.main.features.account

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.overdrive.main.features.account.component.HealthAppItem

@Composable
fun HealthAccountScreen(viewModel: HealthAccountViewModel) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(items = viewModel.healthAccounts) {
            HealthAppItem(it)
        }
    }
}