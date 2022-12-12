package com.example.thirdlab

sealed class NavHost(val route: String) {
    object FirstFragment: NavHost(route = "firstFragment")


}