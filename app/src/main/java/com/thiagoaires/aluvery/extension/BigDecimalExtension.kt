package com.thiagoaires.aluvery.extension

import java.math.BigDecimal
import java.text.NumberFormat
import java.util.Locale

fun BigDecimal.toBRL() : String{
    return NumberFormat.getCurrencyInstance(Locale("pt", "br")).format(this)
}