package com.example.chatinterface

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment.Companion.CenterEnd
import androidx.compose.ui.Alignment.Companion.CenterStart
import androidx.compose.ui.Alignment.Companion.End
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun MessageItem(message: Message) {
    var showTime by rememberSaveable { mutableStateOf(false) }
    val onClick = { showTime = !showTime }

    StatelessMessageItem(message, showTime, onClick)
}

@Composable
fun StatelessMessageItem(message: Message, showTime: Boolean, onClick: () -> Unit) {
    val shape = RoundedCornerShape(
        topStart = if (message.sender == User.REMOTE) 0.dp else 20.dp,
        topEnd = if (message.sender == User.REMOTE) 20.dp else 0.dp,
        bottomEnd = 20.dp,
        bottomStart = 20.dp
    )

    val backgroundColor = if (message.sender == User.REMOTE) Color.LightGray else Color.Green
    val align = if (message.sender == User.REMOTE) CenterStart else CenterEnd

    Box(modifier = Modifier.fillMaxSize()) {
        Card(
            shape = shape,
            backgroundColor = backgroundColor,
            elevation = 5.dp,
            modifier = Modifier
                .padding(10.dp)
                .clip(shape)
                .clickable(onClick = onClick)
                .fillMaxWidth(0.85f)
                .align(align)
        ) {
            Column {
                Text(text = message.text, modifier = Modifier.padding(10.dp))
                if (showTime) {
                    //Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = message.timestamp.format(formatter),
                        modifier = Modifier
                            .padding(10.dp, 0.dp, 10.dp, 10.dp)
                            .align(End)
                    )
                }
            }

        }
    }
}
