package com.example.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun StatefulWaterCounter(modifier : Modifier =Modifier) {
    var count by rememberSaveable {
        mutableStateOf(0)
    }
    StatelessWaterCounter(count = count, onIncrement = { count++ }, modifier = modifier)
}

@Preview(showBackground = true)
@Composable
fun StatefulWaterCounterWaterCounterPreview() {
    StatefulWaterCounter()
}