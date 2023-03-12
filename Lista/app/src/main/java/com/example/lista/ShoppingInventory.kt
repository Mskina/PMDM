package com.example.lista

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

// Gardamos os elementos
class ShoppingInventory(
    val id: Int,
    label: String,
    initialChecked: Boolean = false
) {
    var label: String by mutableStateOf(label)
    var checked: Boolean by mutableStateOf(initialChecked)
}

