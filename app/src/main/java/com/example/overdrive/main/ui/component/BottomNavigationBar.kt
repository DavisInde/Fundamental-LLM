package com.example.overdrive.main.ui.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.overdrive.R

enum class MainPage(
    @field:DrawableRes val icon: Int
) {
    HOME(R.drawable.home_icon),
    HEALTH(R.drawable.home_icon)
}

@Composable
fun BottomNavigationBar(
    selectedPage: MainPage,
    onSelected: (MainPage) -> Unit
) {
    NavigationBar(modifier = Modifier.fillMaxWidth()) {
        MainPage.entries.forEach { page ->
            val isSelected = remember(selectedPage) { selectedPage == page }
            NavigationBarItem(
                modifier = Modifier.size(25.dp),
                selected = isSelected,
                icon = {
                    Icon(
                        painter = painterResource(page.icon),
                        contentDescription = null
                    )
                },
                onClick = { onSelected(page) }
            )
        }
    }
}