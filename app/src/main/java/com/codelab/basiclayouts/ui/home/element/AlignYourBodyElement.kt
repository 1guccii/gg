package com.codelab.basiclayouts.ui.home.element

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun AlignYourBodyElement(
    @DrawableRes imageId: Int,
    @StringRes stringId: Int,
    modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Image(
            painter = painterResource(id = imageId),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = modifier
                .size(88.dp)
                .clip(CircleShape)
            )
        Text(
            text = stringResource(id = stringId),
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.paddingFromBaseline(top = 24.dp, bottom = 8.dp)
            )
    }
}

@Preview
@Composable
private fun AlignYourBodyElementPreview() {
    MaterialTheme {
        Surface {

        }
    }
}