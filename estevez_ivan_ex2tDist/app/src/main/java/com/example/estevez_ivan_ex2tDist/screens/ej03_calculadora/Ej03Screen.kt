package com.example.estevez_ivan_ex2tDist.screens.ej03_calculadora

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.estevez_ivan_ex2tDist.ui.theme.CalculadoraTheme
import com.example.estevez_ivan_ex2tDist.R

@Composable
fun Ej03Screen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(R.string.calculator)) })
        }
    ) {
        CalculadoraTheme() {
            Box(modifier = Modifier
                .fillMaxSize()
                .padding(it)) {
                when (LocalConfiguration.current.orientation) {
                    Configuration.ORIENTATION_PORTRAIT -> CalculadoraVertical()
                    Configuration.ORIENTATION_LANDSCAPE -> CalculadoraHorizontal()
                    else -> throw RuntimeException()
                }
            }
        }
    }
}


@Composable
private fun CalculadoraVertical() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colors.onBackground)
            .padding(2.dp),
    ) {

        DisplayCalculadora(Modifier.weight(1f))

        Row(modifier = Modifier.fillMaxWidth()) {
            CalculatorButton(text = "AC",
                Modifier.weight(2f).aspectRatio(2f),
                color = MaterialTheme.colors.primaryVariant)
            CalculatorButton(text = "\u232B",
                Modifier.weight(1f).aspectRatio(1f),
                color = MaterialTheme.colors.primaryVariant)
            CalculatorButton(text = "/",
                Modifier.weight(1f).aspectRatio(1f),
                color = MaterialTheme.colors.primaryVariant)
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            CalculatorButton(text = "7", Modifier.weight(1f).aspectRatio(1f))
            CalculatorButton(text = "8", Modifier.weight(1f).aspectRatio(1f))
            CalculatorButton(text = "9", Modifier.weight(1f).aspectRatio(1f))
            CalculatorButton(text = "X", Modifier.weight(1f).aspectRatio(1f),
                color = MaterialTheme.colors.primaryVariant)
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            CalculatorButton(text = "4", Modifier.weight(1f).aspectRatio(1f))
            CalculatorButton(text = "5", Modifier.weight(1f).aspectRatio(1f))
            CalculatorButton(text = "6", Modifier.weight(1f).aspectRatio(1f))
            CalculatorButton(text = "-", Modifier.weight(1f).aspectRatio(1f),
                color = MaterialTheme.colors.primaryVariant)
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            CalculatorButton(text = "1", Modifier.weight(1f).aspectRatio(1f))
            CalculatorButton(text = "2", Modifier.weight(1f).aspectRatio(1f))
            CalculatorButton(text = "3", Modifier.weight(1f).aspectRatio(1f))
            CalculatorButton(text = "+", Modifier.weight(1f).aspectRatio(1f),
                color = MaterialTheme.colors.primaryVariant)
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            CalculatorButton(text = "+/-", Modifier.weight(1f).aspectRatio(1f))
            CalculatorButton(text = "0", Modifier.weight(1f).aspectRatio(1f))
            CalculatorButton(text = ",", Modifier.weight(1f).aspectRatio(1f))
            CalculatorButton(text = "=", Modifier.weight(1f).aspectRatio(1f),
                color = MaterialTheme.colors.secondary)
        }
    }
}


@Composable
private fun CalculadoraHorizontal() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.onBackground)
            .padding(2.dp),
        horizontalArrangement = Arrangement.End
    ) {

        Column(modifier = Modifier.fillMaxHeight()) {

            CalculatorButton(text = "AC",
                Modifier.weight(2f).aspectRatio(.5f),
                color = MaterialTheme.colors.primaryVariant)
            CalculatorButton(text = "\u232B",
                Modifier.weight(1f).aspectRatio(1f),
                color = MaterialTheme.colors.primaryVariant)
            CalculatorButton(text = "/",
                Modifier.weight(1f).aspectRatio(1f),
                color = MaterialTheme.colors.primaryVariant)
        }

        DisplayCalculadora(Modifier.weight(1f))

        Column(modifier = Modifier.fillMaxHeight().background(MaterialTheme.colors.onBackground)) {

            Row(modifier = Modifier.weight(1f)) {
                CalculatorButton(text = "7")
                CalculatorButton(text = "8")
                CalculatorButton(text = "9")
                CalculatorButton(text = "X", Modifier.aspectRatio(1f),
                    color = MaterialTheme.colors.primaryVariant)
            }
            Row(modifier = Modifier.weight(1f)) {
                CalculatorButton(text = "4")
                CalculatorButton(text = "5")
                CalculatorButton(text = "6")
                CalculatorButton(text = "-",
                    Modifier.aspectRatio(1f), color = MaterialTheme.colors.primaryVariant)
            }
            Row(modifier = Modifier.weight(1f)) {
                CalculatorButton(text = "1")
                CalculatorButton(text = "2")
                CalculatorButton(text = "3")
                CalculatorButton(text = "+",
                    Modifier.aspectRatio(1f), color = MaterialTheme.colors.primaryVariant)
            }
            Row(modifier = Modifier.weight(1f)) {
                CalculatorButton(text = "+/-")
                CalculatorButton(text = "0")
                CalculatorButton(text = ",")
                CalculatorButton(text = "=",
                    Modifier.aspectRatio(1f), color = MaterialTheme.colors.secondary)
            }

        }

    }
}

