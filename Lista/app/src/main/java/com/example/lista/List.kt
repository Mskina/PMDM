package com.example.lista

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun List(
    list: List<ShoppingInventory>,
    onCheckedItem: (ShoppingInventory, Boolean) -> Unit,
    onCloseItem: (ShoppingInventory) -> Unit,
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(
            items = list,
            key = { item -> item.id }) { item ->
            Item(
                itemName = item.label,
                checked = item.checked,
                onCheckedChange = { checked -> onCheckedItem(item, checked) },
                onClose = { onCloseItem(item) },
                modifier = modifier.animateItemPlacement()
            )
        }
    }
}

