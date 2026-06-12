package com.streakmacro.minecraftlauncher.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.streakmacro.minecraftlauncher.ui.screens.home.HomeScreen
import com.streakmacro.minecraftlauncher.ui.screens.auth.LoginScreen
import com.streakmacro.minecraftlauncher.ui.screens.accounts.AccountsScreen
import com.streakmacro.minecraftlauncher.ui.screens.mods.ModsScreen
import com.streakmacro.minecraftlauncher.ui.screens.settings.SettingsScreen

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Login : Screen("login")
    object Accounts : Screen("accounts")
    object Mods : Screen("mods")
    object Settings : Screen("settings")
}

@Composable
fun LauncherNavHost() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(Screen.Home.route) { HomeScreen(navController) }
        composable(Screen.Login.route) { LoginScreen(navController) }
        composable(Screen.Accounts.route) { AccountsScreen(navController) }
        composable(Screen.Mods.route) { ModsScreen(navController) }
        composable(Screen.Settings.route) { SettingsScreen(navController) }
    }
}