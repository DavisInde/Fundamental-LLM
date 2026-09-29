package com.example.overdrive.main.features.account

import androidx.lifecycle.ViewModel
import com.example.overdrive.R
import com.example.overdrive.main.features.account.component.HealthApp

class HealthAccountViewModel: ViewModel() {
    val healthAccounts: List<HealthApp> = listOf(
        HealthApp(
            icon = R.drawable.huawei_health_app_icon,
            label = "Huawei"
        ),
        HealthApp(
            icon = R.drawable.strava_app_icon,
            label = "Strava"
        )
    )

    fun confirmAuthorizationStatus() {

    }

    fun authorize() {

    }
}