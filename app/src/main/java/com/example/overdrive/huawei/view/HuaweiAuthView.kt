package com.example.overdrive.huawei.view

import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView
import com.example.overdrive.huawei.HuaweiConfig
import com.example.overdrive.main.ui.LocalNavController

@Composable
fun HuaweiAuthView() {
    val context = LocalContext.current
    val navController = LocalNavController.current
    AndroidView(
        factory = {
            WebView(context).apply {
                webViewClient = HuaweiChromeClient(
                    onAuthenticated = { token ->
                        navController.popBackStack()
                    }
                )
                loadUrl(HuaweiConfig.getAuthUrl())
            }
        }
    )
}

class HuaweiChromeClient(
    private val onAuthenticated: (String) -> Unit
): WebViewClient() {
    override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
        val webUrl = request?.url
        val isRedirectUri = webUrl.toString().contains(HuaweiConfig.REDIRECT_URL)

        if (isRedirectUri) onAuthenticated(webUrl.toString())

        return !isRedirectUri
    }
}