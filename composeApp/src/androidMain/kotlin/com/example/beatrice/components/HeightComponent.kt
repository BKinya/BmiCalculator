package com.example.beatrice.components

    import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Slider
import androidx.compose.material.SliderDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.beatrice.resources.pink
import com.example.beatrice.resources.smokeWhite


@Composable
fun HeightComponent(
    modifier: Modifier = Modifier,
    height: Float,
    onHeightChanged: (Float) -> Unit
) {
    BoxComponent(
        modifier = modifier
    ) {
        Column(
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            LightTextComponent(
                textColor = smokeWhite,
                text = "Height",
                fontSize = 20.sp
            )
            Spacer(Modifier.height((-1).dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                BoldTextComponent(
                    text = "${height.toInt()}"
                )
                Spacer(Modifier.width(4.dp))
                Column (
                    modifier = Modifier
                ) {
                    Spacer(Modifier.height(30.dp))
                    LightTextComponent(
                        text = "cm",
                        textColor = smokeWhite,
                        fontSize = 16.sp,
                    )
                }
            }

            Slider(
                value = height,
                onValueChange = { newHeight ->
                    onHeightChanged(newHeight)
                },
                valueRange = 53f..299f,
                colors = SliderDefaults.colors(
                   thumbColor = pink, 
                    activeTrackColor = pink,
                   inactiveTrackColor = smokeWhite

                )
            )

        }
    }

}