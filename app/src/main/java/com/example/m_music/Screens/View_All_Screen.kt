package com.example.m_music.Screens

//import android.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.RichTooltip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
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
        albumRow()


        }


}

@Composable
fun albumRow(){
    val albumList = listOf(
        Album( title = "first song", imageres = R.drawable.album_image1, songs = emptyList()),
        Album( title = "second song", imageres = R.drawable.album_image2, songs = emptyList()),
        Album( title = "third song", imageres = R.drawable.album_image3, songs = emptyList()),
        Album( title = "fourth song", imageres = R.drawable.album_image4, songs = emptyList()),
        Album( title = "fifth song", imageres = R.drawable.album_image5, songs = emptyList())
    )
    LazyRow(modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp)
        .height(200.dp)) {
        items(albumList){ album ->
            Card(
                modifier = Modifier
                    .padding(10.dp)
                    .height(150.dp)
                    .width(150.dp)
            , shape = RoundedCornerShape(20.dp)
            ) {
                Text(album.title
                , modifier = Modifier
                        .weight(1f))
                Image(painter = painterResource(album.imageres), contentScale = ContentScale.Crop, contentDescription = null
                , modifier = Modifier
                        .weight(5f))

            }

        }
    }
}