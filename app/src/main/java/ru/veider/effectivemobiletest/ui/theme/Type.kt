package ru.veider.effectivemobiletest.ui.theme

import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import ru.veider.effectivemobiletest.R

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)

val montserrat_400_9px
    @Composable
    get() = TextStyle(
        fontFamily = FontFamily(Font(R.font.montserrat_w400)),
        fontSize = 9.sp,
        lineHeight = 14.sp,
        letterSpacing = (-0.3).sp
    )

val montserrat_400_10px
    @Composable
    get() = TextStyle(
        fontFamily = FontFamily(Font(R.font.montserrat_w400)),
        fontSize = 10.sp,
        lineHeight = 15.sp,
        letterSpacing = (-0.3).sp
    )

val montserrat_500_8px
    @Composable
    get() = TextStyle(
        fontFamily = FontFamily(Font(R.font.montserrat_w500)),
        fontSize = 8.sp,
        lineHeight = 12.sp,
        letterSpacing = (-0.3).sp
    )

val montserrat_500_9px
    @Composable
    get() = TextStyle(
        fontFamily = FontFamily(Font(R.font.montserrat_w500)),
        fontSize = 9.sp,
        lineHeight = 14.sp,
        letterSpacing = (-0.3).sp
    )

val montserrat_500_11px
    @Composable
    get() = TextStyle(
        fontFamily = FontFamily(Font(R.font.montserrat_w500)),
        fontSize = 11.sp,
        lineHeight = 13.sp,
        letterSpacing = (-0.3).sp
    )

val montserrat_500_12px
    @Composable
    get() = TextStyle(
        fontFamily = FontFamily(Font(R.font.montserrat_w500)),
        fontSize = 12.sp,
        lineHeight = 15.sp,
        letterSpacing = (-0.3).sp
    )

val montserrat_500_14px
    @Composable
    get() = TextStyle(
        fontFamily = FontFamily(Font(R.font.montserrat_w500)),
        fontSize = 14.sp,
        lineHeight = 17.07.sp,
        letterSpacing = (-0.3).sp
    )

val montserrat_600_14px
    @Composable
    get() = TextStyle(
        fontFamily = FontFamily(Font(R.font.montserrat_w600)),
        fontSize = 14.sp,
        lineHeight = 17.07.sp,
        letterSpacing = (-0.3).sp
    )

val montserrat_600_26px
    @Composable
    get() = TextStyle(
        fontFamily = FontFamily(Font(R.font.montserrat_w600)),
        fontSize = 26.sp,
        lineHeight = 32.sp,
        letterSpacing = (-0.3).sp
    )

val montserrat_700_14px
    @Composable
    get() = TextStyle(
        fontFamily = FontFamily(Font(R.font.montserrat_w700)),
        fontSize = 14.sp,
        lineHeight = 17.sp,
        letterSpacing = (-0.3).sp
    )

val montserrat_700_15px
    @Composable
    get() = TextStyle(
        fontFamily = FontFamily(Font(R.font.montserrat_w700)),
        fontSize = 15.sp,
        lineHeight = 18.sp,
        letterSpacing = (-0.3).sp
    )

val montserrat_700_20px
    @Composable
    get() = TextStyle(
        fontFamily = FontFamily(Font(R.font.montserrat_w700)),
        fontSize = 20.sp,
        lineHeight = 24.sp,
        letterSpacing = (-0.3).sp
    )

val poppins_400_9px
    @Composable
    get() = TextStyle(
        fontFamily = FontFamily(Font(R.font.poppins_w400)),
        fontSize = 9.sp,
        lineHeight = 13.5.sp,
        letterSpacing = (-0.3).sp
    )

val poppins_500_6px
    @Composable
    get() = TextStyle(
        fontFamily = FontFamily(Font(R.font.poppins_w500)),
        fontSize = 6.sp,
        lineHeight = 9.sp,
        letterSpacing = (-0.3).sp
    )

val poppins_500_9px
    @Composable
    get() = TextStyle(
        fontFamily = FontFamily(Font(R.font.poppins_w500)),
        fontSize = 9.sp,
        lineHeight = 14.sp,
        letterSpacing = (-0.3).sp
    )

val poppins_500_15px
    @Composable
    get() = TextStyle(
        fontFamily = FontFamily(Font(R.font.poppins_w500)),
        fontSize = 15.sp,
        lineHeight = 22.sp,
        letterSpacing = (-0.3).sp
    )

val poppins_600_6px
    @Composable
    get() = TextStyle(
        fontFamily = FontFamily(Font(R.font.poppins_w600)),
        fontSize = 6.sp,
        lineHeight = 9.sp,
        letterSpacing = (-0.3).sp
    )

val poppins_600_7px
    @Composable
    get() = TextStyle(
        fontFamily = FontFamily(Font(R.font.poppins_w600)),
        fontSize = 7.sp,
        lineHeight = 10.sp,
        letterSpacing = (-0.3).sp
    )

val poppins_600_8px
    @Composable
    get() = TextStyle(
        fontFamily = FontFamily(Font(R.font.poppins_w600)),
        fontSize = 8.sp,
        lineHeight = 12.sp,
        letterSpacing = (-0.3).sp
    )

val poppins_600_9px
    @Composable
    get() = TextStyle(
        fontFamily = FontFamily(Font(R.font.poppins_w600)),
        fontSize = 9.sp,
        lineHeight = 13.5.sp,
        letterSpacing = (-0.3).sp
    )

val poppins_600_10px
    @Composable
    get() = TextStyle(
        fontFamily = FontFamily(Font(R.font.poppins_w600)),
        fontSize = 10.sp,
        lineHeight = 15.sp,
        letterSpacing = (-0.3).sp
    )

val poppins_600_13px
    @Composable
    get() = TextStyle(
        fontFamily = FontFamily(Font(R.font.poppins_w600)),
        fontSize = 13.sp,
        lineHeight = 20.sp,
        letterSpacing = (-0.3).sp
    )

val poppins_600_17px
    @Composable
    get() = TextStyle(
        fontFamily = FontFamily(Font(R.font.poppins_w600)),
        fontSize = 17.sp,
        lineHeight = 25.5.sp,
        letterSpacing = (-0.3).sp
    )

