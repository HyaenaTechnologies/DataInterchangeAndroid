package dev.DataInterchange.widgets

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import dev.DataInterchange.R
import dev.DataInterchange.theme.titleFontFamily

// Expandable Card Widget: Stateful
@Composable
fun ExpandableCard(
    actionButton: @Composable () -> Unit,
    headerImage: @Composable () -> Unit,
    title: String
) {
    var expandedState: Boolean by rememberSaveable {
        mutableStateOf(false)
    }
    val rotationState: Float by animateFloatAsState(
        targetValue = if (expandedState == true) {
            180f
        } else {
            0f
        }
    )
    Card(
        onClick = {},
        modifier = Modifier
            .animateContentSize(
                animationSpec = tween(
                    durationMillis = 300,
                    easing = LinearOutSlowInEasing
                )
            )
            .fillMaxWidth(),
        shape = RoundedCornerShape(size = 6.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            headerImage()
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    title,
                    fontFamily = titleFontFamily,
                    maxLines = 1,
                    modifier = Modifier.weight(5f),
                    overflow = TextOverflow.Ellipsis,
                    softWrap = true
                )
                IconButton(
                    modifier = Modifier
                        .weight(1f)
                        .rotate(rotationState),
                    onClick = {
                        expandedState = !expandedState
                    }
                ) {
                    Image(
                        contentDescription = "Down Arrow",
                        painter = painterResource(id = R.drawable.down_arrow)
                    )
                }
            }
            if (expandedState == true) {
                actionButton()
            }
        }
    }
}