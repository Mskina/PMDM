package com.example.calculadora

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculadora.ui.theme.CalculadoraTheme


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
                                Column(Modifier.weight(1f)) {
                                    DisplayCalculadora()
                                }
                                Column(Modifier.weight(1f)) {
                                    DisplayBotonera()
                                }
                            }
                        }
                        else -> {
                            Column() {
                                Row(Modifier.weight(1.5f)) {
                                    DisplayCalculadora()
                                }
                                Row(Modifier.weight(5f)) {
                                    DisplayBotonera()
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Composable
    fun DisplayCalculadora(
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(start = 20.dp, end = 20.dp, top = 40.dp, bottom = 20.dp),
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
    fun DisplayBotonera(
    ) {
        Column() {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.66f)
            ) {
                BotonM("MC", Modifier.weight(1f))
                BotonM("MR", Modifier.weight(1f))
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
                BotonCalculadora("\u232B", Modifier.weight(1f))
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
        color: Color = Color.DarkGray
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxSize(1f)
                .border(1.dp, color = Color.LightGray)
                .background(color)
                .then(modifier)
        ) {
            Text(text = text, fontSize = 25.sp, color = Color.White)
        }
    }

    @Composable
    fun BotonCalculadora(
        text: String,
        modifier: Modifier = Modifier,
        color: Color = Color.DarkGray
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxSize(1f)
                .border(1.dp, color = Color.LightGray)
                .background(color)
                .then(modifier)
        ) {
            Text(text = text, fontSize = 40.sp, color = Color.White)
        }
    }
}
