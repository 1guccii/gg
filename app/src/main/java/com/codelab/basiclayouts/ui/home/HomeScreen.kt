package com.codelab.basiclayouts.ui.home

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.codelab.basiclayouts.R
import com.codelab.basiclayouts.SearchBar
import com.codelab.basiclayouts.ui.home.element.HomeSection
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.graphics.Color
import com.codelab.basiclayouts.ui.home.element.AlignYourBodyNow
import com.codelab.basiclayouts.ui.home.element.FavoriteCollectionCardGrid

@Composable
fun HomeScreen(modifier: Modifier = Modifier
    .background(Color(0xFFF5F0EE))
    .fillMaxSize()) {
    Column(
        modifier
            .verticalScroll(rememberScrollState())
    ) {
        Spacer(Modifier.height(16.dp))
        SearchBar(Modifier.padding(horizontal = 16.dp))
        HomeSection(title = R.string.align_your_body) {
            AlignYourBodyNow()
        }
        HomeSection(title = R.string.favorite_collections) {
            FavoriteCollectionCardGrid()
        }
        Spacer(Modifier.height(16.dp))
    }
}