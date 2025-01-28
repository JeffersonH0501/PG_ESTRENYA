package com.uniandes.estrenya.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import org.jetbrains.compose.ui.tooling.preview.Preview

class LoginScreen : Screen {

    @Composable
    override fun Content() {
        LoginContent()
    }

}

@Preview
@Composable
fun LoginContent() {
    val navigator = LocalNavigator.currentOrThrow

    Column {
        Text(text = "Bienvenido a LoginScreen")
        Button(onClick = {
            navigator.push(HomeScreen())
        }) {
            Text("Ir al HomeScreen")
        }
    }
}
