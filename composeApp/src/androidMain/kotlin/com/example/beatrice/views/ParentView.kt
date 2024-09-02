package com.example.beatrice.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.beatrice.BMIResult
import com.example.beatrice.UserData
import com.example.beatrice.calculateBMI
import com.example.beatrice.components.ButtonComponent
import com.example.beatrice.components.TitleComponent
import com.example.beatrice.resources.darkNavy

@Composable
fun ParentView(modifier: Modifier = Modifier) {
    var data by remember {
        mutableStateOf(
            UserData(
                age = 16,
                isMale = true,
                isFemale = false,
                height = 54.6f,
                weight = 5
            )
        )
    }
    var bmiResult: BMIResult? by remember {
        mutableStateOf(null)
    }
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
        if (bmiResult == null) {
            CalculatorView(userData = data,
                onHeightChanged = { newHeight ->
                    data = data.copy(height = newHeight)

                },
                onWeightChanged = { newWeight ->
                    data = data.copy(weight = newWeight)

                },
                onAgeChanged = { newAge ->
                    data = data.copy(age = newAge)
                },
                onGenderSelectedChanged = { isMale, isFemale ->
                    data = data.copy(isFemale = isFemale, isMale = isMale)
                }
            )
        } else {
            ResultView(bmiResult = bmiResult!!)
        }
        ButtonComponent(
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp),
            label = if (bmiResult == null) "Calculate" else "Re-Calculate",
            onClicked = {
                bmiResult = if (bmiResult != null) {
                    null
                } else {
                    calculateBMI(data)
                }

            }
        )
    }
}