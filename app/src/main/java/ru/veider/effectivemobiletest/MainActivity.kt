package ru.veider.effectivemobiletest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import ru.veider.effectivemobiletest.navigation.NavController
import ru.veider.effectivemobiletest.navigation.NavDestination
import ru.veider.effectivemobiletest.ui.theme.EffectiveMobileTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            EffectiveMobileTestTheme {
                NavController(navController = navController, startDestination = NavDestination.SignIn.destination)
            }
        }
    }
}