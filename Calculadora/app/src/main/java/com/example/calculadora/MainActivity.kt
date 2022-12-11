package com.example.calculadora

import android.content.pm.PackageManager.ComponentEnabledSetting
import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculadora.ui.theme.CalculadoraTheme
import com.example.calculadora.ui.theme.DarkRed


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculadoraTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    val configuration = LocalConfiguration.current
                    when (configuration.orientation) {
                        Configuration.ORIENTATION_LANDSCAPE -> {
                            Row() {
                                Display(Modifier.weight(1f))
                                Botonera(Modifier.weight(1f))
                            }
                        }
                        else -> {
                            Column() {
                                Display(Modifier.weight(1.5f))
                                Botonera(Modifier.weight(5f))
                            }
                        }
                    }
                }
            }
        }
    }

    @Composable
    fun Display(
        modifier: Modifier = Modifier
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(start = 20.dp, end = 20.dp, top = 40.dp, bottom = 20.dp)
                .then(modifier),
            contentAlignment = Alignment.BottomEnd,
        )
        {
            Text(
                text = "0",
                textAlign = TextAlign.End,
                color = Color.Black,
                fontSize = 80.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }

    @Composable
    fun Botonera(
        modifier: Modifier
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .then(modifier)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.66f)
            ) {
                BotonM("MC", Modifier.weight(1f), enabled = false) // Color omitted. Has already one by default and don't want to change it.
                BotonM("MR", Modifier.weight(1f), enabled = false)
                BotonM("M+", Modifier.weight(1f))
                BotonM("M-", Modifier.weight(1f))
                BotonM("MS", Modifier.weight(1f))
                BotonM("M^", Modifier.weight(1f))

            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                BotonCalculadora("%", Modifier.weight(1f))
                BotonCalculadora("CE", Modifier.weight(1f))
                BotonCalculadora("C", Modifier.weight(1f))
                BotonCalculadora("\u232B", Modifier.weight(1f), DarkRed) // test to check param Color
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                BotonCalculadora("1/x", Modifier.weight(1f))
                BotonCalculadora("x²", Modifier.weight(1f))
                BotonCalculadora("√", Modifier.weight(1f))
                BotonCalculadora("÷", Modifier.weight(1f))
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                BotonCalculadora("7", Modifier.weight(1f))
                BotonCalculadora("8", Modifier.weight(1f))
                BotonCalculadora("9", Modifier.weight(1f))
                BotonCalculadora("x", Modifier.weight(1f))
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                BotonCalculadora("4", Modifier.weight(1f))
                BotonCalculadora("5", Modifier.weight(1f))
                BotonCalculadora("6", Modifier.weight(1f))
                BotonCalculadora("-", Modifier.weight(1f))
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                BotonCalculadora("1", Modifier.weight(1f))
                BotonCalculadora("2", Modifier.weight(1f))
                BotonCalculadora("3", Modifier.weight(1f))
                BotonCalculadora("+", Modifier.weight(1f))
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                BotonCalculadora("±", Modifier.weight(1f))
                BotonCalculadora("0", Modifier.weight(1f))
                BotonCalculadora(",", Modifier.weight(1f))
                BotonCalculadora("=", Modifier.weight(1f))
            }
        }
    }

    @Composable
    fun BotonM(
        text: String,
        modifier: Modifier = Modifier,
        color: Color = Color.DarkGray,
        enabled: Boolean = true
    ) {
        Button(
            onClick = { /*TODO*/},
            enabled = enabled,
            modifier = Modifier
                .fillMaxSize(1f)
                .then(modifier),
            colors = ButtonDefaults.buttonColors(
                containerColor = color,
                contentColor = Color.LightGray
            ),
            shape =  RectangleShape,
            border = BorderStroke(1.dp, color = Color.LightGray),
            contentPadding = PaddingValues(top = 1.dp, bottom = 1.dp)
        ) {
            Text(text = text,
                fontSize = 24.sp,
                color = Color.White)
        }
    }

    @Composable
    fun BotonCalculadora(
        text: String,
        modifier: Modifier = Modifier,
        color: Color = Color.DarkGray
    ) {
        Button(
            onClick = { /*TODO*/},
            modifier = Modifier
                .fillMaxSize(1f)
                .then(modifier),
            colors = ButtonDefaults.buttonColors(
                containerColor = color,
                contentColor = Color.LightGray
            ),
            shape =  RectangleShape,
            border = BorderStroke(1.dp, color = Color.LightGray),
            contentPadding = PaddingValues(top = 1.dp, bottom = 1.dp)
        ) {
            Text(text = text, fontSize = 40.sp, color = Color.White)
        }
    }
}
