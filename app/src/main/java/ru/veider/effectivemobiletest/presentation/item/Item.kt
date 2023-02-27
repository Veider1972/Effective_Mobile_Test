package ru.veider.effectivemobiletest.presentation.item

import android.annotation.SuppressLint
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import ru.veider.effectivemobiletest.R
import ru.veider.effectivemobiletest.navigation.NavDestination
import ru.veider.effectivemobiletest.presentation.common.BottomBar
import ru.veider.effectivemobiletest.ui.theme.*

enum class Colors {
    WHITE, GRAY, BLACK
}

data class ItemData(
    val image: List<Int> = listOf(
        R.drawable.item_1_1,
        R.drawable.item_1_2,
        R.drawable.item_1_3
    ),
    val priceText: String = "New balance\nSneakers",
    val price: String = "$ 22,50",
    val desc: String = "Features waterproof, fire, air resistant shoes. all\nchanged when the country of fire attacked",
    val starCount: String = "3.9",
    val reviews: String = "(4000 reviews)",
    val colors: List<Colors> = listOf(Colors.WHITE, Colors.GRAY, Colors.BLACK),
    val buttonText: String = "#2,500"
)

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Item(navController: NavController) {
    val preview = rememberSaveable { mutableStateOf(1) }

    val scaffoldState = rememberScaffoldState()

    val item = remember { ItemData() }

    val context = LocalContext.current

    val bigImageWidth = rememberSaveable { 328 / 375f }
    val aspectImage = rememberSaveable { 328 / 279f }
    val smallUnselectedWidth = rememberSaveable { 66 }
    val smallUnselectedHeight = rememberSaveable { smallUnselectedWidth * 38 / 66 }
    val smallSelectedWidth = rememberSaveable { 83 }
    val smallSelectedHeight = rememberSaveable { smallSelectedWidth * 45 / 83 }
    val backTop =
        rememberSaveable { (context.resources.configuration.screenHeightDp * 0.0788) - 30 }
    val backLeft = rememberSaveable { context.resources.configuration.screenWidthDp * 0.0293 }

    EffectiveMobileTestTheme {
        Scaffold(
            scaffoldState = scaffoldState,
            bottomBar = { BottomBar(navController, 1) }
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
                        Box(
                            modifier = Modifier
                                .padding(top = 40.dp)
                                .fillMaxWidth(bigImageWidth)
                                .aspectRatio(aspectImage)
                                .clip(
                                    RoundedCornerShape(9.dp)
                                )
                        ) {
                            Image(
                                painterResource(id = item.image[preview.value]),
                                "",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillWidth
                            )
                        }
                        Row(
                            modifier = Modifier.padding(top = 35.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            PreviewImage(
                                rowScope = this,
                                image = painterResource(id = item.image[0]),
                                modifier = Modifier
                                    .padding(2.dp)
                                    .width(if (preview.value == 0) smallSelectedWidth.dp else smallUnselectedWidth.dp)
                                    .height(if (preview.value == 0) smallSelectedHeight.dp else smallUnselectedHeight.dp),
                                elevation = if (preview.value == 0) 10.dp else 0.dp,
                                onClick = {
                                    preview.value = 0
                                })
                            PreviewImage(
                                rowScope = this,
                                image = painterResource(id = item.image[1]),
                                modifier = Modifier
                                    .padding(2.dp)
                                    .width(if (preview.value == 1) smallSelectedWidth.dp else smallUnselectedWidth.dp)
                                    .height(if (preview.value == 1) smallSelectedHeight.dp else smallUnselectedHeight.dp),
                                elevation = if (preview.value == 1) 10.dp else 0.dp,
                                onClick = {
                                    preview.value = 1
                                })
                            PreviewImage(
                                rowScope = this,
                                image = painterResource(id = item.image[2]),
                                modifier = Modifier
                                    .padding(2.dp)
                                    .width(if (preview.value == 2) smallSelectedWidth.dp else smallUnselectedWidth.dp)
                                    .height(if (preview.value == 2) smallSelectedHeight.dp else smallUnselectedHeight.dp),
                                elevation = if (preview.value == 2) 10.dp else 0.dp,
                                onClick = {
                                    preview.value = 2
                                })
                        }
                        Row(
                            verticalAlignment = Alignment.Top,
                            modifier = Modifier.padding(start = 24.dp, end = 23.dp, top = 17.dp)
                        ) {
                            Text(
                                text = item.priceText,
                                style = poppins_600_17px,
                                color = color161826,
                                modifier = Modifier.weight(1f)
                            )
                            Text(
                                text = item.price,
                                style = poppins_600_13px,
                                color = color161826,
                                modifier = Modifier.padding(top = 3.dp)
                            )
                        }
                        Row(
                            modifier = Modifier
                                .padding(start = 24.dp, end = 23.dp, top = 5.dp)
                                .fillMaxWidth(), verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = item.desc,
                                style = poppins_400_9px,
                                color = color808080
                            )
                        }
                        Row(
                            modifier = Modifier
                                .padding(start = 24.dp, end = 23.dp, top = 6.dp)
                                .fillMaxWidth(), verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(painterResource(id = R.drawable.item_star), "")
                            Text(
                                text = "  ${item.starCount}",
                                style = poppins_600_9px,
                                color = color161826,
                                modifier = Modifier.padding(top = 3.dp)
                            )
                            Text(
                                text = "  ${item.reviews}",
                                style = poppins_400_9px,
                                color = color808080,
                                modifier = Modifier.padding(top = 3.dp)
                            )
                        }
                        Row(
                            modifier = Modifier
                                .padding(start = 24.dp, end = 23.dp, top = 9.dp)
                                .fillMaxWidth(), verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = stringResource(id = R.string.color),
                                style = poppins_600_10px,
                                color = color737373
                            )
                        }
                        Row(
                            modifier = Modifier
                                .padding(start = 24.dp, end = 23.dp, top = 8.dp)
                                .fillMaxWidth(), verticalAlignment = Alignment.CenterVertically
                        ) {
                            for (i in item.colors.indices) {
                                DrawColor(itemColors = item.colors[i], onClick = {
                                    // TODO()
                                })
                            }
                        }
                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)
                                .fillMaxSize()
                                .background(
                                    color = color181726,
                                    shape = RoundedCornerShape(topStart = 25.dp, topEnd = 25.dp)
                                )
                        ) {
                            Row {
                                Column(modifier = Modifier.weight(1f)) {
                                    Text(
                                        stringResource(id = R.string.quantity),
                                        style = poppins_500_9px,
                                        color = color808080,
                                        modifier = Modifier.padding(start = 24.dp, top = 14.dp)
                                    )
                                    Row(modifier = Modifier.padding(start = 24.dp, top = 10.dp)) {
                                        Box(
                                            modifier = Modifier
                                                .width(38.dp)
                                                .height(22.dp)
                                                .clip(RoundedCornerShape(8.dp))
                                                .background(color = color4E55D7)
                                                .clickable {
                                                    //TODO()
                                                },
                                            contentAlignment = Alignment.Center
                                        ) {
                                            Image(
                                                painter = painterResource(id = R.drawable.item_minus),
                                                contentDescription = ""
                                            )
                                        }
                                        Box(
                                            modifier = Modifier
                                                .padding(start = 20.79.dp)
                                                .width(38.dp)
                                                .height(22.dp)
                                                .clip(RoundedCornerShape(8.dp))
                                                .background(color = color4E55D7)
                                                .clickable {
                                                    //TODO()
                                                },
                                            contentAlignment = Alignment.Center
                                        ) {
                                            Image(
                                                painter = painterResource(id = R.drawable.item_plus),
                                                contentDescription = ""
                                            )
                                        }
                                    }
                                }
                                Column(modifier = Modifier
                                    .weight(1f)
                                    .clickable {
                                        //TODO()
                                    }) {
                                    Box(
                                        modifier = Modifier
                                            .padding(top = 19.dp, end = 23.dp)
                                            .fillMaxWidth()
                                            .height(44.dp)
                                            .clip(RoundedCornerShape(15.dp))
                                            .background(color = color4E55D7),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Row(verticalAlignment = Alignment.CenterVertically) {
                                            Text(
                                                item.buttonText,
                                                style = poppins_600_8px,
                                                color = color99A0FF,
                                                modifier = Modifier.padding(end = 30.dp)
                                            )
                                            Text(
                                                stringResource(id = R.string.add_to_card),
                                                style = poppins_600_8px,
                                                color = Color.White
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }
                    Icon(
                        painterResource(id = R.drawable.item_back),
                        "",
                        modifier = Modifier
                            .padding(top = backTop.dp, start = backLeft.dp)
                            .clickable {
                                navController.navigate(NavDestination.MainScreen.destination)
                            },
                        tint = colorOnSurface
                    )
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.End
                    ) {
                        Box(
                            modifier = Modifier
                                .padding(top = 201.dp, end = 34.dp)
                                .width(42.dp)
                                .clip(RoundedCornerShape(14.dp))
                                .background(color = colorE5E9EF),
                            contentAlignment = Alignment.Center
                        ) {
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Image(
                                    painter = painterResource(id = R.drawable.item_favorite),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .padding(
                                            top = 17.dp,
                                            start = 14.dp,
                                            end = 13.dp,
                                            bottom = 17.dp
                                        )
                                        .clickable {
                                            // TODO()
                                        }
                                )
                                Image(
                                    painter = painterResource(id = R.drawable.item_divider),
                                    contentDescription = ""
                                )
                                Image(
                                    painter = painterResource(id = R.drawable.item_share),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .padding(
                                            top = 17.dp,
                                            start = 14.dp,
                                            end = 12.dp,
                                            bottom = 17.dp
                                        )
                                        .clickable {
                                            // TODO()
                                        }
                                )
                            }
                        }
                    }
                })
        }
    }
}

@Composable
fun DrawColor(itemColors: Colors, onClick: () -> Unit) {
    val fillColor = when (itemColors) {
        Colors.WHITE -> Color.White
        Colors.GRAY -> colorC4C4C4
        Colors.BLACK -> color181726
    }
    val border = when (itemColors) {
        Colors.WHITE -> BorderStroke(2.dp, colorADADAD)
        Colors.GRAY -> BorderStroke(2.dp, colorC4C4C4)
        Colors.BLACK -> BorderStroke(2.dp, color181726)
    }
    Surface(
        modifier = Modifier
            .padding(end = 14.dp)
            .width(34.dp)
            .height(26.dp)
            .clickable { onClick() },
        border = border,
        color = fillColor,
        shape = RoundedCornerShape(9.dp)
    ) {}
}

@Composable
fun PreviewImage(
    rowScope: RowScope,
    image: Painter,
    modifier: Modifier,
    elevation: Dp,
    onClick: () -> Unit
) {
    rowScope.run {
        Surface(
            modifier = modifier
                .shadow(elevation = elevation)
                .clip(RoundedCornerShape(9.dp))
                .clickable { onClick() }
        ) {
            Image(
                painter = image,
                "",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}