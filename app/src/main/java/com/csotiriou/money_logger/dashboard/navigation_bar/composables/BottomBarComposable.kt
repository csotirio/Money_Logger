package com.csotiriou.money_logger.dashboard.navigation_bar.composables

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.csotiriou.money_logger.dashboard.navigation_bar.model.BottomBarUiModel
import com.csotiriou.money_logger.dashboard.navigation_bar.model.BottomBarUiSaver

@Composable
fun BottomNavigationBar(
    modifier: Modifier = Modifier,
    backstack: SnapshotStateList<Any>
) {

    //TODO I NEED TO MOVE THIS LOGIC TO THE VIEWMODEL
    var selectedBottomBarItem: BottomBarUiModel by rememberSaveable(
        stateSaver = BottomBarUiSaver
    ) { mutableStateOf(BottomBarUiModel.Overview) }

    NavigationBar(
        modifier = modifier,
    ) {
        BottomBarUiModel.getItems().forEach { bottomBarItem ->
            NavigationBarItem(
                selected = selectedBottomBarItem == bottomBarItem,
                icon = {
                    Icon(
                        painter = painterResource(bottomBarItem.iconRes),
                        contentDescription = null
                    )
                },
                label = { Text(text = stringResource(bottomBarItem.titleRes)) },
                onClick = {
                    if (backstack.lastOrNull() != bottomBarItem.navigationRoute) {
                        if (backstack.lastOrNull() in BottomBarUiModel.getItems().map { it.navigationRoute }) {
                            backstack.removeAt(backstack.lastIndex)
                        }
                        selectedBottomBarItem = bottomBarItem
                        backstack.add(bottomBarItem.navigationRoute)
                    }
                }
            )
        }
    }
}