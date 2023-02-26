package com.example.lista

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun Screen(
    modifier: Modifier = Modifier,
    viewModel: ViewModel = viewModel(),
) {
    Column(modifier = modifier) {
        StatefulCounter()

        List(
            list = viewModel.items,
            onCheckedItem = { item, checked ->
                viewModel.changeItemChecked(item, checked)
            },
            onCloseItem = { item ->
                viewModel.remove(item)
            })
    }
}