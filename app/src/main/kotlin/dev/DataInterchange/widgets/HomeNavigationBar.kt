package dev.DataInterchange.widgets

import androidx.compose.foundation.Image
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.navigation.NavHostController
import dev.DataInterchange.R
import dev.DataInterchange.theme.bodyFontFamily

// Home Route Navigation Bar Widget: Stateless
@Composable
fun HomeNavigationBar(
    hostController: NavHostController,
) {
    NavigationBar {
        NavigationBarItem(
            alwaysShowLabel = false,
            enabled = true,
            icon = {
                Image(
                    contentDescription = "Basic Calculator",
                    painter = painterResource(id = R.drawable.brightness)
                )
            },
            label = {
                Text(
                    "Basic",
                    fontFamily = bodyFontFamily,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    softWrap = true,
                )
            },
            onClick = {

            },
            selected = false,
        )
        NavigationBarItem(
            alwaysShowLabel = false,
            enabled = true,
            icon = {
                Image(
                    contentDescription = "OpenStax",
                    painter = painterResource(id = R.drawable.settings)
                )
            },
            label = {
                Text(
                    "OpenStax",
                    fontFamily = bodyFontFamily,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    softWrap = true,
                )
            },
            onClick = {
                hostController.navigate(route = "OpenStax")
            },
            selected = false,
        )
    }
}