package com.example.estevez_ivan_ex1tDist.screens.basicos

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Flag
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage


// https://devexperto.com/imagenes-coil-iconos-jetpack-compose/


@Composable
fun ImagenesIconos() {

    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()), // para que la Column sea scrollable,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        //TextField(value = "0", onValueChange = { createBoard(value) })

        Icon(
            Icons.Default.PlayArrow,
            contentDescription = "Texto alternativo para accesibilidad",
        )

        Icon(
            Icons.Default.Flag,
            contentDescription = null,
            modifier = Modifier.size(92.dp),
            tint = Color.Green
        )



        AsyncImage( // (1)
            model = "https://www.meme-arsenal.com/memes/75c1109bebaab9c203247308908e9c8d.jpg",
            contentDescription = "Texto alternativo"
        )


    }

}


/*
(1) Referenciando una imagen por su URL en la red con Coil (https://coil-kt.github.io/coil/compose/).
 Requiere añadir:
    - La dependencia de Coil en build.gradle
    - Permiso de acceso a Internet en el Manifest



 */