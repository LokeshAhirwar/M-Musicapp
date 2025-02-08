package com.example.m_music.Screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.m_music.Data.Album
import com.example.m_music.Data.Song
import com.example.m_music.R
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.navigation.NavController

//@Preview(showSystemUi = true)
@Composable
fun HomeScreen(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(10.dp)) {
        albumRow()



        }


}
@Composable
fun albumRow(){
    var SelectedSongs by remember { mutableStateOf(albums.first().songs) }

    val albumList = listOf(
        Album( title = "first Alnum", imageres = R.drawable.album_image1, songs = listOf(
            Song("tittle 1","artist 1",R.drawable.s1),
            Song("tittle 2","artist 2",R.drawable.s1)
        )
        ),
        Album( title = "second Alnum", imageres = R.drawable.album_image2, songs = listOf(
            Song("tittle 1","artist 1",R.drawable.s2),
            Song("tittle 2","artist 2",R.drawable.s2)
        )),
        Album( title = "third Alnum", imageres = R.drawable.album_image3, songs = listOf(
            Song("tittle 1","artist 1",R.drawable.s3),
            Song("tittle 2","artist 2",R.drawable.s3)
        )),
        Album( title = "fourth Alnum", imageres = R.drawable.album_image4, songs = listOf(
            Song("tittle 1","artist 1",R.drawable.s4),
            Song("tittle 1","artist 2",R.drawable.s4)
        )),
        Album( title = "fifth Alnum", imageres = R.drawable.album_image5, songs = listOf(
            Song("tittle 1","artist 1",R.drawable.s5),
            Song("tittle 1","artist 2",R.drawable.s5)
        ))
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
                    .clickable(onClick = {
                        SelectedSongs = album.songs
                    })
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
    LazyColumn {
        items(SelectedSongs){
            song ->
                Card(modifier = Modifier
                    .size(150.dp)
                    , shape = RoundedCornerShape(20.dp)
                , elevation = CardDefaults.cardElevation(10.dp)) {
                    Text(song.title)
                    Text(song.artist)
                    Image(painter = painterResource(song.scover), contentScale = ContentScale.Crop, contentDescription = song.title)
                }
        }
    }
}