package com.codelab.basiclayouts.ui.home.element

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun FavoriteCollectionCard(
    @DrawableRes imageIdRes: Int,
    @StringRes stringIdRes: Int,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = Modifier,
        shape = MaterialTheme.shapes.medium,
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier.width(255.dp)
        ) {
            Image(
                painter = painterResource(imageIdRes),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = modifier.size(80.dp)
                )
            Text(
                text = stringResource(stringIdRes),
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}
