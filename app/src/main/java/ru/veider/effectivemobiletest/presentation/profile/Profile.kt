package ru.veider.effectivemobiletest.presentation.profile

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import ru.veider.effectivemobiletest.R
import ru.veider.effectivemobiletest.presentation.common.BottomBar
import ru.veider.effectivemobiletest.ui.theme.*

data class ProfileData(
    val photo: Int = R.drawable.user_photo,
    val name: String = "Satria Adhi Pradana",
    val balance: String = "$ 1593"
)

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Profile(navController: NavController) {

    val profile = remember { ProfileData() }

    EffectiveMobileTestTheme {
        Scaffold(
            bottomBar = { BottomBar(navController, 4) }
        ) {
            Scaffold(modifier = Modifier.padding(0.dp),
                content = {
                    Column(
                        modifier = Modifier
                            .padding(it)
                            .fillMaxSize()
                            .background(color = colorFAF9FF),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Box(modifier = Modifier.fillMaxWidth()) {
                            Image(
                                painter = painterResource(id = R.drawable.profile_back),
                                contentDescription = "",
                                modifier = Modifier
                                    .align(
                                        Alignment.CenterStart
                                    )
                                    .padding(top = 31.dp, start = 20.dp)
                                    .clickable {
                                        // TODO()
                                    }
                            )
                            Text(
                                text = stringResource(id = R.string.profile),
                                style = montserrat_700_15px,
                                color = Color.Black,
                                modifier = Modifier
                                    .padding(top = 33.dp)
                                    .align(Alignment.TopCenter)
                            )
                        }
                        Image(
                            painterResource(id = profile.photo),
                            "",
                            modifier = Modifier
                                .padding(top = 19.dp)
                                .size(61.06.dp)
                                .clip(
                                    CircleShape
                                )
                                .border(1.dp, colorC0C0C0)
                        )
                        Text(
                            text = stringResource(id = R.string.profile),
                            style = montserrat_500_8px,
                            color = color808080,
                            modifier = Modifier
                                .padding(top = 5.94.dp)
                                .clickable {
                                    // TODO()
                                }
                        )
                        Text(
                            text = profile.name,
                            style = montserrat_700_15px,
                            color = color3F3F3F,
                            modifier = Modifier
                                .padding(top = 17.dp)
                        )
                        Button(
                            onClick = {
                                // TODO()
                            },
                            modifier = Modifier
                                .padding(start = 43.dp, end = 42.dp, top = 36.dp)
                                .fillMaxWidth()
                                .height(40.dp),
                            shape = RoundedCornerShape(15.dp)
                        ) {
                            Box(
                                contentAlignment = Alignment.Center,
                                modifier = Modifier.fillMaxSize()
                            ) {
                                Text(
                                    stringResource(id = R.string.upload_item),
                                    style = montserrat_600_14px,
                                    color = colorEAEAEA
                                )
                                Image(
                                    painter = painterResource(id = R.drawable.profile_upload),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .align(Alignment.CenterStart)
                                        .padding(start = 40.dp)
                                )
                            }
                        }
                        ProfileLine(
                            R.drawable.profile_payment, R.string.trade_store,
                            lastElement = {
                                Image(
                                    painterResource(id = R.drawable.profile_move),
                                    ""
                                )
                            },
                            modifier = Modifier.padding(top = 14.dp),
                            onClick = {
                                // TODO()
                            }
                        )
                        ProfileLine(
                            R.drawable.profile_payment, R.string.payment_method,
                            lastElement = {
                                Image(
                                    painterResource(id = R.drawable.profile_move),
                                    ""
                                )
                            },
                            modifier = Modifier.padding(top = 25.dp),
                            onClick = {
                                // TODO()
                            }
                        )
                        ProfileLine(
                            R.drawable.profile_payment, R.string.balance,
                            lastElement = {
                                Text(
                                    profile.balance,
                                    style = montserrat_500_14px,
                                    color = color040402
                                )
                            },
                            modifier = Modifier.padding(top = 25.dp),
                            onClick = {
                                // TODO()
                            }
                        )
                        ProfileLine(
                            R.drawable.profile_payment, R.string.trade_history,
                            lastElement = {
                                Image(
                                    painterResource(id = R.drawable.profile_move),
                                    ""
                                )
                            },
                            modifier = Modifier.padding(top = 25.dp),
                            onClick = {
                                // TODO()
                            }
                        )
                        ProfileLine(
                            R.drawable.profile_recycler, R.string.restore_purchase,
                            lastElement = {
                                Image(
                                    painterResource(id = R.drawable.profile_move),
                                    ""
                                )
                            },
                            modifier = Modifier.padding(top = 20.dp),
                            onClick = {
                                // TODO()
                            }
                        )
                        ProfileLine(
                            R.drawable.profile_help, R.string.help,
                            lastElement = {},
                            modifier = Modifier.padding(top = 20.dp),
                            onClick = {
                                // TODO()
                            }
                        )
                        ProfileLine(
                            R.drawable.profile_logout, R.string.log_out,
                            lastElement = {},
                            modifier = Modifier.padding(top = 20.dp),
                            onClick = {
                                // TODO()
                            }
                        )
                    }
                })
        }
    }
}

@Composable
fun ProfileLine(icon: Int, text: Int, lastElement: @Composable () -> Unit, modifier: Modifier, onClick: ()->Unit) {
    Row(modifier = modifier.padding(start = 32.dp, end = 45.5.dp).clickable { onClick() }, verticalAlignment = Alignment.CenterVertically) {
        Image(painterResource(id = icon), "", modifier = Modifier.padding(end = 3.dp))
        Text(
            stringResource(id = text),
            style = montserrat_500_14px,
            color = color040402,
            modifier = Modifier.weight(1f)
        )
        lastElement()
    }
}