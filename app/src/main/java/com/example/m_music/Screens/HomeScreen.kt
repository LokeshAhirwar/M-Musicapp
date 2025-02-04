package com.example.m_music.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.example.m_music.R

//@Preview(showSystemUi = true)
@Composable
fun HomeScreen(modifier: Modifier){

    Box(
        modifier= Modifier
        .fillMaxSize()
    , contentAlignment = Alignment.Center){

//        Box(modifier = Modifier
//            .fillMaxSize()
////            .background(Color.Green.copy(alpha = .2f)
//            .background(
//                Brush.verticalGradient( colors = listOf(
//                    Color.Black.copy(alpha = .2f),
//                    Color.Black.copy(alpha = .6f)
//                ))
//            ))
//            .blur(20.dp)
//            .zIndex(-1f)){
//            Image(painter = painterResource(R.drawable.home_page), contentDescription = null,
//                contentScale = ContentScale.Crop,
//                modifier = Modifier.fillMaxSize()
//                    .blur(20.dp))
//        }
        Box(modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient( colors = listOf(
                    Color.Blue.copy(alpha = .5f),
                    Color.Black.copy(alpha = .1f)
                ))
            )
            .clip(RoundedCornerShape(16.dp))
            .blur(20.dp)
        )

        Text("this is home screen")
    }

}