package com.example.estevez_ivan_ex1tDist.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.estevez_ivan_ex1tDist.screens.MainScreen
import com.example.estevez_ivan_ex1tDist.screens.basicos.Ej03Screen
import com.example.estevez_ivan_ex1tDist.screens.teoria.Ej01Screen
import com.example.estevez_ivan_ex1tDist.screens.teoria.Ej02Screen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = Screens.MainScreen.route) {
        composable(route = Screens.MainScreen.route) { MainScreen(navController) }
        composable(route = Screens.Ejemplo01.route) { Ej01Screen() }
        composable(route = Screens.Ejemplo02.route) { Ej02Screen() }
        composable(route = Screens.Ejemplo03.route) { Ej03Screen() }
    }
}
