package com.example.lista

import androidx.compose.animation.fadeOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
@Preview
fun Screen(
    modifier: Modifier = Modifier,
    viewModel: ViewModel = viewModel()
) {
    Scaffold(
        topBar = {
            TopAppBar {
                Image(
                    painter = painterResource(id = R.drawable.baseline_shopping_basket_24),
                    contentDescription = "Image",
                    Modifier
                        .padding(10.dp)
                        .size(50.dp)
                        .clip(CircleShape)
                        .background(MaterialTheme.colors.primary),
                    alignment = Alignment.Center,
                )
                Text(text = "Shopping List",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold)
            }
        },
        bottomBar = {
            BottomAppBar {
                Box(
                    Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Iván Estévez Sabucedo",
                        fontStyle = FontStyle.Italic
                    )
                }
            }
        }
    ) {
        Column(modifier = Modifier.padding(paddingValues = it)) {
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
}