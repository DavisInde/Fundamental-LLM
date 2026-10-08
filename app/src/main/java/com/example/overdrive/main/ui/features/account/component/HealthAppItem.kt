package com.example.overdrive.main.ui.features.account.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.overdrive.main.domain.healthapp.HealthApp
import com.example.overdrive.main.ui.theme.ButtonDefaults
import com.example.overdrive.main.ui.theme.OverdriveButton
import com.example.overdrive.main.ui.theme.OverdriveText

@Composable
fun HealthAppItem(
    item: HealthApp,
    authorize: (HealthApp) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        HorizontalDivider(thickness = 2.dp)
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier.size(50.dp),
                painter = painterResource(item.icon),
                contentDescription = null
            )

            Spacer(modifier = Modifier.width(16.dp))

            OverdriveText(text = item.label)

            Spacer(modifier = Modifier.weight(1f))

            OverdriveButton(
                style = ButtonDefaults.compactButton,
                label = "Authorize",
                onClick = { authorize(item) }
            )
        }

        HorizontalDivider(thickness = 2.dp)
    }
}
