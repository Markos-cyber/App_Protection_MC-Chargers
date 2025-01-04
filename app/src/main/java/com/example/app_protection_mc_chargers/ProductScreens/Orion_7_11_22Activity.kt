package com.example.app_protection_mc_chargers

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

class Orion_7_11_22Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Orion_7_11_22Screen()
        }
    }
}

@Composable
fun Orion_7_11_22Screen() {
    Text("Welcome to the Orion 7&11&22")
}