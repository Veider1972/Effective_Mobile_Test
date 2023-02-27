package ru.veider.effectivemobiletest.presentation.mainscreen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import ru.veider.effectivemobiletest.R
import ru.veider.effectivemobiletest.presentation.common.BottomBar
import ru.veider.effectivemobiletest.ui.theme.*

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen(navController: NavController) {

    val lookFor = rememberSaveable { mutableStateOf("") }

    EffectiveMobileTestTheme {
        Scaffold(
            backgroundColor = colorFAF9FF,
            topBar = { TopBar(navController) },
            bottomBar = { BottomBar(navController, 1) }
        ) {
            Column(
                modifier = Modifier
                    .background(color = colorSurface)
                    .fillMaxHeight()
            ) {
                SeekField(
                    trailingIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.seek_find),
                            contentDescription = ""
                        )
                    },
                    value = lookFor.value,
                    onValueChange = { lookFor.value = it },
                    textStyle = montserrat_400_9px,
                    singleLine = true,
                    modifier = Modifier
                        .padding(top = 6.dp, bottom = 0.dp),
                    placeholderText = stringResource(id = R.string.look_for)
                )
                Row(modifier = Modifier.padding(start = 15.dp, end = 15.dp, top = 17.dp)) {
                    SeekItem(
                        rowScope = this,
                        icon = R.drawable.item_phone,
                        text = R.string.item_phone,
                        onClick = {
                            // TODO()
                        }
                    )
                    SeekItem(
                        rowScope = this,
                        icon = R.drawable.item_headphone,
                        text = R.string.item_headphone,
                        onClick = {
                            // TODO()
                        }
                    )
                    SeekItem(
                        rowScope = this,
                        icon = R.drawable.item_games,
                        text = R.string.item_games,
                        onClick = {
                            // TODO()
                        }
                    )
                    SeekItem(
                        rowScope = this,
                        icon = R.drawable.item_car,
                        text = R.string.item_cars,
                        onClick = {
                            // TODO()
                        })
                    SeekItem(
                        rowScope = this,
                        icon = R.drawable.item_furniture,
                        text = R.string.item_furniture,
                        onClick = {
                            // TODO()
                        }
                    )
                    SeekItem(
                        rowScope = this,
                        icon = R.drawable.item_kids,
                        text = R.string.item_kids,
                        onClick = {
                            // TODO()
                        }
                    )
                }
                LazyColumn {
                    item { Latest() }
                    item { FlashSale(navController) }
                    item { Brands() }
                    item { Spacer(modifier = Modifier.height(73.dp)) }
                }
            }
        }
    }
}

@Composable
fun SeekItem(rowScope: RowScope, icon: Int, text: Int, onClick: () -> Unit) {
    rowScope.run {
        Column(
            modifier = Modifier
                .weight(1f)
                .clickable { onClick() },
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(painterResource(id = icon), "")
            Text(
                stringResource(id = text),
                style = montserrat_500_8px,
                color = colorA6A7AB,
                modifier = Modifier.padding(top = 11.dp)
            )
        }
    }
}

@Composable
fun SeekField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    textStyle: TextStyle = LocalTextStyle.current,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions(),
    singleLine: Boolean = false,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    placeholderText: String = "",
    onTextLayout: (TextLayoutResult) -> Unit = {},
    cursorBrush: Brush = SolidColor(Color.Black),
) {
    BasicTextField(modifier = modifier
        .fillMaxWidth(),
        value = value,
        onValueChange = onValueChange,
        singleLine = singleLine,
        maxLines = maxLines,
        enabled = enabled,
        readOnly = readOnly,
        interactionSource = interactionSource,
        textStyle = textStyle,
        visualTransformation = visualTransformation,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        onTextLayout = onTextLayout,
        cursorBrush = cursorBrush,
        decorationBox = { innerTextField ->
            Row(
                modifier,
                verticalAlignment = Alignment.CenterVertically
            ) {
                if (leadingIcon != null) leadingIcon()
                Box(
                    Modifier
                        .padding(start = 57.dp, end = 57.dp)
                        .weight(1f)
                        .clip(RoundedCornerShape(12.dp))
                        .background(colorF5F6F7)
                        .align(Alignment.CenterVertically)
                        .height(24.dp),
                    contentAlignment = Alignment.CenterStart
                ) {
                    if (value.isEmpty()) Text(
                        placeholderText,
                        color = color5B5B5B,
                        style = montserrat_400_9px,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Row(modifier = Modifier.padding(start = 10.dp, end = 10.dp)) {
                        Column(modifier = Modifier.weight(1f)) {
                            innerTextField()
                        }
                        Column() {
                            if (trailingIcon != null) trailingIcon()
                        }
                    }

                }

            }
        }
    )
}