package com.example.thirdlab

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun TopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(254, 231, 240, 250))
            .size(70.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_baseline_currency_yuan_24),
            modifier = Modifier.size(50.dp, 50.dp),
            contentDescription = ""
        )
        Text(text = "Test Top Bar Text", fontSize = 25.sp, modifier = Modifier.padding(12.dp))
    }


}