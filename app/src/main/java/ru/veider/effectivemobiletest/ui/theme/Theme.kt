package ru.veider.effectivemobiletest.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette
    @Composable
    get() =
        darkColors(
            primary = colorPrimary,
            onSurface = colorOnSurface,
            surface = colorSurface
        )

private val LightColorPalette
    @Composable
    get() =
        lightColors(
            primary = colorPrimary,
            onSurface = colorOnSurface,
            surface = colorSurface

            /* Other default colors to override
            background = Color.White,
            surface = Color.White,
            onPrimary = Color.White,
            onSecondary = Color.Black,
            onBackground = Color.Black,
            onSurface = Color.Black,
            */
        )

@Composable
fun EffectiveMobileTestTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}