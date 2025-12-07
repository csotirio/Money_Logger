package com.csotiriou.money_logger.design_system.theme.color.system

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

@Immutable
data class BaseColorSystem(
    val background: Color = Color.Unspecified,
    
    /** Texts */
    val primaryText: Color = Color.Unspecified,
    val primaryTextDisabled: Color = Color.Unspecified,
    val secondaryText: Color = Color.Unspecified,
    val secondaryTextDisabled: Color = Color.Unspecified,
    
    /** Icons */
    val primaryIcon: Color = Color.Unspecified,
    val primaryIconDisabled: Color = Color.Unspecified,
    val secondaryIcon: Color = Color.Unspecified,
    val secondaryIconDisabled: Color = Color.Unspecified,
    
    /** Buttons */
    val primaryButton: Color = Color.Unspecified,
    val primaryButtonDisabled: Color = Color.Unspecified,
    val secondaryButton: Color = Color.Unspecified,
    val secondaryButtonDisabled: Color = Color.Unspecified,
    
    /** Inputs */
    val primaryInput: Color = Color.Unspecified,
    val primaryInputBorder: Color = Color.Unspecified,
    val primaryInputPlaceholder: Color = Color.Unspecified,
    val primaryInputDisabled: Color = Color.Unspecified,
   
   /** Error */
    val error: Color = Color.Unspecified,
)