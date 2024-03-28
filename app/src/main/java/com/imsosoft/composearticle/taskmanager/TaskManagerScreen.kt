package com.imsosoft.composearticle.taskmanager

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.imsosoft.composearticle.R

@Composable
fun TaskManager(modifier: Modifier) {

    Box {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
        ) {

            val image = painterResource(id = R.drawable.ic_task_completed)
            val taskCompleted = stringResource(id = R.string.all_task_completed)
            val niceWork = stringResource(id = R.string.nice_work)

            Image(
                painter = image,
                contentDescription = taskCompleted,
                modifier = Modifier
                    .fillMaxWidth()
            )

            Text(
                text = taskCompleted,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
            )

            Text(
                text = niceWork,
                fontSize = 16.sp
                )

        }
    }



}