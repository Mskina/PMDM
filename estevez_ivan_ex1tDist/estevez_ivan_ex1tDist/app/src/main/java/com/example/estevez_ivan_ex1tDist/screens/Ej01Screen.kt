package com.example.estevez_ivan_ex1tDist.screens.teoria


import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showSystemUi = true)
@Composable
fun Ej01Screen() {

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = "First item",
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp, top = 40.dp, bottom = 20.dp),
            textAlign = TextAlign.Start,
        )
        Text(text = "Second item",
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp, top = 40.dp, bottom = 20.dp),
            textAlign = TextAlign.Start)
        Text(text = "Third item",
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp, top = 40.dp, bottom = 20.dp),
            textAlign = TextAlign.Start)


    }
}





