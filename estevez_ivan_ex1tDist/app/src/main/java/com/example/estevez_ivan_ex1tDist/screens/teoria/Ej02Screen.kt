package com.example.estevez_ivan_ex1tDist.screens.teoria

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
fun Ej02Screen() {
    Box(  // (1)
        Modifier
            .background(Color.Yellow)
            .fillMaxSize()
            .padding(30.dp)
            .background(Color.Green),
        // (1)
        content = {
            Text(text = "Texto 1 Hadcodeado", Modifier.align(Alignment.CenterEnd))
            Text(text = "Otro texto hardcodeado", Modifier.align(Alignment.BottomEnd))
            HolaMundoSimple("Composición llamando desde otra función composable")  // (2)
            Text(text = "Texto 4 Hadcodeado", Modifier.align(Alignment.TopCenter))
        }
    )

}

/*
(1)
Elementos como Column, Row o Box cumplen una función similar a la de los Layouts, permiten posicionar
los elementos internos de un determinado modo. La función Text no puede tener por si sola un
parámetro que indique su posición dentro de la Box (ya que no tiene por qué estar dentro de una),
pero sí pasa a tener ese atributo cuando está dentro de un "BoxScope".

El argumento "content" recibe una lambda, que se recomienda sacar de los paréntesis (dejar el cursor
en content, pulsar Alt+Intro y el IDE nos recomienda extraerlo).


(2)
Sin embargo, HolaMundoSimple no tiene definido que pueda recibir un Modifier, con lo que no podemos
posicionarlo.


 */
