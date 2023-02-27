package ru.veider.effectivemobiletest.presentation.mainscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import ru.veider.effectivemobiletest.R
import ru.veider.effectivemobiletest.navigation.NavDestination
import ru.veider.effectivemobiletest.presentation.assets.toDp
import ru.veider.effectivemobiletest.ui.theme.*

@Composable
fun FlashSale(navController: NavController) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 11.dp, end = 11.dp, top = 29.dp), verticalAlignment = Alignment.Top
    ) {
        Text(
            text = stringResource(id = R.string.flash_sale),
            style = poppins_500_15px,
            color = color040402,
            modifier = Modifier.weight(1f)
        )
        Text(
            text = stringResource(id = R.string.view_all),
            style = montserrat_500_9px,
            color = color808080,
            modifier = Modifier.clickable {
                // TODO()
            }
        )
    }
    LazyRow(modifier = Modifier.padding(start = 15.dp)) {
        item {
            SaleItem(
                photo = painterResource(id = R.drawable.sale_1),
                master = painterResource(id = R.drawable.master),
                type = "Kids",
                model = "New balance\nsneakers",
                price = "$ 33,00",
                discount = "30% off",
                onCardClick = {
                    // TODO()
                },
                onFavoriteClick = {
                    // TODO()
                },
                onPlusClick = {
                    // TODO()
                })
        }
        item {
            SaleItem(
                photo = painterResource(id = R.drawable.item_1_1),
                master = painterResource(id = R.drawable.master),
                type = "Kids",
                model = "New balance\nsneakers",
                price = "$ 22,50",
                discount = "30% off",
                onCardClick = {
                    navController.navigate(NavDestination.Item.destination)
                },
                onFavoriteClick = {
                    // TODO()
                },
                onPlusClick = {
                    // TODO()
                })
        }
        item {
            SaleItem(
                photo = painterResource(id = R.drawable.sale_3),
                master = painterResource(id = R.drawable.master),
                type = "Kids",
                model = "New balance\nsneakers",
                price = "$ 28,75",
                discount = "30% off",
                onCardClick = {
                    // TODO()
                },
                onFavoriteClick = {
                    // TODO()
                },
                onPlusClick = {
                    // TODO()
                })
        }
    }
}

@Composable
fun SaleItem(
    photo: Painter,
    master: Painter,
    type: String,
    model: String,
    price: String,
    discount: String,
    onCardClick: () -> Unit,
    onFavoriteClick: () -> Unit,
    onPlusClick: () -> Unit
) {

    val context = LocalContext.current
    val latestItemWidth =
        remember { (context.resources.displayMetrics.widthPixels * 174 / 375).toDp(context) }
    val latestItemHeight = remember { latestItemWidth * 221 / 174 }

    Box(
        modifier = Modifier
            .padding(end = 9.dp)
    ) {
        Image(
            painter = photo,
            contentDescription = "",
            contentScale = ContentScale.FillHeight,
            modifier = Modifier
                .width(latestItemWidth)
                .height(latestItemHeight)
                .clip(RoundedCornerShape(11.dp))
                .clickable { onCardClick() }
        )
        Column(
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier
                .width(latestItemWidth)
                .height(latestItemHeight)
                .padding(start = 10.dp, bottom = 17.dp)
        ) {
            Box(
                contentAlignment = Alignment.Center, modifier = Modifier
                    .height(17.dp)
                    .clip(RoundedCornerShape(5.dp))
                    .background(color = colorD9C4C4C4)
            ) {
                Text(
                    text = type,
                    style = poppins_500_9px,
                    color = colorOnSurface,
                    modifier = Modifier.padding(start = 8.dp, end = 8.dp, top = 2.dp, bottom = 3.dp)
                )

            }
            Text(
                text = model,
                style = poppins_600_13px,
                color = Color.White,
                modifier = Modifier.padding(top = 6.dp)
            )
            Text(
                text = price,
                style = poppins_600_10px,
                color = Color.White,
                modifier = Modifier.padding(top = 12.dp)
            )
        }
        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.End,
            modifier = Modifier
                .width(latestItemWidth)
                .height(latestItemHeight)
                .padding(end = 4.dp, bottom = 7.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.flash_sale_favorite),
                    contentDescription = "",
                    modifier = Modifier
                        .clickable { onFavoriteClick() }
                        .padding(end = 5.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.flash_sale_plus),
                    contentDescription = "",
                    modifier = Modifier.clickable { onPlusClick() })
            }
        }

        Image(
            painter = master,
            "",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .padding(top = 7.dp, start = 7.dp)
                .size(25.dp)
        )
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.End,
            modifier = Modifier
                .width(latestItemWidth)
                .height(latestItemHeight)
                .padding(end = 8.dp, top = 7.dp)
        ) {
            Box(
                contentAlignment = Alignment.Center, modifier = Modifier
                    .height(18.dp)
                    .clip(RoundedCornerShape(9.dp))
                    .background(color = colorF93A3A)
            ) {
                Text(
                    text = discount,
                    style = poppins_600_10px,
                    color = colorSurface,
                    modifier = Modifier.padding(start = 8.dp, end = 8.dp, top = 1.dp, bottom = 1.dp)
                )
            }
        }
    }
}