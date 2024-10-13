package dev.DataInterchange.widgets

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.navigation.NavHostController
import dev.DataInterchange.R
import dev.DataInterchange.theme.titleFontFamily
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

hce
// Home Route Widget: Stateful
@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun HomeRoute(
    navigationHost: NavHostController
) {
    val coroutineScope: CoroutineScope = rememberCoroutineScope()
    val drawerState: DrawerState = rememberDrawerState(DrawerValue.Closed)
    val scrollState: ScrollState = rememberScrollState()
    val topBarScroll: TopAppBarScrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
    BackHandler(enabled = drawerState.isOpen) {
        coroutineScope.launch {
            drawerState.close()
        }
    }
    ModalNavigationDrawer(
        content = {
            Scaffold(
                bottomBar = {
                    HomeNavigationBar(hostController = navigationHost)
                },
                content = { innerPadding ->
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.consumeWindowInsets(innerPadding),
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {

                    }
                },
                topBar = {
                    TopAppBar(
                        actions = {
                            IconButton(
                                onClick = {
                                    navigationHost.navigate(route = "In Development")
                                }
                            ) {
                                Image(
                                    contentDescription = "Settings",
                                    painter = painterResource(id = R.drawable.settings)
                                )
                            }
                            IconButton(
                                onClick = {
                                    navigationHost.navigate(route = "In Development")
                                }
                            ) {
                                Image(
                                    contentDescription = "Application Information",
                                    painter = painterResource(id = R.drawable.information)
                                )
                            }
                        },
                        navigationIcon = {
                            IconButton(
                                onClick = {
                                    coroutineScope.launch {
                                        drawerState.open()
                                    }
                                }
                            ) {
                                Image(
                                    contentDescription = "Menu",
                                    painter = painterResource(id = R.drawable.menu)
                                )
                            }
                        },
                        scrollBehavior = topBarScroll,
                        title = {
                            Text(
                                "Home",
                                fontFamily = titleFontFamily,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                                softWrap = true,
                            )
                        },
                    )
                },
            )
        },
        drawerContent = {
            MenuSheet(
                hostController = navigationHost,
                menuScrollState = scrollState
            )
        },
        drawerState = drawerState,
        gesturesEnabled = true,
    )
}