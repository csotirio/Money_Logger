package com.csotiriou.money_logger.dashboard.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.ui.NavDisplay
import com.csotiriou.money_logger.core.resources.R
import com.csotiriou.money_logger.dashboard.dummy_data.DummyComposable
import com.csotiriou.money_logger.dashboard.navigation_bar.composables.BottomNavigationBar
import com.csotiriou.money_logger.features.accounts.impl.accountsEntry
import com.csotiriou.money_logger.features.overview.api.OverviewEntry
import com.csotiriou.money_logger.features.overview.impl.overview.overviewEntry

data object TransactionsEntry : NavKey
data object BudgetEntry : NavKey
data object AnalyticsEntry : NavKey

@Composable
fun DashboardScreen() {
    val backStack = remember { mutableStateListOf<Any>(OverviewEntry) }
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            BottomNavigationBar(backstack = backStack)
        },
    ) { contentPadding ->
        NavDisplay(
            backStack = backStack,
            modifier = Modifier.fillMaxSize().padding(contentPadding),
            onBack = { backStack.removeLastOrNull() },
            entryProvider = entryProvider {
                overviewEntry()
                accountsEntry()
                entry(TransactionsEntry) {
                    DummyComposable(stringResource(R.string.transactions_title))
                }
                entry(BudgetEntry) {
                    DummyComposable(stringResource(R.string.budget_title))
                }
                entry(AnalyticsEntry) {
                    DummyComposable(stringResource(R.string.analytics_title))
                }
            }
        )
    }
}


