package com.example.m_music.Data

import android.media.Image
import com.example.m_music.R
import androidx.compose.foundation.layout.Row

data class Album(
    val title: String,
    val imageres: Int,
    val songs:List<Song>
)