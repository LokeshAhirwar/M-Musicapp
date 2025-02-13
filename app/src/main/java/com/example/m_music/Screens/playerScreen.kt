package com.example.m_music.Screens

import android.graphics.Color.alpha
import android.provider.CalendarContract.Colors
import androidx.compose.animation.VectorConverter
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material.icons.twotone.FavoriteBorder
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import androidx.navigation.NavController
import com.example.m_music.R
import com.example.m_music.Repeated_functionalities.blurBackground
import com.example.m_music.ui.theme.primaryLight


@Composable
//@Preview(showSystemUi = true)
fun PlayerScreen(navController: NavController,modifier: Modifier){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.linearGradient(
                    colors = listOf(
                        Color(0xFFB3E5FC).copy(alpha = 0.8f), // Light Blue
                        Color(0xFFCE93D8).copy(alpha = 0.8f)  // Light Purple
                    )
                )
            )
            .blur(30.dp) // Blur effect for glass look
            .zIndex(-1f)
    )
//    {
//        Image(painter = painterResource(R.drawable.bgphoto), contentDescription = null)
//    }
    Box(modifier = Modifier.fillMaxSize()){
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)

        ) {
            Card( //music card
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(40.dp)
                    .weight(2f)
                , shape = RoundedCornerShape(40.dp)
            ) {
                Image(painter = painterResource(R.drawable.bgphoto)
                    , contentDescription = null
                    , contentScale = ContentScale.Crop)

            }


            Row(modifier = Modifier.weight(1f)
                .padding(start = 20.dp, end = 20.dp)) {
                Column(modifier = Modifier.weight(1f) ) {
                    Text("Song Title", fontWeight = FontWeight.Bold , fontSize = 20.sp)
                    Text("singer")

                }
                Row(){
                    Icon(imageVector = Icons.Default.Add, contentDescription = null)
                    Spacer(modifier = Modifier.width(5.dp))
                    Icon(imageVector = Icons.TwoTone.FavoriteBorder, contentDescription = null)
                }

            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .weight(1f)
                , verticalAlignment = Alignment.CenterVertically
            , horizontalArrangement = Arrangement.SpaceAround) {
                Card(shape = CircleShape, border = BorderStroke(2.dp,Color.Black)
                , colors = CardDefaults.cardColors(Color.Transparent)) {
                    IconButton(onClick = { }) {
                        Icon(painter = painterResource(R.drawable.suffle_svg_icon),contentDescription = null
                            , modifier = Modifier.size(40.dp))
                    }
                }
               Card(shape = CircleShape,border = BorderStroke(2.dp,Color.Black)
                   , colors = CardDefaults.cardColors(Color.Transparent)) {
                   IconButton(onClick = { }) {
                       Icon(imageVector = Icons.Default.KeyboardArrowLeft,contentDescription = null
                           , modifier = Modifier.size(40.dp))
                   }
               }

                Card(shape = CircleShape,border = BorderStroke(2.dp,Color.Black)
                    , colors = CardDefaults.cardColors(Color.Transparent),modifier = Modifier.size(100.dp)) {
                    Box(modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center){
                        IconButton(onClick = { }) {
                            Icon(painter = painterResource(R.drawable.play_rounded),contentDescription = "payer button",modifier= Modifier.size(100.dp)
                            )
                        }
                    }

                }
                Card(shape = CircleShape,border = BorderStroke(2.dp,Color.Black)
                    , colors = CardDefaults.cardColors(Color.Transparent)) {
                    IconButton(onClick = { }) {
                        Icon(imageVector = Icons.Default.KeyboardArrowRight,contentDescription = null
                            , modifier = Modifier.size(40.dp))
                    }
                }
                Card(shape = CircleShape,border = BorderStroke(2.dp,Color.Black)
                    , colors = CardDefaults.cardColors(Color.Transparent)) {
                    IconButton(onClick = { }) {
                        Icon(imageVector = Icons.Default.FavoriteBorder,contentDescription = null
                            , modifier = Modifier.size(40.dp))
                    }
                }







            }


        }


    }

}
