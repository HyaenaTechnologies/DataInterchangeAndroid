package dev.DataInterchange

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.DataInterchange.widgets.GitHubSource
import dev.DataInterchange.widgets.HomeRoute
import dev.DataInterchange.widgets.InDevelopment

// Navigation Model: Stateful
@Composable
fun NavigationModel() {
    val navigationController: NavHostController = rememberNavController()
    NavHost(
        navController = navigationController,
        startDestination = "Home"
    ) {
        composable(route = "GitHub") {
            GitHubSource(navigationHost = navigationController)
        }

        composable(route = "Home") {
            HomeRoute(navigationHost = navigationController)
        }

        composable(route = "In Development") {
            InDevelopment(navigationHost = navigationController)
        }
    }
}