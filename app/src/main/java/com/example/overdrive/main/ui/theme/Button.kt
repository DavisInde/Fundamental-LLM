package com.example.overdrive.main.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

data class ButtonStyle(
    val color: ButtonColors,
    val contentColor: Color,
    val shape: Shape
)

object ButtonDefaults {
    val compactButton: ButtonStyle = ButtonStyle(
        color = ButtonColors(
            containerColor = Color(0xFFFC5200),
            contentColor = Color(0xFFFFFFFF),
            disabledContentColor = Color(0xFFFFFFFF),
            disabledContainerColor = Color(0xFFFFFFFF)
        ),
        contentColor = Color(0xFFFFFFFF),
        shape = RoundedCornerShape(8.dp)
    )
}

@Composable
fun OverdriveButton(
    style: ButtonStyle,
    label: String,
    onClick: () -> Unit
) {
    Button(
        colors = style.color,
        content = {
            Text(
                label,
                color = style.contentColor
            )
        },
        shape = style.shape,
        onClick = onClick
    )
}