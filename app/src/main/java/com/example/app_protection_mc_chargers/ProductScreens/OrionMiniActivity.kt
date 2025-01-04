package com.example.app_protection_mc_chargers

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class OrionMiniActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                OrionMiniScreen()
            }
        }
    }
}

@Composable
fun OrionMiniScreen() {
    Text(text = "Orion Mini Screen", style = MaterialTheme.typography.displaySmall)
}

@Preview
@Composable
fun OrionMiniPreview() {
    OrionMiniScreen()
}