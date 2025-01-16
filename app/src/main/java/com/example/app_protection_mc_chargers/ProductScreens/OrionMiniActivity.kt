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
                text = "ORION MINI",
                style = TextStyle(color = Color.White, fontSize = 20.sp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))


        OrionMiniVariationsTable()
    }
}

@Composable
fun OrionMiniVariationsTable() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        ProductVariationDetails(
            variationName = "ORION Mini-07HG",
            safetyMeasures = listOf(
                "Ενσωματωμένη Ανίχνευση DC ρεύματος διαρροής 6mA (σύμφωνα με το ΕΝ 62955)",
                "Ανίχνευση Απώλειας Γείωσης",
                "Προστασία Υπερθέρμανσης (ΟΤΡ)",
                "Προστασία Υπέρτασης & υπότασης",
                "Απαιτείται MCCB Type C 40Α – Μικροαυτόματος 2Ρ Type C 40Α (ή ασφάλεια 35 Α) στην αναχώρηση του πίνακα διανομής",
                "Απαιτείται ρελέ διαρροής (αντιηλεκτροπληξιακός) RCD Type A 2P 40A στην αναχώρηση του πίνακα διανομής",
                "Συνίσταται σύμφωνα με το ΕΝ 60364 εγκατάσταση αντικεραυνικής προστασίας SPD Type 2 2P (1P+N) στον πίνακα διανομής"
            ),
            cablingRequirements = listOf(
                "3x10mm² (μήκος καλωδίωσης έως 80m)",
                "3x16mm² (μήκος καλωδίωσης >80m)"
            )
        )

        Divider(modifier = Modifier.padding(vertical = 8.dp))

        ProductVariationDetails(
            variationName = "Orion Mini-22HG",
            safetyMeasures = listOf(
                "Ενσωματωμένη Ανίχνευση DC ρεύματος διαρροής 6mA (σύμφωνα με το ΕΝ 62955)",
                "Ανίχνευση Απώλειας Γείωσης",
                "Προστασία Υπερθέρμανσης (ΟΤΡ)",
                "Προστασία Υπέρτασης & υπότασης",
                "Απαιτείται MCCB Type C 40Α – Μικροαυτόματος 4Ρ Type C 40Α (ή ασφάλεια 35 Α) στην αναχώρηση του πίνακα διανομής",
                "Απαιτείται ρελέ διαρροής (αντιηλεκτροπληξιακός) RCD Type A 4P 40A στην αναχώρηση του πίνακα διανομής",
                "Συνίσταται σύμφωνα με το ΕΝ 60364 εγκατάσταση αντικεραυνικής προστασίας SPD Type 2 (3P+N) στον πίνακα διανομής"
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
fun OrionMiniPreview() {
    OrionMiniScreen()
}