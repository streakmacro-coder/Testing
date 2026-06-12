package com.streakmacro.minecraftlauncher.ui.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.streakmacro.minecraftlauncher.ui.navigation.Screen

@Composable
fun HomeScreen(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize().background(MaterialTheme.colorScheme.background)) {
        Row(modifier = Modifier.fillMaxWidth().height(56.dp).background(MaterialTheme.colorScheme.primary).padding(horizontal = 16.dp), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
            Text(text = "Minecraft Launcher", style = MaterialTheme.typography.titleLarge, color = MaterialTheme.colorScheme.onPrimary)
            Row {
                IconButton(onClick = { navController.navigate(Screen.Accounts.route) }) {
                    Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "Accounts", tint = MaterialTheme.colorScheme.onPrimary)
                }
                IconButton(onClick = { navController.navigate(Screen.Settings.route) }) {
                    Icon(imageVector = Icons.Default.Settings, contentDescription = "Settings", tint = MaterialTheme.colorScheme.onPrimary)
                }
            }
        }
        LazyColumn(modifier = Modifier.fillMaxSize().padding(16.dp), verticalArrangement = Arrangement.spacedBy(16.dp)) {
            item {
                Card(modifier = Modifier.fillMaxWidth().height(100.dp)) {
                    Column(modifier = Modifier.fillMaxSize().padding(16.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "Select an account and launch Minecraft", style = MaterialTheme.typography.bodyMedium)
                    }
                }
            }
            item {
                Button(onClick = { navController.navigate(Screen.Login.route) }, modifier = Modifier.fillMaxWidth().height(56.dp)) {
                    Text(text = "Launch Minecraft")
                }
            }
            item {
                Button(onClick = { navController.navigate(Screen.Mods.route) }, modifier = Modifier.fillMaxWidth().height(56.dp)) {
                    Text(text = "Manage Mods & Packs")
                }
            }
        }
    }
}