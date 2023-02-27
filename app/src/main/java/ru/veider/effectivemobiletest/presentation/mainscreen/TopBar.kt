package ru.veider.effectivemobiletest.presentation.mainscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import ru.veider.effectivemobiletest.R
import ru.veider.effectivemobiletest.ui.theme.*

@Composable
fun TopBar(navController: NavController) {
    TopAppBar(
        backgroundColor = colorSurface,
        elevation = 0.dp,
        contentPadding = PaddingValues(top = 20.dp)
    ) {
        Icon(
            painterResource(id = R.drawable.topbar_menu),
            "",
            modifier = Modifier.padding(start = 15.dp, bottom = 17.dp),
            tint = colorOnSurface
        )
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(start = 25.dp, bottom = 17.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row() {
                Text(
                    stringResource(id = R.string.trade_by),
                    style = montserrat_700_20px,
                    color = colorOnSurface
                )
                Text(
                    " ${stringResource(id = R.string.bata)}",
                    style = montserrat_700_20px,
                    color = color4E55D7
                )
            }
        }
        Column(
            modifier = Modifier.padding(end = 37.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.user_photo),
                contentDescription = "",
                modifier = Modifier
                    .clip(CircleShape)
                    .size(31.dp)
                    .border(width = 1.dp, color = color4E4D4D, shape = CircleShape)
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(top = 8.dp)
            ) {
                Text("${stringResource(id = R.string.Location)} ", style = montserrat_400_10px)
                Image(painter = painterResource(id = R.drawable.location), contentDescription = "")
            }
        }
    }
}