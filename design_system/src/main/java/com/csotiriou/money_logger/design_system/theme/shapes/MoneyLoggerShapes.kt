package com.csotiriou.money_logger.design_system.theme.shapes

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

@Immutable
data class MoneyLoggerShapes(
    // Rounded Corner Shapes
    val shape0: CornerBasedShape = RoundedCornerShape(0.dp),
    val shape4: CornerBasedShape = RoundedCornerShape(4.dp),    // Extra Small
    val shape8: CornerBasedShape = RoundedCornerShape(8.dp),    // Small
    val shape12: CornerBasedShape = RoundedCornerShape(12.dp),  // Medium
    val shape16: CornerBasedShape = RoundedCornerShape(16.dp),  // Large
    val shape24: CornerBasedShape = RoundedCornerShape(24.dp),  // Extra Large
    val full: CornerBasedShape = RoundedCornerShape(100),

    // Geometric Shapes
    val circle: Shape = CircleShape,
    val square: Shape = RectangleShape
)

internal val LocalShapes = staticCompositionLocalOf { MoneyLoggerShapes() }