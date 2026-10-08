package com.example.overdrive.main.ui.features.account

import androidx.lifecycle.ViewModel
import com.example.overdrive.huawei.HuaweiApp
import com.example.overdrive.huawei.HuaweiHealth
import com.example.overdrive.main.domain.healthapp.HealthApp
import com.example.overdrive.main.ui.component.MainPage
import kotlinx.coroutines.flow.MutableStateFlow

class HealthAccountViewModel: ViewModel() {

    val huaweiHealth: HuaweiHealth = HuaweiHealth()

    val healthAccounts: List<HealthApp> = listOf(
        huaweiHealth.provider
    )
}