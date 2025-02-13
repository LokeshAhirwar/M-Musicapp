package com.example.m_music.Repeated_functionalities

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.example.m_music.R

@Composable
//fun blurBackground(list: List<Color>)
fun blurBackground()
{
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black)
//        .background(Brush.verticalGradient(colors = list))
        .blur(10.dp, edgeTreatment = BlurredEdgeTreatment.Rectangle)
        .zIndex(-1f)
    ){
        Image(painter = painterResource(R.drawable.search_screen_bg), contentScale = ContentScale.Crop, contentDescription = null)

    }

}