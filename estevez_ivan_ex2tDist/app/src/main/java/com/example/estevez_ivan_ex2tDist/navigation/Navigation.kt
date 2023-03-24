package com.example.estevez_ivan_ex2tDist.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.estevez_ivan_ex2tDist.screens.*
import com.example.estevez_ivan_ex2tDist.screens.ej01.Ej01Screen
import com.example.estevez_ivan_ex2tDist.screens.ej02_tictactoe.Ej02Screen
import com.example.estevez_ivan_ex2tDist.screens.ej03_calculadora.Ej03Screen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = Screens.MainScreen.route) {
        composable(route = Screens.MainScreen.route) { MainScreen(navController) }
        composable(route = Screens.Ejercicio01.route) { Ej01Screen() }
        composable(route = Screens.Ejercicio02.route) { Ej02Screen() }
        composable(route = Screens.Ejercicio03.route) { Ej03Screen() }

    }
}

