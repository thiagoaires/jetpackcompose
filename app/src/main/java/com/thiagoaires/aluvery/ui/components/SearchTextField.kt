package com.thiagoaires.aluvery.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SearchTextField(searchTextField: String, onSearchChange: (String) -> Unit) {
    OutlinedTextField(value = searchTextField,
        onValueChange = { newValue ->
            onSearchChange(newValue)
        },
        shape = RoundedCornerShape(50.dp),
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        leadingIcon = {
            Icon(Icons.Default.Search, contentDescription = "Icone de lupa")
        },
        label = {
            Text("Produto")
        },
        placeholder = {
            Text(text = "O que você procura?")
        })
}