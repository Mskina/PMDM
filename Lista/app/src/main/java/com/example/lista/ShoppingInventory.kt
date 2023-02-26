package com.example.lista

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

// Gardamos os elementos
class ShoppingInventory(
    val id: Int,
    val label: String,
    initialChecked: Boolean = false
) {
    var checked by mutableStateOf(initialChecked)
}

// Gardamos os estados dos elementos (marcado/non marcado)
// Empregamos MutableState<Boolean> para "compartir" o estado da checkbox
data class ShoppingItem(
    val id: Int,
    val label: String,
    var checked: MutableState<Boolean> = mutableStateOf(false)
)

