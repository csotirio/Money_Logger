package com.csotiriou.money_logger.design_system.theme

import androidx.appcompat.app.AppCompatDelegate
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import com.csotiriou.money_logger.design_system.theme.color.factory.ColorSystemFactory
import com.csotiriou.money_logger.design_system.theme.color.system.BaseColorSystem
import com.csotiriou.money_logger.design_system.theme.color.system.LocalColorSystem
import com.csotiriou.money_logger.design_system.theme.dimensions.Dimensions
import com.csotiriou.money_logger.design_system.theme.dimensions.LocalDimensions
import com.csotiriou.money_logger.design_system.theme.shapes.LocalShapes
import com.csotiriou.money_logger.design_system.theme.shapes.MoneyLoggerShapes
import com.csotiriou.money_logger.design_system.theme.typography.LocalTypography
import com.csotiriou.money_logger.design_system.theme.typography.MoneyLoggerTypography

object Theme {
    val colors
        @Composable
        @ReadOnlyComposable
        get() = BaseColorSystem()

    val typography
        @Composable
        @ReadOnlyComposable
        get() = MoneyLoggerTypography

    val shapes
        @Composable
        @ReadOnlyComposable
        get() = MoneyLoggerShapes()

    val dimensions
        @Composable
        @ReadOnlyComposable
        get() = Dimensions()
}

@Composable
fun MoneyLoggerTheme(
    darkTheme: Boolean = isDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors: BaseColorSystem = ColorSystemFactory.create(isDarkTheme = isDarkTheme())

    CompositionLocalProvider(
        LocalColorSystem provides colors,
        LocalDimensions provides Theme.dimensions,
        LocalShapes provides Theme.shapes,
        LocalTypography provides Theme.typography
    ) {
        MaterialTheme(
            content = content
        )
    }
}

@ReadOnlyComposable
@Composable
internal fun isDarkTheme(): Boolean = when (AppCompatDelegate.getDefaultNightMode()) {
    AppCompatDelegate.MODE_NIGHT_YES -> true
    AppCompatDelegate.MODE_NIGHT_NO -> true
    AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM -> isSystemInDarkTheme()
    else -> isSystemInDarkTheme()
}