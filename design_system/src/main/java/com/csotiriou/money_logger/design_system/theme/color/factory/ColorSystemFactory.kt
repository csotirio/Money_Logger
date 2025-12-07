package com.csotiriou.money_logger.design_system.theme.color.factory

import com.csotiriou.money_logger.design_system.theme.color.system.DarkBaseColorSystem
import com.csotiriou.money_logger.design_system.theme.color.system.LightBaseColorSystem

object ColorSystemFactory {
    fun create(isDarkTheme: Boolean) = if (isDarkTheme) DarkBaseColorSystem else LightBaseColorSystem
}