package com.thiagoaires.aluvery.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.thiagoaires.aluvery.model.Product
import com.thiagoaires.aluvery.sampledata.sampleProducts
import com.thiagoaires.aluvery.sampledata.sampleSections
import com.thiagoaires.aluvery.ui.components.CardProductItem
import com.thiagoaires.aluvery.ui.components.ProductSection
import com.thiagoaires.aluvery.ui.components.SearchTextField
import com.thiagoaires.aluvery.ui.theme.AluveryTheme

@Composable
fun HomeScreen(
    sections: Map<String, List<Product>>, searchText: String = ""
) {
    var text by remember { mutableStateOf(searchText) }
    Column {
        val sampleFilter = remember(text){
            if(text.isNotBlank()){
                sampleProducts.filter {product ->
                    product.name.contains(text, ignoreCase = true) ||
                            product.description?.contains(text) ?: false
                }
            } else emptyList()
        }
        SearchTextField(searchTextField = text, onSearchChange = {
            text = it
        })
        LazyColumn(
            Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(bottom = 16.dp)
        ) {
            if (text.isBlank()) {
                item {
                    for (section in sections) {
                        val title = section.key
                        val product = section.value
                        ProductSection(title = title, products = product)
                    }
                }
            } else {

                items(sampleFilter) { p ->
                    CardProductItem(product = p, modifier = Modifier.padding(horizontal = 16.dp))

                }
            }

        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun HomeScreenWithSearchPreview() {
    AluveryTheme {
        Surface {
            HomeScreen(sampleSections, searchText = "a")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    AluveryTheme {
        Surface {
            HomeScreen(sampleSections)
        }
    }
}



