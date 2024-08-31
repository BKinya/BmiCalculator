package com.example.beatrice.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.beatrice.R
import com.example.beatrice.resources.smokeWhite

@Composable
fun WeightAgeComponent(
    modifier: Modifier = Modifier,
    label: String ,
    value: Int,
    addButtonClicked: (Int) -> Unit,
    minusButtonClicked: (Int) -> Unit
    ) {
    BoxComponent(
        modifier = modifier.sizeIn(
            maxWidth = 180.dp,
            maxHeight = 180.dp,
            minHeight = 180.dp,

            )
    ) {
        Column(
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LightTextComponent(
                textColor = smokeWhite,
                text = label,
                fontSize = 20.sp
            )
            BoldTextComponent(
                text = "$value",
                fontSize = 50.sp
            )
            Spacer(Modifier.height(12.dp))

            Row(
                horizontalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                CircleButtonComponent(
                    modifier = Modifier.size(56.dp),
                    iconId = R.drawable.ic_add,
                    onClicked = {
                        addButtonClicked(value + 5)
                    }
                )
                CircleButtonComponent(
                    modifier = Modifier.size(56.dp),
                    iconId = R.drawable.ic_remove,
                    onClicked = {minusButtonClicked(value - 1)}
                )
            }



        }
    }

}