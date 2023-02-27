package ru.veider.effectivemobiletest.presentation.login

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import ru.veider.effectivemobiletest.R
import ru.veider.effectivemobiletest.navigation.NavDestination
import ru.veider.effectivemobiletest.presentation.assets.SimpleTextField
import ru.veider.effectivemobiletest.ui.theme.*

@Composable
fun Login(navController: NavController) {
    val login = rememberSaveable { mutableStateOf("") }
    val password = rememberSaveable { mutableStateOf("") }
    val eyeOn = rememberSaveable { mutableStateOf(false) }

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
                value = login.value,
                onValueChange = { login.value = it },
                textStyle = montserrat_500_11px,
                singleLine = true,
                modifier = Modifier
                    .padding(top = 40.dp, bottom = 0.dp),
                placeholderText = stringResource(id = R.string.first_name)
            )

            SimpleTextField(
                value = password.value,
                onValueChange = { password.value = it },
                textStyle = montserrat_500_11px,
                trailingIcon = {
                    when (eyeOn.value) {
                        false -> Icon(painterResource(id = R.drawable.eye_on), "", modifier = Modifier.clickable { eyeOn.value = true })
                        true -> Icon(painterResource(id = R.drawable.eye_off), "", modifier = Modifier.clickable { eyeOn.value = false })
                    }
                },
                singleLine = true,
                modifier = Modifier
                    .padding(top = 19.dp, bottom = 0.dp),
                placeholderText = stringResource(id = R.string.password),
                visualTransformation = when (eyeOn.value) {
                    false -> PasswordVisualTransformation()
                    true -> VisualTransformation.None
                }
            )

            Button(
                onClick = {
                          navController.navigate(NavDestination.MainScreen.destination)
                          },
                modifier = Modifier
                    .padding(start = 44.dp, end = 44.dp, top = 102.dp)
                    .fillMaxWidth()
                    .height(46.dp),
                shape = RoundedCornerShape(15.dp)
            ) {
                Text(
                    stringResource(id = R.string.login),
                    style = montserrat_700_14px,
                    color = colorEAEAEA
                )
            }
        }
    }
}