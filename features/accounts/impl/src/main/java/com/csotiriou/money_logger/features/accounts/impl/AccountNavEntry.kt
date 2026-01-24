package com.csotiriou.money_logger.features.accounts.impl

import androidx.navigation3.runtime.EntryProviderScope
import com.csotiriou.money_logger.features.accounts.api.AccountsEntry
import com.csotiriou.money_logger.features.accounts.impl.composables.AccountContent

fun EntryProviderScope<Any>.accountsEntry() {
    entry(AccountsEntry) {
        AccountContent()
    }
}