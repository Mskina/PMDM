package com.example.estevez_ivan_ex1tDist.screens.basicos

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

/* https://www.youtube.com/watch?v=rpCrFLcHBNQ */

@Composable
fun Ej04Screen() {
    val context = LocalContext.current
    Column(
        Modifier.widthIn(max = 50.dp), // TODO
        horizontalAlignment = Alignment.End,
        verticalArrangement = Arrangement.Bottom
    ) {
        Text(
            text = "Texto 1",
            Modifier
                .weight(0.5f)
                .clickable {
                    Toast
                        .makeText(context, "Evento!", Toast.LENGTH_SHORT)
                        .show()
                })
        Box(Modifier
            .background(Color.LightGray)
            .fillMaxSize()) {
            Text(text = "Texto 4",
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .background(Color.Green))
            Text(text = "Texto 5",
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .background(Color.Blue))
        }
        Row(
            Modifier.weight(1f),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Texto 6", modifier = Modifier.align(Alignment.Top))
            Text(text = "Texto 6b", modifier = Modifier.align(Alignment.Top))
            Text(text = "Texto 7")
            Text(text = "Texto 8", modifier = Modifier.align(Alignment.Bottom))
        }

    }
}