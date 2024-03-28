package com.imsosoft.composearticle.composearticle

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.imsosoft.composearticle.R
import com.imsosoft.composearticle.composearticle.components.DescriptionText
import com.imsosoft.composearticle.composearticle.components.IntroText
import com.imsosoft.composearticle.composearticle.components.TitleText

@Composable
fun ComposeArticle(modifier: Modifier) {

    val image = painterResource(id = R.drawable.bg_compose_background)
    val title = stringResource(id = R.string.title)
    val introText = stringResource(id = R.string.intro_text)
    val descriptionText = stringResource(id = R.string.description_text)

    Box(modifier = modifier) {
        Column {
            Image(
                painter = image,
                contentDescription = title,
                modifier = Modifier.fillMaxWidth()
            )

            TitleText(text = title)

            Spacer(modifier = Modifier.padding(10.dp))

            IntroText(text = introText)

            Spacer(modifier = Modifier.padding(10.dp))

            DescriptionText(text = descriptionText)
        }


    }


}

