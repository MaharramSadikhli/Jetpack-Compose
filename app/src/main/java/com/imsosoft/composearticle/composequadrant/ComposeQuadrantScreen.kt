package com.imsosoft.composearticle.composequadrant

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.imsosoft.composearticle.R
import com.imsosoft.composearticle.composequadrant.components.InnerColumn
import com.imsosoft.composearticle.ui.theme.*

@Composable
fun ComposeQuadrant() {

    Column(modifier = Modifier.fillMaxWidth()) {

        val titleText = stringResource(id = R.string.text_composable)
        val titleImage = stringResource(id = R.string.image_composable)
        val titleRow = stringResource(id = R.string.row_composable)
        val titleColumn = stringResource(id = R.string.column_composable)

        val descText = stringResource(id = R.string.text_composable_desc)
        val descImage = stringResource(id = R.string.image_composable_desc)
        val descRow = stringResource(id = R.string.row_composable_desc)
        val descColumn = stringResource(id = R.string.column_composable_desc)

        Row(modifier = Modifier.weight(1f)) {
            InnerColumn(title = titleText, desc = descText, color = QuadrantExtraLight, modifier = Modifier.weight(1f))
            InnerColumn(title = titleImage, desc = descImage, color = QuadrantLightPurple, modifier = Modifier.weight(1f))
        }

        Row(modifier = Modifier.weight(1f)) {
            InnerColumn(title = titleRow, desc = descRow, color = QuadrantPurple, modifier = Modifier.weight(1f))
            InnerColumn(title = titleColumn, desc = descColumn, color = QuadrantWhite, modifier = Modifier.weight(1f))
        }

    }

}