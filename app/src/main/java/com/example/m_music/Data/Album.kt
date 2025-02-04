package com.example.m_music.Data

import android.media.Image
import com.example.m_music.R
import androidx.compose.foundation.layout.Row

data class Album(
    val id:Int,
    val title: String,
    val Aimage: Image = R.drawable.album_image1,
    val songs:List<Song>
)