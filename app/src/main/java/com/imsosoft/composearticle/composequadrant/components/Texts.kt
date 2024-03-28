package com.imsosoft.composearticle.composequadrant.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp

@Composable
fun TitleText(text: String) {

    Text(
        text = text,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(bottom = 16.dp)
        )

}


@Composable
fun DescriptionText(text: String) {

    Text(
        text = text,
        textAlign = TextAlign.Justify
        )

}