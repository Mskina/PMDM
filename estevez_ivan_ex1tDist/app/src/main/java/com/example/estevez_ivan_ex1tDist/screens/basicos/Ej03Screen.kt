package com.example.estevez_ivan_ex1tDist.screens.basicos

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showSystemUi = true)
@Composable
fun Ej03Screen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "First item",
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = "Second item",
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = "Third item",
            modifier = Modifier.padding(16.dp)
        )
    }

}