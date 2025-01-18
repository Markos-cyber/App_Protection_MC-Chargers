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

class POSeidonActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                POSeidonScreen()
            }
        }
    }
}

@Composable
fun POSeidonScreen() {
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
                text = "POSeidon 22KW",
                style = TextStyle(color = Color.White, fontSize = 20.sp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))


        POSeidonVariationsTable()
    }
}

@Composable
fun POSeidonVariationsTable() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        ProductVariationDetails(
            variationName = "POSeidon 22KW (POS-22CS & POS-22CG)",
            safetyMeasures = listOf(
                "Ενσωματωμένο αντιηλεκτροπληξιακό ρελέ διαρροής RCD Type B με ανίχνευση AC ρευμάτων 30mA & DC smooth ρευμάτων 6mA",
                "Προστασία Υπερφόρτισης & Βραχυκυκλώματος – Ενσωματωμένη Μικροαυτόματη Ασφάλεια MCB Type C 4P 40A",
                "Αντικεραυνική προστασία SPD Type 2",
                "Προστασία Υπέρτασης (OVP) & υπότασης (UVP)",
                "Προστασία Υπερθέρμανσης (OTP)",
                "Εντοπισμός απώλειας γείωσης"
            ),
            cablingRequirements = listOf(
                "5x10mm² (μήκος καλωδίωσης έως 120m)",
                "5x16mm² (μήκος καλωδίωσης >120m)"
            )
        )

        Divider(modifier = Modifier.padding(vertical = 8.dp))
    }
}

@Preview
@Composable
fun POSeidonScreenPreview() {
    POSeidonScreen()
}