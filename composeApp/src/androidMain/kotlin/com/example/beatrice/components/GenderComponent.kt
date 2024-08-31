package com.example.beatrice.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.beatrice.R
import com.example.beatrice.resources.darkBlue10
import com.example.beatrice.resources.darkBlue40
import com.example.beatrice.resources.smokeWhite
import com.example.beatrice.resources.smokeWhite50

@Composable
fun GenderComponent(
    modifier: Modifier = Modifier,
    isSelected: Boolean,
    onSelectedChanged: () -> Unit,
    label: String,
    @DrawableRes iconId:  Int
){
    BoxComponent(
        modifier = modifier.clickable(onClick = onSelectedChanged),
        backgroundColor = if (isSelected) darkBlue40 else darkBlue10
    ){
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.sizeIn(
                maxWidth = 180.dp,
                maxHeight = 180.dp,
                minHeight = 180.dp,
                minWidth = 180.dp)
        ) {
            Icon(
                painter = painterResource(iconId),
                contentDescription = null,
                tint = if (isSelected) Color.White else smokeWhite50,
                modifier = Modifier.size(90.dp)
            )
            Spacer(modifier = Modifier.height(2.dp))
           LightTextComponent(
                text = label,
                textColor = if (isSelected) smokeWhite else smokeWhite50,
               fontSize = 20.sp
            )
        }
    }

}

