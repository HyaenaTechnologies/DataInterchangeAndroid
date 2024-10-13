package dev.DataInterchange

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import dev.DataInterchange.theme.DataInterChangeTheme

// Main Activity: Main Entrypoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DataInterChangeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    content = {
                        NavigationModel()
                    }
                )
            }
        }
    }
}