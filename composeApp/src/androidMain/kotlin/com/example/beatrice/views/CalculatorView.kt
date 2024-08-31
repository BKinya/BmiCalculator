package com.example.beatrice.views

import androidx.compose.runtime.remember as remember
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
import androidx.compose.runtime.mutableStateOf

import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.beatrice.R
import com.example.beatrice.UserData
import com.example.beatrice.calculateBMI
import com.example.beatrice.components.ButtonComponent
import com.example.beatrice.components.GenderComponent
import com.example.beatrice.components.HeightComponent
import com.example.beatrice.components.TitleComponent
import com.example.beatrice.components.WeightAgeComponent
import com.example.beatrice.resources.darkNavy

/**
 * TODO: Showing the result UI + animating the showing
 *
 * Maybe I'd just replace one ui with another... I do not want to put navigation in this
 *
 * I'm loving this progress though
 */


@Composable
fun CalculatorView(
    modifier: Modifier = Modifier
) {
   var data by remember {
       mutableStateOf(
           UserData(
               age = 16,
               isMale = true,
               isFemale = false,
               height = 53.0f,
               weight = 0
           )
       )
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
        Column(
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                GenderComponent(
                    isSelected = data.isMale,
                    label = "Male",
                    iconId = R.drawable.ic_male,
                    onSelectedChanged = {
                        data = data.copy(
                            isMale = true,
                            isFemale = false
                        )
                    }
                )
                GenderComponent(
                    isSelected = data.isFemale,
                    label = "Female",
                    iconId = R.drawable.ic_female,
                    onSelectedChanged = {
                        data = data.copy(
                            isFemale = true,
                            isMale = false
                        )

                    }
                )
            }

            Spacer(modifier = Modifier.height(40.dp))
            HeightComponent(height = data.height,
                onHeightChanged = { newValue ->
                    data = data.copy(height = newValue)
                })
            Spacer(modifier = Modifier.height(40.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                WeightAgeComponent(
                    label = "Weight",
                    value = data.weight,
                    addButtonClicked = { newWeight ->
                        data = data.copy(weight = newWeight)
                    },
                    minusButtonClicked = { newWeight ->
                        data = data.copy(weight = newWeight)
                    }

                )
                WeightAgeComponent(
                    label = "Age",
                    value = data.age,
                    addButtonClicked = { newAge ->
                        data = data.copy(age = newAge)
                    },
                    minusButtonClicked = { newAge ->
                        data = data.copy(age = newAge)
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
                calculateBMI(data)
            }
        )
    }

}



@Preview
@Composable
fun CalculatorViewPreview() {
    CalculatorView()
}