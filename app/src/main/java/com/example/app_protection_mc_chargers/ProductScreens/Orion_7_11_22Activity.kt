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

class Orion_7_11_22Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Orion_7_11_22Screen()
            }
        }
    }
}

@Composable
fun Orion_7_11_22Screen() {
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
                text = "ORION 7KW & 11KW & 22KW",
                style = TextStyle(color = Color.White, fontSize = 20.sp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))


        Orion_7_11_22VariationsTable()
    }
}

@Composable
fun Orion_7_11_22VariationsTable() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        ProductVariationDetails(
            variationName = "ORION 07CS|07CG",
            safetyMeasures = listOf(
                "Ενσωματωμένο αντιηλεκτροπληξιακό ρελέ διαρροής RCD Type B με ανίχνευση AC ρευμάτων 30mA & DC smooth ρευμάτων 6mA",
                "Προστασία Υπερφόρτισης & Βραχυκυκλώματος – Ενσωματωμένη Μικροαυτόματη Ασφάλεια MCB Type C 4P 40A",
                "Ενσωματωμένη Αντικεραυνική προστασία SPD Type 2",
                "Προστασία Υπέρτασης (OVP) & υπότασης (UVP)",
                "Προστασία υπερθέρμανσης (OTP)",
                "Εντοπισμός απώλειας γείωσης"
            ),
            cablingRequirements = listOf(
                "3x10mm² (μήκος καλωδίωσης έως 50m)",
                "3x16mm² (μήκος καλωδίωσης >50m)"
            )
        )

        Divider(modifier = Modifier.padding(vertical = 8.dp))

        ProductVariationDetails(
            variationName = "ORION 11CS|11CG",
            safetyMeasures = listOf(
                "Ενσωματωμένο αντιηλεκτροπληξιακό ρελέ διαρροής RCD Type B με ανίχνευση AC ρευμάτων 30mA & DC smooth ρευμάτων 6mA",
                "Προστασία Υπερφόρτισης & Βραχυκυκλώματος – Ενσωματωμένη Μικροαυτόματη Ασφάλεια MCB Type C 4P 40A",
                "Ενσωματωμένη Αντικεραυνική προστασία SPD Type 2",
                "Προστασία Υπέρτασης (OVP) & υπότασης (UVP)",
                "Προστασία υπερθέρμανσης (OTP)",
                "Εντοπισμός απώλειας γείωσης"
            ),
            cablingRequirements = listOf(
                "5x6mm² (μήκος καλωδίωσης έως 100m)",
                "5x10mm² (μήκος καλωδίωσης έως 80m)"
            )
        )

        Divider(modifier = Modifier.padding(vertical = 8.dp))

        ProductVariationDetails(
            variationName = "ORION 22CS|22CG",
            safetyMeasures = listOf(
                "Ενσωματωμένο αντιηλεκτροπληξιακό ρελέ διαρροής RCD Type B με ανίχνευση AC ρευμάτων 30mA & DC smooth ρευμάτων 6mA",
                "Προστασία Υπερφόρτισης & Βραχυκυκλώματος – Ενσωματωμένη Μικροαυτόματη Ασφάλεια MCB Type C 4P 40A",
                "Ενσωματωμένη Αντικεραυνική προστασία SPD Type 2",
                "Προστασία Υπέρτασης (OVP) & υπότασης (UVP)",
                "Προστασία υπερθέρμανσης (OTP)",
                "Εντοπισμός απώλειας γείωσης"
            ),
            cablingRequirements = listOf(
                "5x10mm² (μήκος καλωδίωσης έως 100m)",
                "5x16mm² (μήκος καλωδίωσης έως 150m)"
            )
        )
    }
}

@Preview
@Composable
fun Orion_7_11_22ScreenPreview() {
    Orion_7_11_22Screen()
}