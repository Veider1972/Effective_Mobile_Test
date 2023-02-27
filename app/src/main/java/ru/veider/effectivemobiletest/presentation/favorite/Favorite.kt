package ru.veider.effectivemobiletest.presentation.favorite

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import ru.veider.effectivemobiletest.presentation.common.BottomBar
import ru.veider.effectivemobiletest.ui.theme.EffectiveMobileTestTheme
import ru.veider.effectivemobiletest.ui.theme.colorSurface

@Composable
fun Favorite(navController: NavController) {
    EffectiveMobileTestTheme {
        Scaffold(
            bottomBar = { BottomBar(navController, 2) }
        ){
            Column(modifier = Modifier.padding(it).background(color = colorSurface)) {

            }
        }
    }
}