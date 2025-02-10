package com.example.m_music.Screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.m_music.Navigation.navigation

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(){
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(state = rememberTopAppBarState())
    val navController = rememberNavController()
    Scaffold(modifier = Modifier.fillMaxSize(),
        topBar = {
            TopBar(modifier = Modifier,
                scrollBehavior= scrollBehavior
                ,navController)
                 }
        ,
        bottomBar = {  Bottombar(navController)  }) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)){
//            navigation(modifier = Modifier)
                    HomeScreen(navController)
        }

    }
}