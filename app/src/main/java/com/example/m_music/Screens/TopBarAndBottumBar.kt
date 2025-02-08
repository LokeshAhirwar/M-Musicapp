package com.example.m_music.Screens

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.KeyboardArrowDown
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.m_music.Data.BottomNavigationItems
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
    modifier: Modifier,
    scrollBehavior: TopAppBarScrollBehavior,
    navController: NavController
){
    TopAppBar(
        modifier = Modifier ,
        scrollBehavior = scrollBehavior,
//        colors = TopAppBarDefaults.topAppBarColors(
//            containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(0.6f)
//        )
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.0f)
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
fun Bottombar( navController: NavController){
//    val lONavigationItems = listOf(
//        Routes.Home,
//        Routes.Search,
//        Routes.PlayerScreen
//    )
    var selectedIndex by remember { mutableStateOf(0) }
    val lONavigationItems = listOf(
        BottomNavigationItems(
            title =  "Home",
            filledIcon = Icons.Filled.Home,
            outlinedIcon = Icons.Outlined.Home,
            route = "Home"


        ),
        BottomNavigationItems(
            title = "Explore",
            filledIcon = Icons.Filled.Search,
            outlinedIcon = Icons.Outlined.Search,
            route = "Search"
        ),
        BottomNavigationItems(
            title = "Downloads",
            filledIcon = Icons.Filled.KeyboardArrowDown,
            outlinedIcon = Icons.Outlined.KeyboardArrowDown,
            route = "PlayerScreen"
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
        containerColor = Color.Transparent
    ) {
        NavigationBar {
            lONavigationItems.forEachIndexed { index,item ->
                NavigationBarItem(selected = selectedIndex==index,
                    onClick = {
                        selectedIndex = index
                        navController.navigate(item.route)
//                        {
//                            launchSingleTop = true
//                            restoreState = true
//                        }
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