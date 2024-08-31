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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.beatrice.components.BoldTextComponent
import com.example.beatrice.components.BoxComponent
import com.example.beatrice.components.ButtonComponent
import com.example.beatrice.components.RegularTextComponent
import com.example.beatrice.components.TitleComponent
import com.example.beatrice.resources.darkBlue40
import com.example.beatrice.resources.darkNavy

@Preview
@Composable
fun ResultView(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(darkNavy),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 32.dp)
            ) {
                TitleComponent(
                    modifier = Modifier.align(alignment = Alignment.Center)
                )
            }
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
                    modifier = Modifier.fillMaxSize().padding(32.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    BoldTextComponent(
                        textColor = Color.Green,
                        text = "Normal", fontSize = 40.sp
                    )

                    BoldTextComponent(text = "22.3",
                        fontSize = 77.sp)

                    RegularTextComponent(text = "You have a normal body weight. Good Job!",
                        fontSize = 27.sp)


                }
            }

        ButtonComponent(
            modifier = Modifier
                .fillMaxWidth()
                .height(71.dp),
            label = "Re-Calculate",
            onClicked = {

            }
        )
    }
}