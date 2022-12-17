package com.example.estevez_ivan_ex1tDist.screens.teoria

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.estevez_ivan_ex1tDist.R


@Preview
@Composable
fun Ej02Screen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {Text(text = stringResource(R.string.tres_en_raya))})
        }
    ) {

        val configuration = LocalConfiguration.current
        when (configuration.orientation) {
            Configuration.ORIENTATION_LANDSCAPE -> {
                Row(Modifier.padding(it)) {
                    Tablero(Modifier.weight(1f))
                    Ganador(Modifier.weight(1f))
                    }
                }
            else -> {
                Column(Modifier.padding(it)) {
                    Tablero(Modifier.weight(1f))
                    Ganador(Modifier.weight(1f))
                }
            }
        }
    }
}

@Composable
fun Tablero(
    modifier: Modifier = Modifier
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
            Boton("X", Modifier.weight(1f))
            Boton("O", Modifier.weight(1f))
            Boton("", Modifier.weight(1f))
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Boton("O", Modifier.weight(1f))
            Boton("X", Modifier.weight(1f))
            Boton("", Modifier.weight(1f))
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Boton("O", Modifier.weight(1f))
            Boton("", Modifier.weight(1f))
            Boton("X", Modifier.weight(1f))
        }
    }
}

@Composable
fun Ganador(
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
        Boton(text = "X Ganador")
    }
}


@Composable
fun Boton(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.DarkGray
) {
    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .fillMaxSize(1f)
            .padding(10.dp)
            .then(modifier),
    ) {
        Text(text = text, fontSize = 40.sp, color = Color.White)
    }
}
