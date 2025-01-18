package com.example.app_protection_mc_chargers

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

class PrismaDetailsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                PrismaImageWithInteractiveTitles()
            }
        }
    }
}

@Composable
fun PrismaImageWithInteractiveTitles() {
    var showDetails by remember { mutableStateOf(false) }
    var dialogTitle by remember { mutableStateOf("") }
    var dialogDetails by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {

        Image(
            painter = painterResource(id = R.drawable.prisma),
            contentDescription = "Prisma Diagram",
            modifier = Modifier
                .fillMaxSize()
        )

        ClickableText(
            text = AnnotatedString("Ρελέ Διαρροής"),
            style = TextStyle(color = Color.Transparent, fontSize = 16.sp),
            modifier = Modifier
                .align(Alignment.CenterEnd)
                .padding(bottom = 430.dp, end = 65.dp),
            onClick = {
                dialogTitle = "Ρελέ Διαρροής"
                dialogDetails = "Ρελέ διαρροής (RCD) Type B ανά έξοδο"
                showDetails = true
            }
        )

        ClickableText(
            text = AnnotatedString("Αντικ"),
            style = TextStyle(color = Color.Transparent, fontSize = 16.sp),
            modifier = Modifier
                .align(Alignment.Center)
                .padding(bottom = 340.dp, start = 100.dp),
            onClick = {
                dialogTitle = "Αντικεραυνική Προστασία"
                dialogDetails = "Αντικεραυνική Προστασία SPD Type 2"
                showDetails = true
            }
        )

        ClickableText(
            text = AnnotatedString("Μετρ"),
            style = TextStyle(color = Color.Transparent, fontSize = 16.sp),
            modifier = Modifier
                .align(Alignment.Center)
                .padding(bottom = 320.dp, start = 200.dp),
            onClick = {
                dialogTitle = "MID Μετρητής"
                dialogDetails = "MID μετρητής ενέργειας ανά έξοδο φόρτισης"
                showDetails = true
            }
        )

        ClickableText(
            text = AnnotatedString("Βιομ Ρελ"),
            style = TextStyle(color = Color.Transparent, fontSize = 16.sp),
            modifier = Modifier
                .align(Alignment.Center)
                .padding(bottom = 205.dp, start = 200.dp),
            onClick = {
                dialogTitle = "Βιομηχανικό Ρελέ"
                dialogDetails = "Βιομηχανικό Ρελέ ανά έξοδο φόρτισης"
                showDetails = true
            }
        )

        ClickableText(
            text = AnnotatedString("Παν Παρ"),
            style = TextStyle(color = Color.Transparent, fontSize = 16.sp),
            modifier = Modifier
                .align(Alignment.Center)
                .padding(bottom = 110.dp, start = 150.dp),
            onClick = {
                dialogTitle = "Παροχικό καλώδιο"
                dialogDetails = "Όδευση παροχικού καλωδίου"
                showDetails = true
            }
        )

        ClickableText(
            text = AnnotatedString("Κατ Παρ Καλ"),
            style = TextStyle(color = Color.Transparent, fontSize = 16.sp),
            modifier = Modifier
                .align(Alignment.Center)
                .padding(top = 300.dp, start = 170.dp),
            onClick = {
                dialogTitle = "Παροχικό καλώδιο"
                dialogDetails = "Όδευση παροχικού καλωδίου"
                showDetails = true
            }
        )

        ClickableText(
            text = AnnotatedString("Τρύπες Βιδώματος"),
            style = TextStyle(color = Color.Transparent, fontSize = 16.sp),
            modifier = Modifier
                .align(Alignment.Center)
                .padding(top = 430.dp, start = 60.dp),
            onClick = {
                dialogTitle = "Θέσεις Στερέωσης"
                dialogDetails = "4 Θέσεις στερέωσης με μεταλλικά ούπα Μ12 στο έδαφος"
                showDetails = true
            }
        )
    }


    if (showDetails) {
        AlertDialog(
            onDismissRequest = { showDetails = false },
            title = { Text(dialogTitle) },
            text = { Text(dialogDetails) },
            confirmButton = {
                Button(onClick = { showDetails = false }) {
                    Text("OK")
                }
            }
        )
    }
}

@Preview
@Composable
fun PrismaImageWithInteractiveTitlesPreview() {
    PrismaImageWithInteractiveTitles()
}