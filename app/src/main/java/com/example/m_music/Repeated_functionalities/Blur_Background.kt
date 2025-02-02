package com.example.m_music.Repeated_functionalities

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex

@Composable
fun blurBackground(list: List<Color>){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Brush.verticalGradient(colors = list))
        .blur(10.dp)
        .zIndex(-1f)){


    }

}