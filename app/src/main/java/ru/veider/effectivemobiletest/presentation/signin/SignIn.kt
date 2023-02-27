package ru.veider.effectivemobiletest.presentation.signin

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.*
import androidx.navigation.NavController
import ru.veider.effectivemobiletest.R
import ru.veider.effectivemobiletest.navigation.NavDestination
import ru.veider.effectivemobiletest.presentation.assets.SimpleTextField
import ru.veider.effectivemobiletest.ui.theme.*

@Composable
fun SignIn(navController: NavController) {

    val firstName = rememberSaveable { mutableStateOf("") }
    val lastName = rememberSaveable { mutableStateOf("") }
    val email = rememberSaveable { mutableStateOf("") }

    EffectiveMobileTestTheme {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                stringResource(id = R.string.sign_in),
                modifier = Modifier
                    .padding(top = 125.dp, bottom = 0.dp)
                    .fillMaxWidth(),
                style = montserrat_600_26px,
                textAlign = TextAlign.Center
            )
            SimpleTextField(
                value = firstName.value,
                onValueChange = { firstName.value = it },
                textStyle = montserrat_500_11px,
                singleLine = true,
                modifier = Modifier
                    .padding(top = 40.dp, bottom = 0.dp),
                placeholderText = stringResource(id = R.string.first_name)
            )

            SimpleTextField(
                value = lastName.value,
                onValueChange = { lastName.value = it },
                textStyle = montserrat_500_11px,
                singleLine = true,
                modifier = Modifier
                    .padding(top = 19.dp, bottom = 0.dp),
                placeholderText = stringResource(id = R.string.last_name)
            )

            SimpleTextField(
                value = email.value,
                onValueChange = { email.value = it },
                textStyle = montserrat_500_11px,
                singleLine = true,
                modifier = Modifier
                    .padding(top = 19.dp, bottom = 0.dp),
                placeholderText = stringResource(id = R.string.email)
            )

            Button(
                onClick = {
                          navController.navigate(NavDestination.Login.destination)
                          },
                modifier = Modifier
                    .padding(start = 44.dp, end = 44.dp, top = 35.dp)
                    .fillMaxWidth()
                    .height(46.dp),
                shape = RoundedCornerShape(15.dp)
            ) {
                Text(
                    stringResource(id = R.string.sign_in),
                    style = montserrat_700_14px,
                    color = colorEAEAEA
                )
            }
            Row(
                modifier = Modifier
                    .padding(start = 44.dp, top = 15.dp, end = 44.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    stringResource(id = R.string.have_account),
                    style = montserrat_500_11px,
                    color = color808080
                )
                Text(
                    stringResource(id = R.string.log_in),
                    style = montserrat_500_11px,
                    color = color254FE6,
                    modifier = Modifier
                        .clickable { }
                        .padding(start = 5.dp))
            }
            Sign(
                icon = R.drawable.symbol_google,
                text = R.string.google_sign,
                modifier = Modifier
                    .padding(start = 99.dp, top = 70.dp, end = 44.dp),
                onClick = {}
            )
            Sign(
                icon = R.drawable.symbol_apple,
                text = R.string.apple_sign,
                modifier = Modifier
                    .padding(start = 99.dp, top = 38.dp),
                onClick = {}
            )
        }
    }
}

@Composable
fun Sign(icon: Int, text: Int, modifier: Modifier, onClick: () -> Unit) {
    Row(
        modifier = modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(horizontalArrangement = Arrangement.Start, modifier = Modifier.clickable { onClick() }) {
            Icon(
                painter = painterResource(id = icon),
                contentDescription = "",
                modifier = Modifier.width(25.dp)
            )
            Text(
                text = stringResource(id = text),
                style = montserrat_500_12px,
                color = colorOnSurface,
                modifier = Modifier.padding(start = 11.dp)
            )
        }
    }
}

