package com.example.lista

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier

@Composable
fun ShoppingInventoryScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        StatefulCounter()

        val list = remember { getShoppingInventoryItems().toMutableStateList() }
        ShoppingInventoryList(list = list, onCloseItem = { item -> list.remove(item) })
    }
}

private fun getShoppingInventoryItems() = List(30) { i -> ShoppingInventory(i, "Item $i") }
