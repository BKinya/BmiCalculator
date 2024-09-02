package com.example.beatrice.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.beatrice.R
import com.example.beatrice.UserData
import com.example.beatrice.components.GenderComponent
import com.example.beatrice.components.HeightComponent
import com.example.beatrice.components.WeightAgeComponent

@Composable
fun CalculatorView(
    modifier: Modifier = Modifier,
    /**
     * This class is unstable... it mighty cause unwanted recompositions
     * Assuming I use the stable  annotation on the class... if any of
     * its properties changes, the change will make this screen to recompose.
     * (Not very sure about this though. Let's found out in another project)
     *
     */
    userData: UserData,
    onGenderSelectedChanged: (isMale: Boolean, isFemale: Boolean) -> Unit,
    onHeightChanged: (Float) -> Unit,
    onWeightChanged: (Int) -> Unit,
    onAgeChanged: (Int) -> Unit
) {
    Column(
        modifier = modifier.padding(start = 16.dp, end = 16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            GenderComponent(
                isSelected = userData.isMale,
                label = "Male",
                iconId = R.drawable.ic_male,
                onSelectedChanged = {
                    onGenderSelectedChanged(true, false)
                }
            )
            GenderComponent(
                isSelected = userData.isFemale,
                label = "Female",
                iconId = R.drawable.ic_female,
                onSelectedChanged = {
                    onGenderSelectedChanged(false, true)

                }
            )
        }

        Spacer(modifier = Modifier.height(40.dp))
        HeightComponent(height = userData.height,
            onHeightChanged = onHeightChanged)
        Spacer(modifier = Modifier.height(40.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            WeightAgeComponent(
                label = "Weight",
                value = userData.weight,
                addButtonClicked = { currentWeight ->
                    onWeightChanged(currentWeight + 5)
                },
                minusButtonClicked = { currentWeight ->
                    onWeightChanged(currentWeight - 1)
                }

            )
            WeightAgeComponent(
                label = "Age",
                value = userData.age,
                addButtonClicked = { currentAge ->
                    onAgeChanged(currentAge + 1)
                },
                minusButtonClicked = { currentAge ->
                        onAgeChanged(currentAge - 1)

                }
            )
        }
    }
}

