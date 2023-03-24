package com.example.estevez_ivan_ex2tDist.screens.ej01

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.estevez_ivan_ex2tDist.R

private val spaceDefault = 32.dp

@Composable
fun Ej01Screen() {

    Box(Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center) {
        Column(
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(spaceDefault))
        {
            Text(text = stringResource(R.string.first_item))
            Text(text = stringResource(R.string.second_item))
            Text(text = stringResource(R.string.third_item))
        }
    }

}