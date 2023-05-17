package com.thiagoaires.aluvery.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thiagoaires.aluvery.model.Product
import com.thiagoaires.aluvery.sampledata.sampleProducts
import com.thiagoaires.aluvery.ui.theme.AluveryTheme

@Composable
fun ProductSection(title: String,
                   products: List<Product>,
                   modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(
            text = title,
            Modifier.padding(
                start = 16.dp,
                end = 16.dp
            ),
            fontSize = 20.sp,
            fontWeight = FontWeight(400),
        )
        LazyRow(
            modifier
                .padding(top = 8.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(horizontal = 16.dp)
        ) {
            items(products){p ->
                ProductItem(product = p)
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun ProductSectionPreview() {
    AluveryTheme {
        Surface {
            ProductSection(title = "Produtos", products = sampleProducts)
        }
    }
}


