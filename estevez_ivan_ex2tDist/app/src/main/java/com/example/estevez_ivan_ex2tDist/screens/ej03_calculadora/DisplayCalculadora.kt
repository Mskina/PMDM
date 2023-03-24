package com.example.estevez_ivan_ex2tDist.screens.ej03_calculadora

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DisplayCalculadora(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.onBackground)
            .padding(start = 20.dp, end = 20.dp, top = 40.dp, bottom = 20.dp)
            .then(modifier),
        contentAlignment = Alignment.BottomEnd,
    )
    {
        Text(text = "0",
            textAlign = TextAlign.End,
            color = MaterialTheme.colors.onPrimary,
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold)
    }
}

