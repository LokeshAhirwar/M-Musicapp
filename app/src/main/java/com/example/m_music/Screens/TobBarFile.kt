package com.example.m_music.Screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
    modifier: Modifier,
    scrollBehavior: TopAppBarScrollBehavior,
    navController: NavController
){
    TopAppBar(
        modifier = Modifier.shadow(0.dp) ,
        scrollBehavior = scrollBehavior,
//        colors = TopAppBarDefaults.topAppBarColors(
//            containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(0.6f)
//        )
        title = {Text("M-Music",
            color = MaterialTheme.colorScheme.onBackground.copy(0.7f) )},
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Transparent
        ),


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
                contentDescription = "this is a account Icon",
                modifier = Modifier.clickable(onClick = { })
            )
            Spacer(modifier = Modifier.width(10.dp))
            Icon(
                imageVector = Icons.Default.AccountCircle,
                contentDescription = "this is a account Icon",
                modifier = Modifier.clickable(onClick = { })
            )

        }
    )
}