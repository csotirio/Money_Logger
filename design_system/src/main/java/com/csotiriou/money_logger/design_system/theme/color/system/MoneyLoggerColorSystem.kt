package com.csotiriou.money_logger.design_system.theme.color.system

import androidx.compose.runtime.staticCompositionLocalOf
import com.csotiriou.money_logger.design_system.theme.color.BaseColors

val LightBaseColorSystem = BaseColorSystem(
    background = BaseColors.White,

    /** Texts */
    primaryText = BaseColors.Green,
    primaryTextDisabled = BaseColors.DarkGreen,
    secondaryText = BaseColors.Blue,
    secondaryTextDisabled = BaseColors.OceanBlue,

    /** Icons */
    primaryIcon = BaseColors.Green,
    primaryIconDisabled = BaseColors.DarkGreen,
    secondaryIcon = BaseColors.Blue,
    secondaryIconDisabled = BaseColors.OceanBlue,

    /** Buttons */
    primaryButton = BaseColors.Green,
    primaryButtonDisabled = BaseColors.DarkGreen,
    secondaryButton = BaseColors.Blue,
    secondaryButtonDisabled = BaseColors.OceanBlue,

    /** Inputs */
    primaryInput = BaseColors.White,
    primaryInputBorder = BaseColors.SemiLightGreen,
    primaryInputPlaceholder = BaseColors.SemiLightGreen,
    primaryInputDisabled = BaseColors.DarkGreen,

    /** Error */
    error = BaseColors.Red,
)


val DarkBaseColorSystem = BaseColorSystem(
    background = BaseColors.Black,

    /** Texts */
    primaryText = BaseColors.LightGreen,
    primaryTextDisabled = BaseColors.SemiDarkGreen,
    secondaryText = BaseColors.LightBlue,
    secondaryTextDisabled = BaseColors.OceanBlue,

    /** Icons */
    primaryIcon = BaseColors.LightGreen,
    primaryIconDisabled = BaseColors.SemiDarkGreen,
    secondaryIcon = BaseColors.LightBlue,
    secondaryIconDisabled = BaseColors.OceanBlue,

    /** Buttons */
    primaryButton = BaseColors.LightGreen,
    primaryButtonDisabled = BaseColors.SemiDarkGreen,
    secondaryButton = BaseColors.LightBlue,
    secondaryButtonDisabled = BaseColors.OceanBlue,

    /** Inputs */
    primaryInput = BaseColors.Black,
    primaryInputBorder = BaseColors.LightGreen,
    primaryInputPlaceholder = BaseColors.LightGreen,
    primaryInputDisabled = BaseColors.SemiDarkGreen,

    /** Error */
    error = BaseColors.Red,
)

internal val LocalColorSystem = staticCompositionLocalOf { BaseColorSystem() }
