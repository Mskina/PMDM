package com.example.estevez_ivan_ex2tDist.screens.ej02_tictactoe

import android.content.res.Configuration
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.SpaceEvenly
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.stringResource
import com.example.estevez_ivan_ex2tDist.R


@Composable
fun Ej02Screen() {
    Scaffold(topBar = {
        TopAppBar(title = { Text(text = stringResource(id = R.string.tictactoe)) })
    }) {
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(it)) {
            when (LocalConfiguration.current.orientation) {
                Configuration.ORIENTATION_PORTRAIT -> VerticalTicTacToe()
                Configuration.ORIENTATION_LANDSCAPE -> HorizontalTicTacToe()
                else -> throw RuntimeException()
            }
        }
    }
}

@Composable
fun HorizontalTicTacToe() {
    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = SpaceEvenly,
        verticalAlignment = CenterVertically
    ) {
        HorizontalBoard()
        WinnerBlock()
    }
}


@Composable
fun VerticalTicTacToe() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = SpaceEvenly,
        horizontalAlignment = CenterHorizontally
    ) {
        VerticalBoard()
        WinnerBlock()
    }
}

