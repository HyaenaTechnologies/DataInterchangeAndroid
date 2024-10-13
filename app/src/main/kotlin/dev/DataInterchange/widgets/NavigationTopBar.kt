package dev.DataInterchange.widgets

import androidx.compose.foundation.Image
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.navigation.NavHostController
import dev.DataInterchange.R
import dev.DataInterchange.theme.titleFontFamily

// Top App Bar Navigation Widget: Stateless
@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun NavigationTopBar(
    appBarScroll: TopAppBarScrollBehavior,
    hostController: NavHostController,
    titleText: String
) {
    TopAppBar(
        navigationIcon = {
            IconButton(
                onClick = {
                    hostController.navigate(route = "Home")
                }
            ) {
                Image(
                    contentDescription = "Back Button",
                    painter = painterResource(id = R.drawable.back_button)
                )
            }
        },
        scrollBehavior = appBarScroll,
        title = {
            Text(
                titleText,
                fontFamily = titleFontFamily,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                softWrap = true,
            )
        },
    )
}