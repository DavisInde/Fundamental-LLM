package com.example.overdrive.main.features.account.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

data class HealthApp(
    @field:DrawableRes val icon: Int,
    val label: String,
    val isAuthorized: Boolean = false
)

@Composable
fun HealthAppItem(item: HealthApp) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        HorizontalDivider(thickness = 2.dp)

        Row {
            HealthAppIcon(item.icon)
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = item.label)
        }

        HorizontalDivider(thickness = 2.dp)
    }
}

@Composable
fun HealthAppIcon(@DrawableRes image: Int) {
    Image(painter = painterResource(image), contentDescription = null)
}
