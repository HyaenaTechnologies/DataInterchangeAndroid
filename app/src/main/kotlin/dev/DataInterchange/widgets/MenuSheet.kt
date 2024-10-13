package dev.DataInterchange.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.navigation.NavHostController
import dev.DataInterchange.R
import dev.DataInterchange.theme.bodyFontFamily

// Home Route Drawer Sheet: Stateless
@Composable
fun MenuSheet(
    hostController: NavHostController,
    menuScrollState: ScrollState
) {
    ModalDrawerSheet {
        Column(
            Modifier.verticalScroll(menuScrollState)
        ) {
            NavigationDrawerItem(
                icon = {
                    Image(
                        contentDescription = "GitHub",
                        painter = painterResource(id = R.drawable.web_dev)
                    )
                },
                label = {
                    Text(
                        "GitHub Source",
                        fontFamily = bodyFontFamily,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        softWrap = true,
                    )
                },
                modifier = Modifier.align(Alignment.CenterHorizontally),
                onClick = {
                    hostController.navigate(route = "GitHub")
                },
                selected = false,
            )
        }
    }
}