package com.example.app_protection_mc_chargers

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

class Orion2x11_2x22Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Orion2x11_2x22Screen()
            }
        }
    }
}

@Composable
fun Orion2x11_2x22Screen() {
    Text(text = "Orion 2x11 & 2x22", style = MaterialTheme.typography.displaySmall)
}