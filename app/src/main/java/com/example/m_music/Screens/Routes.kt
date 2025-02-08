package com.example.m_music.Screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.PlayArrow
import androidx.compose.material.icons.outlined.Search
import androidx.compose.ui.graphics.vector.ImageVector
import kotlinx.serialization.Serializable

sealed  class Routes{
//    abstract val route: String
//    abstract val title: String
//    abstract val filledIcon: ImageVector
//    abstract val outlinedIcon: ImageVector
    @Serializable
    data object Home:Routes()
//{
//        override val route = "HomeScreen"
//        override val title: String
//            get() = "Home"
//        override val filledIcon: ImageVector
//            get() = Icons.Filled.Home
//        override val outlinedIcon: ImageVector
//            get() = Icons.Outlined.Home
//
//    }

    @Serializable
    data object PlayerScreen: Routes()
//    {
//        override val route = "player"
//        override val title: String
//            get() = "PlayerScreen"
//        override val filledIcon: ImageVector
//            get() = Icons.Filled.PlayArrow
//        override val outlinedIcon: ImageVector
//            get() = Icons.Outlined.PlayArrow
//    }

    @Serializable
    data object Search: Routes()
//    {
//        override val route: String
//            get()  = "SearchScreen"
//        override val title: String
//            get() = "Search"
//        override val filledIcon: ImageVector
//            get() = Icons.Filled.Search
//        override val outlinedIcon: ImageVector
//            get() = Icons.Outlined.Search
//    }




}