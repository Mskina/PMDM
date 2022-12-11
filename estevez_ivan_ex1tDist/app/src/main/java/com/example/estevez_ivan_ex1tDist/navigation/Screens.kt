package com.example.estevez_ivan_ex1tDist.navigation

sealed class Screens(val route: String){
    object MainScreen: Screens("initial_screen")
    object Ejemplo01: Screens("ej01")
    object Ejemplo02: Screens("ej02")
    object Ejemplo03: Screens("ej03")
    object Ejemplo04: Screens("ej04")
    object Buscaminas: Screens("buscaminas")
    object ImagenesIconos: Screens("imagenes_iconos")
    object Ejemplo06: Screens("ej06")
    object Ejemplo07: Screens("ej07")
    object Ejemplo08: Screens("ej08")

}

/* Sealed classes:
https://medium.com/droid-latam/sealed-classes-en-kotlin-por-qu%C3%A9-y-para-qu%C3%A9-67bb9e1f2e5e
*/