package com.codelab.basiclayouts.ui.home.element

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.PestControlRodent
import androidx.compose.material.icons.filled.Spa
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.codelab.basiclayouts.R

@Composable
fun SootheBottomNavigation(modifier: Modifier = Modifier) {
    NavigationBar(
        containerColor = MaterialTheme.colorScheme.surfaceVariant,
        modifier = modifier
    ) {
        NavigationBarItem(
            selected = true,
            onClick = { /*TODO*/ },
            icon = {
                Icon(imageVector = Icons.Default.Home, contentDescription =null )
            },
            label = { Text(text = stringResource(id = R.string.bottom_navigation_home)) }
        )
        NavigationBarItem(
            selected = false,
            onClick = { /*TODO*/ },
            icon = {
                Icon(imageVector = Icons.Default.PestControlRodent, contentDescription =null )
            },
            label = { Text(text = stringResource(id = R.string.bottom_navigation_profile)) }
        )
    }
}

@Preview
@Composable
private fun Preview() {
    SootheBottomNavigation()
}