package com.csotiriou.money_logger.features.overview.impl.overview

import androidx.navigation3.runtime.EntryProviderScope
import com.csotiriou.money_logger.features.overview.api.OverviewEntry
import com.csotiriou.money_logger.features.overview.impl.overview.composable.OverviewContent

fun EntryProviderScope<Any>.overviewEntry() {
    entry(OverviewEntry) {
        OverviewContent()
    }
}