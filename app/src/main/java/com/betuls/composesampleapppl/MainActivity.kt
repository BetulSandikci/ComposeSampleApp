package com.betuls.composesampleapppl

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Row(
                modifier = Modifier
                    .width(300.dp)
                    .fillMaxHeight(0.7f)
                    .background(Color.Yellow),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Text("Hello")
                Text("World")
                Text("Hello")
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Row(
        modifier = Modifier
            .width(300.dp)
            .fillMaxHeight(0.7f)
            .background(Color.Yellow),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Text("Hello")
        Text("World")
        Text("Hello")
    }
}