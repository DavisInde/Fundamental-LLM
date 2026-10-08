package com.example.overdrive.huawei

import com.example.overdrive.R
import com.example.overdrive.huawei.data.repository.HuaweiRepository
import com.example.overdrive.main.domain.healthapp.HealthApp

data object HuaweiApp: HealthApp(
    icon = R.drawable.huawei_health_app_icon,
    label = "Huawei"
)

class HuaweiHealth {

    val provider: HealthApp = HuaweiApp

}