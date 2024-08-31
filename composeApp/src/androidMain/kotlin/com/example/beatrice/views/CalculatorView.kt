package com.example.beatrice.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.beatrice.R
import com.example.beatrice.components.ButtonComponent
import com.example.beatrice.components.GenderComponent
import com.example.beatrice.components.HeightComponent
import com.example.beatrice.components.TitleComponent
import com.example.beatrice.components.WeightAgeComponent
import com.example.beatrice.resources.darkNavy


@Composable
fun CalculatorView(
    modifier: Modifier = Modifier
) {
    // TODO: put these in a class... plain state holder
    var isMaleSelected by remember {
        mutableStateOf(true)
    }

    var isFemaleSelected by remember {
        mutableStateOf(false)
    }

    var height by remember {
        mutableFloatStateOf(53.0f)
    }

    var weight by remember {
        mutableIntStateOf(0)
    }

    var age by remember {
        mutableIntStateOf(0)
    }
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(darkNavy),
        verticalArrangement = Arrangement.SpaceBetween

    ) {
        Box(
            modifier = Modifier.fillMaxWidth()
                .padding(top = 32.dp)
        ) {
            TitleComponent(
                modifier = Modifier.align(alignment = Alignment.Center)
            )
        }
        Column(
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                GenderComponent(
                    isSelected = isMaleSelected,
                    label = "Male",
                    iconId = R.drawable.ic_male,
                    onSelectedChanged = {
                        isMaleSelected = true
                        isFemaleSelected = false
                    }
                )
                GenderComponent(
                    isSelected = isFemaleSelected,
                    label = "Female",
                    iconId = R.drawable.ic_female,
                    onSelectedChanged = {
                        isMaleSelected = false
                        isFemaleSelected = true
                    }
                )
            }

            Spacer(modifier = Modifier.height(40.dp))
            HeightComponent(height = height,
                onHeightChanged = { newValue ->
                    height = newValue
                })
            Spacer(modifier = Modifier.height(40.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                WeightAgeComponent(
                    label = "Weight",
                    value = weight,
                    addButtonClicked = { newWeight ->
                        weight = newWeight
                    },
                    minusButtonClicked = { newWeight ->
                        weight = newWeight
                    }

                )
                WeightAgeComponent(
                    label = "Age",
                    value = age,
                    addButtonClicked = { newAge ->
                        age = newAge
                    },
                    minusButtonClicked = { newAge ->
                        age = newAge
                    }

                )
            }
        }

        ButtonComponent(
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp),
            label = "Calculate",
            onClicked = {

            }
        )
    }

}

@Preview
@Composable
fun CalculatorViewPreview() {
    CalculatorView()
}