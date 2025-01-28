package com.uniandes.estrenya.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen

class HomeScreen : Screen {

    @Composable
    override fun Content() {
        HomeContent()
    }

}

@Composable
fun HomeContent() {
    Text(text = "Bienvenido a HomeScreen")
}
