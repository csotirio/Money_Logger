package com.csotiriou.money_logger.design_system.theme.dimensions

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class Dimensions (
    val spacing0: Dp = 0.dp,
    val spacing2: Dp = 2.dp,
    val spacing4: Dp = 4.dp,   // Extra Small
    val spacing8: Dp = 8.dp,   // Small
    val spacing12: Dp = 12.dp,
    val spacing16: Dp = 16.dp, // Medium
    val spacing24: Dp = 24.dp, // Large
    val spacing32: Dp = 32.dp, // Extra Large
    val spacing40: Dp = 40.dp,
    val spacing48: Dp = 48.dp,
    val spacing64: Dp = 64.dp
)

internal val LocalDimensions = staticCompositionLocalOf { Dimensions() }