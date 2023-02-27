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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import ru.veider.effectivemobiletest.R
import ru.veider.effectivemobiletest.presentation.assets.toDp
import ru.veider.effectivemobiletest.ui.theme.*

@Composable
fun Latest() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 11.dp, end = 11.dp, top = 29.dp), verticalAlignment = Alignment.Top
    ) {
        Text(
            text = stringResource(id = R.string.latest),
            style = poppins_500_15px,
            color = color040402,
            modifier = Modifier.weight(1f)
        )
        Text(
            text = stringResource(id = R.string.view_all),
            style = poppins_500_9px,
            color = color808080,
            modifier = Modifier.clickable {
                // TODO()
            }
        )
    }
    LazyRow(modifier = Modifier.padding(start = 15.dp)) {
        item {
            LatestItem(
                photo = painterResource(id = R.drawable.latest_1),
                type = "Phones",
                model = "Samsung S10\n",
                price = "$ 180,000",
                onPlusClick = {
                    // TODO()
                })
        }
        item {
            LatestItem(
                photo = painterResource(id = R.drawable.latest_2),
                type = "Games",
                model = "Play Station 5\nconsole",
                price = "$ 90,000",
                onPlusClick = {
                    // TODO()
                })
        }
        item {
            LatestItem(
                photo = painterResource(id = R.drawable.latest_3),
                type = "Games",
                model = "Play Station 5\nconsole",
                price = "$ 95,000",
                onPlusClick = {
                    // TODO()
                })
        }
    }
}

@Composable
fun LatestItem(
    photo: Painter,
    type: String,
    model: String,
    price: String,
    onPlusClick: () -> Unit
) {
    val context = LocalContext.current
    val latestItemWidth =
        remember { (context.resources.displayMetrics.widthPixels / 3).toDp(context) }
    val latestItemHeight = remember { latestItemWidth * 149 / 114 }

    Box(
        modifier = Modifier
            .padding(end = 12.dp)
    ) {
        Image(
            painter = photo,
            contentDescription = "",
            modifier = Modifier
                .width(latestItemWidth)
                .height(latestItemHeight)
                .clip(RoundedCornerShape(9.dp))
        )
        Column(
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier
                .width(latestItemWidth)
                .height(latestItemHeight)
                .padding(start = 7.dp, bottom = 7.dp)
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .height(12.dp)
                    .clip(RoundedCornerShape(5.dp))
                    .background(color = colorD9C4C4C4)
            ) {
                Text(
                    text = type,
                    style = poppins_600_6px,
                    color = colorOnSurface,
                    modifier = Modifier.padding(
                        start = 14.dp,
                        end = 14.dp,
                        top = 1.dp,
                        bottom = 3.dp
                    )
                )
            }
            Text(
                text = model,
                style = poppins_600_9px,
                color = Color.White,
                modifier = Modifier.padding(top = 3.dp)
            )
            Text(
                text = price,
                style = poppins_600_7px,
                color = Color.White,
                modifier = Modifier.padding(top = 1.dp)
            )
        }
        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.End,
            modifier = Modifier
                .width(latestItemWidth)
                .height(latestItemHeight)
                .padding(end = 5.dp, bottom = 5.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.latest_plus),
                contentDescription = "",
                modifier = Modifier.clickable { onPlusClick() })
        }
    }
}