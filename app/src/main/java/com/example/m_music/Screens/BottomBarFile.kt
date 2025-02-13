package com.example.m_music.Screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.KeyboardArrowDown
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.example.m_music.Data.BottomNavigationItems
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
@Composable
fun Bottombar( navController: NavController){
//    val lONavigationItems = listOf(
//        Routes.Home,
//        Routes.Search,
//        Routes.PlayerScreen
//    )
    var selectedIndex by remember { mutableStateOf(0) }
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currenRoute = navBackStackEntry?.destination?.route
    val lONavigationItems = listOf(
        BottomNavigationItems(
            title =  "Home",
            filledIcon = Icons.Filled.Home,
            outlinedIcon = Icons.Outlined.Home,
            route = Routes.Home.routes


        ),
        BottomNavigationItems(
            title = "Explore",
            filledIcon = Icons.Filled.Search,
            outlinedIcon = Icons.Outlined.Search,
            route = Routes.Search.routes
        ),
        BottomNavigationItems(
            title = "Downloads",
            filledIcon = Icons.Filled.KeyboardArrowDown,
            outlinedIcon = Icons.Outlined.KeyboardArrowDown,
            route = Routes.PlayScreen.routes
        )
//        BottomNavigationItems(
//            title = "Local Library",
//            filledIcon = Icons.Filled.Face,
//            outlinedIcon = Icons.Outlined.Face,
//            route = "Explore"
//        )
    )
    BottomAppBar(
        modifier = Modifier,
        containerColor = BottomAppBarDefaults.containerColor.copy(0f)
    ) {
        NavigationBar {
            lONavigationItems.forEachIndexed { index,item ->
                NavigationBarItem(selected = selectedIndex==index,
                    onClick = {
                        selectedIndex = index
                        navController.navigate(item.route)
                        {
                            popUpTo(navController.graph.startDestinationId){
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    },
                    icon =  {
                        Icon(imageVector = if (selectedIndex == index) item.filledIcon else item.outlinedIcon,
                            contentDescription = item.title)
                            }
                    ,
                    label = { Text(text =item.title)})

            }


        }

    }
}