package com.imsosoft.composearticle.composequadrant.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun InnerColumn(title: String, desc: String, modifier: Modifier, color: Color) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(color),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        TitleText(text = title)

        DescriptionText(text = desc)

    }

}