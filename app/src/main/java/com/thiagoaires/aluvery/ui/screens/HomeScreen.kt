package com.thiagoaires.aluvery.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.thiagoaires.aluvery.sampledata.sampleProducts
import com.thiagoaires.aluvery.ui.components.ProductSection
import com.thiagoaires.aluvery.ui.theme.AluveryTheme

@Composable
fun HomeScreen() {
    AluveryTheme {
        Surface {
            Column(
                Modifier
                    .fillMaxSize()
                    .verticalScroll(
                        rememberScrollState()

                    ),
                verticalArrangement = Arrangement.spacedBy(16.dp)

            ) {
                Spacer(Modifier)
                ProductSection(title = "Promocoes", productList = sampleProducts)
                ProductSection(title = "Doces", productList = sampleProducts)
                Spacer(Modifier)
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}
