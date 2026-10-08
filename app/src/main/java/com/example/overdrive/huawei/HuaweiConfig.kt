package com.example.overdrive.huawei

import com.example.overdrive.BuildConfig

object HuaweiConfig {
    private const val AUTH_WEB_URL = "https://oauth-login.cloud.huawei.com/oauth2/v3/authorize"

    private const val DAILY_ACTIVITY_SCOPE = "https://www.huawei.com/healthkit/dailyactivitysummary.read"

    fun getAuthUrl(): String {
        val url = AUTH_WEB_URL
        val clientId = BuildConfig.HUAWEI_CLIENT_ID
        return "$url?response_type=code&client_id=$clientId&redirect_uri=$REDIRECT_URL&scope=$DAILY_ACTIVITY_SCOPE"
    }

    const val REDIRECT_URL = "https://overdrive.hahahihi/"
}