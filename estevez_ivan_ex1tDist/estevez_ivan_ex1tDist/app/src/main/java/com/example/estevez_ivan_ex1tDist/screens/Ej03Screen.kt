package com.example.estevez_ivan_ex1tDist.screens.basicos

import android.content.res.Configuration
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.estevez_ivan_ex1tDist.R
import com.example.estevez_ivan_ex1tDist.ui.theme.DarkBlue

@Preview(showSystemUi = true)
@Composable
fun Ej03Screen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {Text(text = stringResource(R.string.calculadora))})
        }
    ) {
        val configuration = LocalConfiguration.current
        when (configuration.orientation) {
            Configuration.ORIENTATION_LANDSCAPE -> {
                Row(Modifier.padding(it)) {
                    BotoneraVertical(Modifier.weight(1f))
                    Display(Modifier.weight(2f))
                    Botonera(Modifier.weight(2f))
                    }
                }
        else -> {
            Column(Modifier.padding(it)) {
                Display(Modifier.weight(1.5f))
                BotoneraEspecial(Modifier.weight(1f))
                Botonera(Modifier.weight(5f))
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
            BotonCalculadora(text = "=", modifier = Modifier.weight(1f), color = DarkBlue)
        }
    }
}

@Composable
fun BotoneraEspecial(
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
                .weight(1f)
        ) {
            BotonCalculadora("AC", Modifier.weight(2f))
            BotonCalculadora("⌫", Modifier.weight(1f))
            BotonCalculadora(text = "/", modifier = Modifier.weight(1f), color = DarkBlue)
        }
    }
}

@Composable
fun BotoneraVertical(
    modifier: Modifier
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .then(modifier)
    ) {

        Row(
            modifier = Modifier
                .weight(2f)
        ) {
            BotonCalculadora("AC", Modifier.weight(1f))
        }

        Row(
            modifier = Modifier
                .weight(1f)
        ) {
            BotonCalculadora("⌫", Modifier.weight(1f))
        }

        Row(
            modifier = Modifier
                .weight(1f)
        ) {
            BotonCalculadora(text = "/", modifier = Modifier.weight(1f), color = DarkBlue)
        }




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
            .aspectRatio(1f)
            .then(modifier),
        colors = ButtonDefaults.buttonColors(
            contentColor = Color.LightGray
        ),
        shape =  RectangleShape,
        border = BorderStroke(1.dp, color = Color.LightGray),
        contentPadding = PaddingValues(top = 1.dp, bottom = 1.dp)
    ) {
        Text(text = text, fontSize = 40.sp, color = Color.White)
    }
}