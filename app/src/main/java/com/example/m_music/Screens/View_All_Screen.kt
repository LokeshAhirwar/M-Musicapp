package com.example.m_music.Screens

import android.R
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.RichTooltip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.m_music.Data.Album
import com.example.m_music.R

@Preview(showSystemUi = true)
@Composable
fun ViewAllScreen(){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(10.dp)) {
        LazyRow {

        }

    }
}

@Composable
fun albumRow(){
    val albumList = listOf(
        Album(id =  1, title = "album 1", Aimage = R.drawable.)
    )
}