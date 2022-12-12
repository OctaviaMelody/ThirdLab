package com.example.thirdlab

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = NavHost.FirstFragment.route) {
        composable(route = NavHost.FirstFragment.route) {
            FirstFragment(navController)
        }
    }

}