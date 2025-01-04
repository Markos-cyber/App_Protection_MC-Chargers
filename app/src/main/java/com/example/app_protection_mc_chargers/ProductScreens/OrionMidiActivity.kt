package com.example.app_protection_mc_chargers

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

class OrionMidiActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OrionMidiScreen()
        }
    }
}

@Composable
fun OrionMidiScreen() {
    Text("Welcome to the Orion Midi Screen")
}