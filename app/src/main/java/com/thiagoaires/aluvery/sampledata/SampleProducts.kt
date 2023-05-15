package com.thiagoaires.aluvery.sampledata

import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import com.thiagoaires.aluvery.R
import com.thiagoaires.aluvery.model.Product
import java.math.BigDecimal

val sampleProducts = listOf<Product>(
    Product(
        name = LoremIpsum(38).values.first(),
        image = R.drawable.burger,
        price = BigDecimal("12.40")
    ),
    Product(
        name = LoremIpsum(38).values.first(),
        image = R.drawable.fries,
        price = BigDecimal("22.40")
    ),
    Product(
        name = LoremIpsum(38).values.first(),
        image = R.drawable.pizza,
        price = BigDecimal("162.40")
    )
)
