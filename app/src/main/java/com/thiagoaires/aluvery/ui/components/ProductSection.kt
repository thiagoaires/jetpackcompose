package com.thiagoaires.aluvery.ui.components

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thiagoaires.aluvery.model.Product
import com.thiagoaires.aluvery.sampledata.sampleProducts

@Composable
fun ProductSection(title: String, productList: List<Product>) {
    Column() {
        Text(
            text = title,
            Modifier.padding(start = 16.dp),
            fontSize = 20.sp,
            fontWeight = FontWeight(700),
        )
        Row(
            Modifier
                .padding(top = 8.dp)
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Spacer(modifier = Modifier)
            for (p in productList) {
                ProductItem(product = p)
            }
            Spacer(modifier = Modifier)
        }
    }

}

@Preview(showBackground = true)
@Composable
fun ProductSectionPreview() {
    ProductSection(title = "Produtos", productList = sampleProducts)
}


