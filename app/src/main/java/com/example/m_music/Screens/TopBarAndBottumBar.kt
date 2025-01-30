package com.example.m_music.Screens

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
    modifier: Modifier,
    scrollBehavior: TopAppBarScrollBehavior
){
    TopAppBar(
        modifier = Modifier ,
        scrollBehavior = scrollBehavior,
//        colors = TopAppBarDefaults.topAppBarColors(
//            containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(0.6f)
//        )
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.background
        ),
        title = {Text("M-Music",
            color = MaterialTheme.colorScheme.onBackground.copy(0.7f) )},
        navigationIcon = {
            Icon(
                imageVector = Icons.Rounded.Menu,
                contentDescription = "this is the navigation Icon",
                modifier = Modifier.padding(end = 10.dp)
            )
        },
        actions = {
            Icon(
                imageVector = Icons.Rounded.Search,
                contentDescription = "this is a account Icon"
            )
            Spacer(modifier = Modifier.width(10.dp))
            Icon(
                imageVector = Icons.Default.AccountCircle,
                contentDescription = "this is a account Icon"
            )

        }




    )
}
@Composable
fun Bottom(){
    BottomAppBar {
        NavigationBar {

        }

    }
}