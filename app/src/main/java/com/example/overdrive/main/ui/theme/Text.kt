package com.example.overdrive.main.ui.theme

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun OverdriveText(
    text: String
) {
    Text(
        text = text,
        color = Color(0xFFFFFFFF)
    )
}