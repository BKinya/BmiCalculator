package com.example.beatrice.components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun TitleComponent(
    modifier: Modifier = Modifier,
    title: String = "BMI Calculator"
) {
    Text(
        modifier = modifier,
        text = title,
        style = TextStyle(
            color = Color.White,
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )
    )
}


@Composable
fun
        BoldTextComponent(
    modifier: Modifier = Modifier,
    text: String,
    fontSize: TextUnit = 50.sp,
    textColor: Color = Color.White

) {
    Text(
        modifier = modifier,
        text = text,
        style = TextStyle(
            color = textColor,
            fontSize = fontSize,
            fontWeight = FontWeight.Bold
        )
    )
}

@Preview
@Composable
fun RegularTextComponent(
    modifier: Modifier = Modifier,
    text: String = "Normal text",
    fontSize: TextUnit = 20.sp,
    textColor: Color = Color.White
) {
    Text(
        modifier = modifier,
        text = text,
        style = TextStyle(
            color = textColor,
            fontSize = fontSize,
            fontWeight = FontWeight.Normal,

        ),
        textAlign = TextAlign.Center
    )
}

@Composable
fun LightTextComponent(
    modifier: Modifier = Modifier,
    text: String = "Normal text",
    fontSize: TextUnit = 20.sp,
    textColor: Color = Color.White
) {
    Text(
        modifier = modifier,
        text = text,
        style = TextStyle(
            color = textColor,
            fontSize = fontSize,
            fontWeight = FontWeight.Light
        )
    )
}