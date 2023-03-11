package com.example.lista

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Item(
    itemName: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    onClose: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Card(
        modifier = modifier.padding(16.dp, 6.dp, 16.dp, 6.dp),
        shape = RoundedCornerShape(10.dp),
        backgroundColor = MaterialTheme.colors.secondary,
        elevation = 3.dp,
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = itemName,
                Modifier
                    .weight(1f)
                    .padding(start = 16.dp)
            )
            Checkbox(
                checked = checked,
                onCheckedChange = onCheckedChange
            )
            IconButton(onClick = onClose) {
                Icon(
                    Icons.Filled.Close,
                    contentDescription = "Close"
                )
            }
        }
    }

}