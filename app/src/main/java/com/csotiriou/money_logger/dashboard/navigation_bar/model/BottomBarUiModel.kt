package com.csotiriou.money_logger.dashboard.navigation_bar.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.runtime.saveable.Saver
import androidx.navigation3.runtime.NavKey
import com.csotiriou.money_logger.dashboard.screen.AccountsEntry
import com.csotiriou.money_logger.dashboard.screen.AnalyticsEntry
import com.csotiriou.money_logger.dashboard.screen.BudgetEntry
import com.csotiriou.money_logger.dashboard.screen.TransactionsEntry
import com.csotiriou.money_logger.overview.api.OverviewEntry
import com.csotiriou.money_logger.resources.R
import kotlinx.serialization.Serializable

@Serializable
sealed class BottomBarUiModel(
    @param:DrawableRes val iconRes: Int,
    @param:StringRes val titleRes: Int,
    val navigationRoute: NavKey
) {
    @Serializable
    data object Overview : BottomBarUiModel(
        iconRes = R.drawable.ic_analytics,
        titleRes = R.string.overview_title,
        navigationRoute = OverviewEntry
    )

    @Serializable
    data object Accounts : BottomBarUiModel(
        iconRes = R.drawable.ic_wallet,
        titleRes = R.string.accounts_title,
        navigationRoute = AccountsEntry
    )

    @Serializable
    data object Transactions : BottomBarUiModel(
        iconRes = R.drawable.ic_transactions,
        titleRes = R.string.transactions_title,
        navigationRoute = TransactionsEntry
    )

    @Serializable
    data object Budget : BottomBarUiModel(
        iconRes = R.drawable.ic_budget,
        titleRes = R.string.budget_title,
        navigationRoute = BudgetEntry
    )

    @Serializable
    data object Analytics : BottomBarUiModel(
        iconRes = R.drawable.ic_analytics,
        titleRes = R.string.analytics_title,
        navigationRoute = AnalyticsEntry
    );
    companion object {
        fun getItems() = listOf(
            Accounts,
            Budget,
            Overview,
            Transactions,
            Analytics
        )
    }
}

val BottomBarUiSaver = Saver<BottomBarUiModel, String>(
    save = { it::class.simpleName ?: BottomBarUiModel.Overview::class.simpleName },
    restore = {
        when (it) {
            BottomBarUiModel.Overview::class.simpleName -> BottomBarUiModel.Overview
            BottomBarUiModel.Accounts::class.simpleName -> BottomBarUiModel.Accounts
            BottomBarUiModel.Transactions::class.simpleName -> BottomBarUiModel.Transactions
            BottomBarUiModel.Budget::class.simpleName -> BottomBarUiModel.Budget
            BottomBarUiModel.Analytics::class.simpleName -> BottomBarUiModel.Analytics
            else -> BottomBarUiModel.Overview
        }
    }
)