package com.fatec.testeyuri.ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Resultado(resultado: String, modifier: Modifier = Modifier) {
    Text(
        text = resultado,
        modifier = modifier
    )
}