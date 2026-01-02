package com.csotiriou.money_logger.overview.impl.overview

import androidx.navigation3.runtime.EntryProviderScope
import com.csotiriou.money_logger.overview.api.OverviewEntry
import com.csotiriou.money_logger.overview.impl.overview.composable.OverviewContent

fun EntryProviderScope<Any>.overviewEntry() {
    entry(OverviewEntry) {
        OverviewContent()
    }
}