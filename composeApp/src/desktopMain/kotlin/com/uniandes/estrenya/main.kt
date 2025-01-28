package com.uniandes.estrenya

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.uniandes.estrenya.ui.App

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "EstrenYa",
    ) {
        App()
    }
}