package com.example.estevez_ivan_ex1tDist.screens.basicos

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Flag
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

val spacedByDefault = 5.dp
const val boardSize = 8


@Composable
fun Buscaminas() {
    Column(
        Modifier.fillMaxSize().padding(10.dp),
        verticalArrangement = Arrangement.spacedBy( // (1)
            space = spacedByDefault,
            alignment = Alignment.CenterVertically
        ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        repeat(boardSize) {
            Row(horizontalArrangement = Arrangement.spacedBy(spacedByDefault)) {
                repeat(boardSize) {
                    Button(
                        onClick = { /*TODO*/ },
                        Modifier
                            .weight(1f)
                            .aspectRatio(1f)  // (2)
                    ) {
                        Icon(
                            Icons.Default.Flag,
                            contentDescription = null,
                        )
                    }
                }
            }
        }
    }
}


/*
 (1)
 Para poder hacer al mismo tiempo el arrangement de centrar la column pero separar con el spaceBy

 (2)
 aspectRatio fuerza la relación entre el ancho y el alto de un elemento. Si la relación es 1 (1f)
 el alto y el ancho serán iguales, o sea: botones cuadrados (dejando de lado el borde redondeado).
 En este caso. Adaptamos el número de botones que estipula el bucle a la pantalla al ponerles el
 mismo peso, de ese modo el ancho del botón es función del tamaño de la pantalla y el número de
 botones. Al forzar que sean cuadrados, ese ancho determina su alto, y por tanto el alto total del
 cuadro en vertical.


 */