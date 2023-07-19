package com.example.composableaccess.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.composableaccess.R

@Composable
fun Greeting() {
    Box(modifier = Modifier.fillMaxSize()){
        Image(painter = painterResource(id = R.drawable.bicycle),contentDescription ="bicycle", modifier = Modifier
            .height(90.dp)
            .absoluteOffset(x = 10.dp, y = 10.dp))

    }

}