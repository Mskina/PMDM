package com.example.chatinterface

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MessagesList(messages: List<Message>) {

    LazyColumn(
        Modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {

        items(messages) { message ->
            MessageItem(message)
        }
    }

}