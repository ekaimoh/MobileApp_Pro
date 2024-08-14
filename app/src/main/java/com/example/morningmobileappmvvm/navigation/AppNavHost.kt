package com.example.morningmobileappmvvm.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.morningmobileappmvvm.ui.theme.screens.client.AddClient
import com.example.morningmobileappmvvm.ui.theme.screens.client.UpdateClient
import com.example.morningmobileappmvvm.ui.theme.screens.home.HomeScreen
import com.example.morningmobileappmvvm.ui.theme.screens.home.HomeScreensPreview
import com.example.morningmobileappmvvm.ui.theme.screens.login.Login
import com.example.morningmobileappmvvm.ui.theme.screens.register.Greeting

@Composable
fun AppNavHost(navController:NavHostController= rememberNavController(),
){


    NavHost(navController =navController, startDestination = "" ){
    composable(ROUTE_REGISTER){ Greeting(name = "Adebah", navController )}
    composable(ROUTE_HOME){ HomeScreen(navController )}
    composable(ROUTE_LOGIN){ Login(navController )}
    composable(ROUTE_ADD_CLIENT){ AddClient(navController)}
    composable(ROUTE_UPDATE_CLIENT){ UpdateClient(navController)}

}

}