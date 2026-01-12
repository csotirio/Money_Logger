package com.csotiriou.money_logger.core.design_system.theme.color.extentions

import androidx.compose.ui.graphics.Color

val Color.alpha10: Color get() = withAlpha(0.1f)
val Color.alpha20: Color get() = withAlpha(0.2f)
val Color.alpha30: Color get() = withAlpha(0.3f)
val Color.alpha40: Color get() = withAlpha(0.4f)
val Color.alpha50: Color get() = withAlpha(0.5f)
val Color.alpha60: Color get() = withAlpha(0.6f)
val Color.alpha70: Color get() = withAlpha(0.7f)
val Color.alpha80: Color get() = withAlpha(0.8f)
val Color.alpha90: Color get() = withAlpha(0.9f)

private fun Color.withAlpha(alpha: Float): Color = this.copy(alpha = alpha)