package com.example.beatrice.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.beatrice.BMIResult
import com.example.beatrice.Status
import com.example.beatrice.components.BoldTextComponent
import com.example.beatrice.components.BoxComponent
import com.example.beatrice.components.ButtonComponent
import com.example.beatrice.components.RegularTextComponent
import com.example.beatrice.components.TitleComponent
import com.example.beatrice.resources.darkBlue40
import com.example.beatrice.resources.darkNavy
import com.example.beatrice.resources.orange


@Composable
fun ResultView(
    bmiResult: BMIResult
) {
    Box(modifier = Modifier.fillMaxWidth()) {
        BoldTextComponent(
            text = "Your Result",
            modifier = Modifier.align(alignment = Alignment.Center)
        )
    }

    BoxComponent(
        backgroundColor = darkBlue40,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .sizeIn(maxHeight = 500.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(32.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            val status = bmiResult.status
            when (status) {
                is Status.Underweight -> BoldTextComponent(
                    textColor = orange,
                    text = status.value, fontSize = 40.sp
                )

                is Status.Normal -> BoldTextComponent(
                    textColor = Color.Green,
                    text = status.value, fontSize = 40.sp
                )

                is Status.Obese -> BoldTextComponent(
                    textColor = Color.Red,
                    text = status.value, fontSize = 40.sp
                )

                is Status.Overweight -> BoldTextComponent(
                    textColor = Color.Yellow,
                    text = status.value, fontSize = 40.sp
                )
            }


            BoldTextComponent(
                text = String.format("%.1f", bmiResult.bmi),
                fontSize = 77.sp
            )

            when (status) {
                is Status.Underweight -> RegularTextComponent(
                    text = status.message,
                    fontSize = 27.sp
                )

                is Status.Normal -> RegularTextComponent(
                    text = status.message,
                    fontSize = 27.sp
                )

                is Status.Overweight -> RegularTextComponent(
                    text = status.message,
                    fontSize = 27.sp
                )

                is Status.Obese -> RegularTextComponent(
                    text = status.message,
                    fontSize = 27.sp
                )

            }

        }
    }
}