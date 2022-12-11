package com.example.estevez_ivan_ex1tDist.screens.teoria

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview  // (1)
@Composable  // (2)
fun Ej01Screen() {
    HolaMundoSimple(text = "Hola, Jetpack Compose")  // (3)
}

@Composable
fun HolaMundoSimple(text: String = "Hola mundo") {  // (4)
    Text(
        text = text,
        Modifier  // (5)
            .background(color = Color.Blue)
            .padding(16.dp) // Padding exterior
            .background(color = Color.Green) // // (6)
            .padding(16.dp) // Padding interior
    )
}


/*

(1)
Podemos utilizar la anotación @Preview para poder ir viendo las modificaciones que realizamos en nuestra
interfaz. En este caso, creamos una función para previsualizar y a esta le pasamos lo mismo que pasabamos al
setContent.

(2)
Todas las funciones "composables" deben declararse con la anotación @Composable
Las funciones Composable se escriben en UpperCamelCase.

(3)
Kotlin permite utilizar argumentos nombrados (named arguments), que pueden mejorar la legibilidad
del código y nos permitirían también pasarlos en cualquier orden.
https://kotlinlang.org/docs/functions.html#named-arguments

(5)
TODO:
- fluent factory extension function
https://developer.android.com/reference/kotlin/androidx/compose/ui/Modifier


(6)
El orden en que se llama a las funciones de extensión es importante. Véase como la llamada al segundo
background se superpone al primero (el color verde sobre el azul) pero solo dentro del padding que
se añade antes de poner el segundo.

*/