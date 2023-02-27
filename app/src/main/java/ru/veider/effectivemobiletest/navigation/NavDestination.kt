package ru.veider.effectivemobiletest.navigation

sealed class NavDestination(val destination: String){
    object SignIn: NavDestination("signIn")
    object Login: NavDestination("login")
    object MainScreen: NavDestination("mainScreen")
    object Item: NavDestination("Item")
    object Profile: NavDestination("Profile")
    object Message: NavDestination("Message")
    object Favorite: NavDestination("Favorite")
}