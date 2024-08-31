package com.example.beatrice.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.beatrice.resources.darkBlue70
import com.example.beatrice.resources.pink

@Composable
fun ButtonComponent(
    modifier: Modifier = Modifier,
    onClicked: () -> Unit,
    label: String
) {
    Button(
        modifier = modifier,
        onClick = onClicked,
        shape = RectangleShape,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = pink
        )
    ) {
        Text(label,
            style = TextStyle(
                color = Color.White,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )
        )
    }
}

@Composable
fun CircleButtonComponent(
    modifier: Modifier = Modifier,
    onClicked: () -> Unit,
    @DrawableRes iconId: Int
) {
    TextButton(
        modifier = modifier,
        onClick = onClicked,
        shape = CircleShape,
        colors = ButtonDefaults.textButtonColors(
            backgroundColor = darkBlue70
        )
    ) {
        Icon(
            painter = painterResource(iconId),
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier.size(40.dp)
        )
    }
}