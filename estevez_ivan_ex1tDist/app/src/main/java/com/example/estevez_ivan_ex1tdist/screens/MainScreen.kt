package com.example.estevez_ivan_ex1tDist.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.estevez_ivan_ex1tDist.navigation.Screens

@Composable
fun MainScreen(navController: NavController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()), // para que sea scrollable
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Button(onClick = { navController.navigate(route = Screens.Ejemplo01.route) }) {
            Text(text = "Ejemplo 1")
        }
        Button(onClick = { navController.navigate(route = Screens.Ejemplo02.route) }) {
            Text(text = "Ejemplo 2")
        }
        Button(onClick = { navController.navigate(route = Screens.Ejemplo03.route) }) {
            Text(text = "Ejemplo 3")
        }
        Button(onClick = { navController.navigate(route = Screens.Ejemplo04.route) }) {
            Text(text = "Ejemplo 4")
        }
        Button(onClick = { navController.navigate(route = Screens.Buscaminas.route) }) {
            Text(text = "Ejemplo 5")
        }
        Button(onClick = { navController.navigate(route = Screens.ImagenesIconos.route) }) {
            Text(text = "ImagenesIconos")
        }
        Button(onClick = { navController.navigate(route = Screens.Ejemplo06.route) }) {
            Text(text = "Ejemplo 6")
        }



    }

}