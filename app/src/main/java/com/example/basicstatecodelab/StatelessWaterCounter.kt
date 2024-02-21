package com.example.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun StatelessWaterCounter(count : Int, onIncrement : () -> Unit, modifier : Modifier =Modifier) {

    Column(modifier = Modifier.padding(16.dp)) {
     if (count > 0) {
            Text(
                text = "You've had $count cups of water today",
                modifier = modifier.padding(16.dp)
            )
        }

        Row(modifier = Modifier.padding(top = 8.dp)) {
            Button(onClick = onIncrement, Modifier.padding(top = 8.dp), enabled = count < 10) {
                Text(text = "Add one")
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun StatelessWaterCounterPreview() {
    StatelessWaterCounter(0, {})
}