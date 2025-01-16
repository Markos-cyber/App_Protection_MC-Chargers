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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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
                text = "ORION 2x11KW & 2x22KW",
                style = TextStyle(color = Color.White, fontSize = 20.sp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))


        Orion2x11_2x22VariationsTable()
    }
}

@Composable
fun Orion2x11_2x22VariationsTable() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        ProductVariationDetails(
            variationName = "ORION 2x11CSB & 2x11CGB",
            safetyMeasures = listOf(
                "Αντικεραυνική προστασία SPD Type 2",
                "Ενσωματωμένο αντιηλεκτροπληξιακό ρελέ διαρροής RCD Type B με ανίχνευση AC ρευμάτων 30mA & DC smooth ρευμάτων 6mA ανά έξοδο φόρτισης (2x RCD Type B)",
                "Προστασία Υπερφόρτισης & Βραχυκυκλώματος – Ενσωματωμένη Μικροαυτόματη Ασφάλεια MCB Type C 4P 40A ανά έξοδο φόρτισης (2x MCB Type C)",
                "Προστασία Υπέρτασης (OVP) & υπότασης (UVP)",
                "Εντοπισμός απώλειας γείωσης",
                "Προστασία υπερθέρμανσης (OTP)"
            ),
            cablingRequirements = listOf(
                "5x10mm² (μήκος καλωδίωσης έως 100m)",
                "5x16mm²  (μήκος καλωδίωσης έως 150m)"
            )
        )

        Divider(modifier = Modifier.padding(vertical = 8.dp))

        ProductVariationDetails(
            variationName = "Orion 2x22CBS & 2x22CGB",
            safetyMeasures = listOf(
                "Αντικεραυνική προστασία SPD Type 2",
                "Ενσωματωμένο αντιηλεκτροπληξιακό ρελέ διαρροής RCD Type B με ανίχνευση AC ρευμάτων 30mA & DC smooth ρευμάτων 6mA ανά έξοδο φόρτισης (2x RCD Type B)",
                "Προστασία Υπερφόρτισης & Βραχυκυκλώματος – Ενσωματωμένη Μικροαυτόματη Ασφάλεια MCB Type C 4P 40A ανά έξοδο φόρτισης (2x MCB Type C)",
                "Προστασία Υπέρτασης (OVP) & υπότασης (UVP)",
                "Εντοπισμός απώλειας γείωσης",
                "Προστασία υπερθέρμανσης (OTP)"
            ),
            cablingRequirements = listOf(
                "5x16mm² (μήκος καλωδίωσης έως 150m)",
                "5x25mm² (μήκος καλωδίωσης>150m)"
            )
        )
    }
}

@Composable
fun ProductVariationDetails(
    variationName: String,
    safetyMeasures: List<String>,
    cablingRequirements: List<String>
) {
    Column(modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)) {
        Text(
            text = variationName,
            style = TextStyle(fontSize = 18.sp, color = Color.Black),
            modifier = Modifier.padding(bottom = 8.dp)
        )

        Text(
            text = "Safety Measures:",
            style = TextStyle(fontSize = 16.sp, color = Color.Gray),
            modifier = Modifier.padding(bottom = 4.dp)
        )
        DetailsTable(items = safetyMeasures)

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Cabling Requirements:",
            style = TextStyle(fontSize = 16.sp, color = Color.Gray),
            modifier = Modifier.padding(bottom = 4.dp)
        )
        DetailsTable(items = cablingRequirements)
    }
}

@Composable
fun DetailsTable(items: List<String>) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFF8F8F8))
            .padding(8.dp)
    ) {
        items.forEach { item ->
            Row(modifier = Modifier.padding(vertical = 4.dp)) {
                Text(
                    text = "•",
                    style = TextStyle(fontSize = 14.sp),
                    modifier = Modifier.padding(end = 8.dp)
                )
                Text(
                    text = item,
                    style = TextStyle(fontSize = 14.sp, color = Color.Black)
                )
            }
        }
    }
}

@Preview
@Composable
fun Orion2x11_2x22ScreenPreview() {
    Orion2x11_2x22Screen()
}



