package com.example.app_protection_mc_chargers

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class OrionMidiActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                OrionMidiScreen()
            }
        }
    }
}

@Composable
fun OrionMidiScreen() {
    val titleColor = colorResource(id = R.color.mcchargers_blue)
    Column(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(titleColor)
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            BasicText(
                text = "ORION MIDI",
                style = TextStyle(color = Color.White, fontSize = 20.sp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))


        OrionMidiVariationsTable()
    }
}

@Composable
fun OrionMidiVariationsTable() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        ProductVariationDetails(
            variationName = "ORION Midi 7KW",
            safetyMeasures = listOf(
                "Ενσωματωμένη ανίσχευση DC ρεύματος διαρροής 6mA (σύμφωνα με το EN 62955)",
                "Δυνατότητα ενσωματωμένου αντιηλεκτροπληξιακού ρελέ διαρροής RCD Type A",
                "Ανίχνευση απώλειας γείωσης",
                "Προστασία Υπέρτασης & υπότασης",
                "Προστασία Υπερθέρμανσης (OTP)",
                "Απαιτείται MCCB Type C 40A - Μικροαυτόματος 2P Type C 40A (ή ασφάλεια 35A) στην αναχώρηση του πίνακα διανομής + ρελέ διαρροής RCD Type A σε περίπτωση επιλογής μοντέλου που δεν το συμπεριλαμβάνει",
                "Προτείνεται σύμφωνα με το EN 60364 εγκατάσταση αντικεραυνικής προστασίας SPD Type 2 στον πίνακα διανομής, σε περίπτωση επιλογής μοντέλου που δεν το συμπεριλαμβάνει"
            ),
            cablingRequirements = listOf(
                "3x10mm² (μήκος καλωδίωσης έως 60m",
                "3x16mm² (μήκος καλωδίωσης >60m)"
            )
        )

        Divider(modifier = Modifier.padding(vertical = 8.dp))

        ProductVariationDetails(
            variationName = "Orion Midi 22KW",
            safetyMeasures = listOf(
                "Ενσωματωμένη ανίσχευση DC ρεύματος διαρροής 6mA (σύμφωνα με το EN 62955)",
                "Δυνατότητα ενσωματωμένου αντιηλεκτροπληξιακού ρελέ διαρροής RCD Type A",
                "Ανίχνευση απώλειας γείωσης",
                "Προστασία Υπέρτασης & υπότασης",
                "Προστασία Υπερθέρμανσης (OTP)",
                "Απαιτείται MCCB Type C 40A - Μικροαυτόματος 4P Type C 40A (ή ασφάλεια 35A) στην αναχώρηση του πίνακα διανομής + ρελέ διαρροής RCD Type A",
                "Προτείνεται σύμφωνα με το EN 60364 εγκατάσταση αντικεραυνικής προστασίας SPD Type 2 στον πίνακα διανομής, σε περίπτωση επιλογής μοντέλου που δεν το συμπεριλαμβάνει"
            ),
            cablingRequirements = listOf(
                "5x10mm² (μήκος καλωδίωσης έως 120m)",
                "5x16mm² (μήκος καλωδίωσης >100m)"
            )
        )
    }
}

@Preview
@Composable
fun OrionMidiScreenPreview() {
    OrionMidiScreen()
}