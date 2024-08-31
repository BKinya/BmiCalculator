package com.example.beatrice.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.beatrice.resources.darkBlue40


@Composable
fun BoxComponent(
    modifier: Modifier = Modifier,
    backgroundColor: Color = darkBlue40,
    cornerRadius: Int = 16,
    content: @Composable () -> Unit,

    ) {
    Box(
        modifier = modifier.background(
            color = backgroundColor,
            shape = RoundedCornerShape(cornerRadius.dp)
        )
    ) {
        content()
    }
}