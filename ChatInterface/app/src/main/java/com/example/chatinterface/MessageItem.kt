package com.example.chatinterface

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun MessageItem(message: Message) {
    var showTime by rememberSaveable { mutableStateOf(false) }
    val onClick = { showTime = !showTime }

    StatelessMessageItem(message, showTime, onClick)
}

@Composable
fun StatelessMessageItem(message: Message, showTime: Boolean, onClick: () -> Unit) {

    Card(
        shape = RoundedCornerShape(
            topStart = if (message.sender == User.REMOTE) 0.dp else 20.dp,
            topEnd = if (message.sender == User.REMOTE) 20.dp else 0.dp,
            bottomEnd = 20.dp,
            bottomStart = 20.dp
        ),
        elevation = 10.dp,
        modifier = Modifier
            .padding(10.dp)
            .clickable(onClick = onClick),
    ) {
        Text(text = message.text, modifier = Modifier.padding(10.dp))
        if (showTime) {
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = message.timestamp.format(formatter))
            // https://mkyong.com/java8/java-8-how-to-format-localdatetime/
            // TODO: https://www.flutterclutter.dev/flutter/tutorials/date-format-dynamic-string-depending-on-how-long-ago/2020/229/
        }
    }
}
