package com.example.app_protection_mc_chargers

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class PrismaActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                PrismaScreen { 
                    val intent = Intent(this, PrismaDetailsActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}

@Composable
fun PrismaScreen(onNavigateToDetails: () -> Unit) {
    val titleColor = colorResource(id = R.color.mcchargers_blue)
    Column(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(titleColor)
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "PRISMA",
                style = TextStyle(color = Color.White, fontSize = 20.sp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        PrismaVariationsTable(onNavigateToDetails)
    }
}

@Composable
fun PrismaVariationsTable(onNavigateToDetails: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        ProductVariationDetails(
            variationName = "PRISMA 2x11CS|2x11CG",
            safetyMeasures = listOf(
                "Ενσωματωμένη αντικεραυνική προστασία SPD Type 2",
                "Ενσωματωμένο αντιηλεκτροπληξιακό ρελέ διαρροής RCD Type B με ανίχνευση AC ρευμάτων 30mA & DC smooth ρευμάτων 6mA ανά έξοδο φόρτισης (2x RCD Type B)",
                "Προστασία Υπέρτασης (OVP) & υπότασης (UVP)",
                "Εντοπισμός απώλειας γείωσης",
                "Προστασία υπερθέρμανσης (OTP)"
            ),
            cablingRequirements = listOf(
                "5x10mm² (μήκος καλωδίωσης έως 100m)",
                "5x16mm² (μήκος καλωδίωσης έως 150m)"
            )
        )

        Divider(modifier = Modifier.padding(vertical = 8.dp))

        ProductVariationDetails(
            variationName = "PRISMA 2x22CS|2x22CG",
            safetyMeasures = listOf(
                "Ενσωματωμένη αντικεραυνική προστασία SPD Type 2",
                "Ενσωματωμένο αντιηλεκτροπληξιακό ρελέ διαρροής RCD Type B με ανίχνευση AC ρευμάτων 30mA & DC smooth ρευμάτων 6mA ανά έξοδο φόρτισης (2x RCD Type B)",
                "Προστασία Υπέρτασης (OVP) & υπότασης (UVP)",
                "Εντοπισμός απώλειας γείωσης",
                "Προστασία υπερθέρμανσης (OTP)"
            ),
            cablingRequirements = listOf(
                "5x16mm² (μήκος καλωδίωσης έως 150m)",
                "5x25mm²  (μήκος καλωδίωσης > 150m)"
            )
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = onNavigateToDetails,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(16.dp)
        ) {
            Text("View Prisma Diagram")
        }
    }
}


@Preview
@Composable
fun PrismaScreenPreview() {
    PrismaScreen(
        onNavigateToDetails = TODO()
    )
}
