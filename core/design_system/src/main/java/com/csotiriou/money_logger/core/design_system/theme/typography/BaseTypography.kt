package com.csotiriou.money_logger.core.design_system.theme.typography

import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle

@Immutable
data class BaseTypography (
    /** Headers */
    val h1Light: TextStyle = TextStyle.Default,
    val h1: TextStyle = TextStyle.Default,
    val h1Bold: TextStyle = TextStyle.Default,

    val h2Light: TextStyle = TextStyle.Default,
    val h2: TextStyle = TextStyle.Default,
    val h2Bold: TextStyle = TextStyle.Default,

    val h3Light: TextStyle = TextStyle.Default,
    val h3: TextStyle = TextStyle.Default,
    val h3Bold: TextStyle = TextStyle.Default,

    val h4Light: TextStyle = TextStyle.Default,
    val h4: TextStyle = TextStyle.Default,
    val h4Bold: TextStyle = TextStyle.Default,

    val h5Light: TextStyle = TextStyle.Default,
    val h5: TextStyle = TextStyle.Default,
    val h5Bold: TextStyle = TextStyle.Default,

    val h6Light: TextStyle = TextStyle.Default,
    val h6: TextStyle = TextStyle.Default,
    val h6Bold: TextStyle = TextStyle.Default,
    
    /** Body */
    val bodyLight: TextStyle = TextStyle.Default,
    val body: TextStyle = TextStyle.Default,
    val bodyBold: TextStyle = TextStyle.Default,

    /** Title */
    val titleLight: TextStyle = TextStyle.Default,
    val title: TextStyle = TextStyle.Default,
    val titleBold: TextStyle = TextStyle.Default
)