package ru.veider.effectivemobiletest.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ru.veider.effectivemobiletest.presentation.favorite.Favorite
import ru.veider.effectivemobiletest.presentation.item.Item
import ru.veider.effectivemobiletest.presentation.login.Login
import ru.veider.effectivemobiletest.presentation.mainscreen.MainScreen
import ru.veider.effectivemobiletest.presentation.message.Message
import ru.veider.effectivemobiletest.presentation.profile.Profile
import ru.veider.effectivemobiletest.presentation.signin.SignIn

@Composable
fun NavController(navController: NavHostController, startDestination: String) {
    NavHost(navController, startDestination = startDestination) {
        composable(NavDestination.MainScreen.destination) {
            MainScreen(navController = navController)
        }
        composable(NavDestination.SignIn.destination){
            SignIn(navController = navController)
        }
        composable(NavDestination.Profile.destination){
            Profile(navController = navController)
        }
        composable(NavDestination.Item.destination){
            Item(navController = navController)
        }
        composable(NavDestination.Login.destination){
            Login(navController = navController)
        }
        composable(NavDestination.Favorite.destination){
            Favorite(navController = navController)
        }
        composable(NavDestination.Message.destination){
            Message(navController = navController)
        }
    }
}