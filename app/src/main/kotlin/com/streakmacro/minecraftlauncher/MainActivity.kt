package com.streakmacro.minecraftlauncher

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.streakmacro.minecraftlauncher.ui.navigation.LauncherNavHost
import com.streakmacro.minecraftlauncher.ui.theme.MinecraftLauncherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MinecraftLauncherTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    LauncherNavHost()
                }
            }
        }
    }
}