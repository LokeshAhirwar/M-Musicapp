package com.example.m_music.Navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposableTarget
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.m_music.Screens.BhaiyaRoutes
import com.example.m_music.Screens.HomeScreen
import com.example.m_music.Screens.PlayerScreen
import com.example.m_music.Screens.Routes
import com.example.m_music.Screens.SearchScreen

@Composable
fun navigation(modifier: Modifier){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Home"){
       composable(route = "Home"){
           HomeScreen(navController)
       }
        composable(route = "Search"){
            SearchScreen(navController)
        }
        composable(route = "PlayerScreen"){
            PlayerScreen(navController)
        }
//        composable<BhaiyaRoutes.Home>{
//            HomeScreen(navController)
//        }
//        composable<BhaiyaRoutes.Search>{
//            SearchScreen(navController)
//        }
//        composable<BhaiyaRoutes.PlayerScreen>{
//            PlayerScreen(navController)
//        }
//
//        composable<Routes.Home>{
//            HomeScreen(navController)
//
//        }
//
//        composable<Routes.PlayerScreen>{
//            PlayerScreen(navController)
//
//        }
//        composable<Routes.Search>{
//            SearchScreen(navController)
//
//        }

    }
}