package com.example.m_music.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
//import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
//import androidx.navigation.NavController
import com.example.m_music.Data.Album
import com.example.m_music.Data.Song
import com.example.m_music.R
import com.example.m_music.Repeated_functionalities.blurBackground

//import com.example.m_music.Screens.albums

@Preview(showSystemUi = true)
@Composable
fun SearchScreen()
//fun SearchScreen(navController: NavController,modifier: Modifier)
{
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
    var searchText by remember { mutableStateOf("") }

    Box(

    ){
        //blur effect fuction
        blurBackground()
        Column {
            OutlinedTextField(value = searchText, onValueChange = {searchText=it}
                , colors = OutlinedTextFieldDefaults.colors(Color.Blue)
                ,label = {"Search Your favorites"}
                , keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
                , singleLine = true
                , placeholder = { Text("Search your favorites here")}
                , leadingIcon = { Icon(Icons.Default.Search, contentDescription = "search here") }
                , shape = RoundedCornerShape(20.dp)
                ,modifier = Modifier
//                .background(Color.White.copy(alpha = .5f))
                .fillMaxWidth()
                .padding(horizontal = 10.dp)
                    .clickable(onClick = { }))

            val result = albumList.filter { it.title.contains(searchText,ignoreCase = true) }
            LazyColumn {
                items(result){
                        album ->
                    ShowAlbumList(album)
                }

            }
//            ShowAlbumList(result);
        }
    }


}

@Composable
fun ShowAlbumList(redAlbum: Album){
    Row(modifier = Modifier.fillMaxWidth()
        .background(Color.Transparent)
        , verticalAlignment = Alignment.Top
        , horizontalArrangement = Arrangement.Start
    ) {
        Card(modifier = Modifier
            .size(150.dp)
            .padding(30.dp)
            , shape = RoundedCornerShape(10.dp)
            ,
        ) {
            Image(painter = painterResource(redAlbum.imageres), contentScale = ContentScale.Crop, contentDescription = redAlbum.title)

        }
            Text(text = redAlbum.title, modifier = Modifier.padding(top =  30.dp))

    }



}
