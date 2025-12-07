package com.csotiriou.money_logger.design_system.theme.typography

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import com.csotiriou.money_logger.design_system.R

object MoneyLoggerFontFamily {
    val extraLight by lazy { FontFamily(Font(R.font.manrope_extra_light)) }
    val light by lazy { FontFamily(Font(R.font.manrope_light)) }
    val regular by lazy { FontFamily(Font(R.font.manrope_regular)) }
    val medium by lazy { FontFamily(Font(R.font.manrope_medium)) }
    val semiBold by lazy { FontFamily(Font(R.font.manrope_semi_bold)) }
    val bold by lazy { FontFamily(Font(R.font.manrope_bold)) }
    val extraBold by lazy { FontFamily(Font(R.font.manrope_extra_bold)) }
}

// --- H1 ---
private val h1Light = TextStyle(
    fontFamily = MoneyLoggerFontFamily.light,
    fontSize = 32.sp,
    lineHeight = 40.sp,
    letterSpacing = 0.sp
)
private val h1 = h1Light.copy(fontFamily = MoneyLoggerFontFamily.regular)
private val h1Bold = h1Light.copy(fontFamily = MoneyLoggerFontFamily.bold)

// --- H2 ---
private val h2Light = TextStyle(
    fontFamily = MoneyLoggerFontFamily.light,
    fontSize = 28.sp,
    lineHeight = 36.sp,
    letterSpacing = 0.sp
)
private val h2 = h2Light.copy(fontFamily = MoneyLoggerFontFamily.regular)
private val h2Bold = h2Light.copy(fontFamily = MoneyLoggerFontFamily.bold)

// --- H3 ---
private val h3Light = TextStyle(
    fontFamily = MoneyLoggerFontFamily.light,
    fontSize = 24.sp,
    lineHeight = 32.sp,
    letterSpacing = 0.sp
)
private val h3 = h3Light.copy(fontFamily = MoneyLoggerFontFamily.regular)
private val h3Bold = h3Light.copy(fontFamily = MoneyLoggerFontFamily.bold)

// --- H4 ---
private val h4Light = TextStyle(
    fontFamily = MoneyLoggerFontFamily.light,
    fontSize = 22.sp,
    lineHeight = 28.sp,
    letterSpacing = 0.sp
)
private val h4 = h4Light.copy(fontFamily = MoneyLoggerFontFamily.regular)
private val h4Bold = h4Light.copy(fontFamily = MoneyLoggerFontFamily.bold)

// --- H5 ---
private val h5Light = TextStyle(
    fontFamily = MoneyLoggerFontFamily.light,
    fontSize = 18.sp,
    lineHeight = 24.sp,
    letterSpacing = 0.sp
)
private val h5 = h5Light.copy(fontFamily = MoneyLoggerFontFamily.regular)
private val h5Bold = h5Light.copy(fontFamily = MoneyLoggerFontFamily.bold)

// --- H6 ---
private val h6Light = TextStyle(
    fontFamily = MoneyLoggerFontFamily.light,
    fontSize = 16.sp,
    lineHeight = 24.sp,
    letterSpacing = 0.15.sp
)
private val h6 = h6Light.copy(fontFamily = MoneyLoggerFontFamily.regular)
private val h6Bold = h6Light.copy(fontFamily = MoneyLoggerFontFamily.bold)

// --- Body ---
private val bodyLight = TextStyle(
    fontFamily = MoneyLoggerFontFamily.light,
    fontSize = 16.sp,
    lineHeight = 24.sp,
    letterSpacing = 0.5.sp
)
private val body = bodyLight.copy(fontFamily = MoneyLoggerFontFamily.regular)
private val bodyBold = bodyLight.copy(fontFamily = MoneyLoggerFontFamily.bold)

// --- Title ---
private val titleLight = TextStyle(
    fontFamily = MoneyLoggerFontFamily.light,
    fontSize = 14.sp,
    lineHeight = 20.sp,
    letterSpacing = 0.1.sp
)
private val title = titleLight.copy(fontFamily = MoneyLoggerFontFamily.regular)
private val titleBold = titleLight.copy(fontFamily = MoneyLoggerFontFamily.bold)


/**
 * The main typography object that holds all the text styles for the app.
 * This is what you will pass to your Theme composable.
 */
val MoneyLoggerTypography = BaseTypography(
    h1Light = h1Light,
    h1 = h1,
    h1Bold = h1Bold,

    h2Light = h2Light,
    h2 = h2,
    h2Bold = h2Bold,

    h3Light = h3Light,
    h3 = h3,
    h3Bold = h3Bold,

    h4Light = h4Light,
    h4 = h4,
    h4Bold = h4Bold,

    h5Light = h5Light,
    h5 = h5,
    h5Bold = h5Bold,

    h6Light = h6Light,
    h6 = h6,
    h6Bold = h6Bold,

    bodyLight = bodyLight,
    body = body,
    bodyBold = bodyBold,

    titleLight = titleLight,
    title = title,
    titleBold = titleBold
)

internal val LocalTypography = staticCompositionLocalOf { MoneyLoggerTypography }