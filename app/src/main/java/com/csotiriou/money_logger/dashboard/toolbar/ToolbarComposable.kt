package com.csotiriou.money_logger.dashboard.toolbar

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.csotiriou.money_logger.design_system.theme.MoneyLoggerTheme
import com.csotiriou.money_logger.resources.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Toolbar(
    modifier: Modifier = Modifier
){
    TopAppBar(
        modifier = modifier.fillMaxWidth(),
        title = { Text("Dashboard") },
        colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.Red),
        navigationIcon = { Icon(painter = painterResource(R.drawable.ic_arrow_back), contentDescription = null) }
    )
}

@Composable
@Preview
fun ToolbarPreview(){
    MoneyLoggerTheme {
        Toolbar(modifier = Modifier.fillMaxWidth())
    }
}