package com.example.lista

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ShoppingInventoryList(
    list: List<ShoppingInventory>,
    onCloseItem: (ShoppingInventory) -> Unit,
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(
            items = list,
            key = { item -> item.id }) { item ->
            StatefulShoppingInventoryItem(
                itemName = item.label,
                onClose = { onCloseItem(item) }
            )
        }
    }
}