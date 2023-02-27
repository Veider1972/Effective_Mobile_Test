package ru.veider.effectivemobiletest.presentation.common

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import ru.veider.effectivemobiletest.R
import ru.veider.effectivemobiletest.navigation.NavDestination
import ru.veider.effectivemobiletest.ui.theme.color737297
import ru.veider.effectivemobiletest.ui.theme.color909090
import ru.veider.effectivemobiletest.ui.theme.colorEEEFF4

@Composable
fun BottomBar(navController: NavController, selectedItem: Int) {

    BottomNavigation(modifier = Modifier
        .height(73.dp)
        .graphicsLayer {
            shape = RoundedCornerShape(topStart = 25.dp, topEnd = 25.dp)
            clip = true
        }, backgroundColor = Color.White) {
        BottomNavigationItem(
            icon = { Item(R.drawable.menu_home, selectedItem == 1) },
            selected = (selectedItem == 1), onClick = {
                navController.navigate(NavDestination.MainScreen.destination)
            })
        BottomNavigationItem(
            icon = { Item(R.drawable.menu_favorite, selectedItem == 2) },
            selected = (selectedItem == 2), onClick = {
                navController.navigate(NavDestination.Favorite.destination)
            })
        BottomNavigationItem(
            icon = { Item(R.drawable.menu_message, selectedItem == 3) },
            selected = (selectedItem == 3), onClick = {
                navController.navigate(NavDestination.Message.destination)
            })
        BottomNavigationItem(
            icon = { Item(R.drawable.menu_profile, selectedItem == 4) },
            selected = (selectedItem == 4), onClick = {
                navController.navigate(NavDestination.Profile.destination)
            })
    }
}

@Composable
fun Item(icon: Int, selected: Boolean) {
    Box(contentAlignment = Alignment.Center) {
        if (selected)
            Icon(painterResource(id = R.drawable.menu_background), "", tint = colorEEEFF4)
        Icon(
            painterResource(id = icon),
            "",
            tint = if (selected) color737297 else color909090
        )
    }
}