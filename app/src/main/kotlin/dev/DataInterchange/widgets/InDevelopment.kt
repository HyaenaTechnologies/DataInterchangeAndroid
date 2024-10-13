package dev.DataInterchange.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import dev.DataInterchange.R

// In Development Route: Stateless
@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun InDevelopment(
    navigationHost: NavHostController
) {
    val topBarScroll: TopAppBarScrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
    Scaffold(
        content = { innerPadding ->
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.consumeWindowInsets(innerPadding),
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Image(
                    contentDescription = "In Development",
                    painter = painterResource(id = R.drawable.in_development)
                )
            }
        },
        topBar = {
            NavigationTopBar(
                appBarScroll = topBarScroll,
                hostController = navigationHost,
                titleText = "In Development"
            )
        },
    )
}