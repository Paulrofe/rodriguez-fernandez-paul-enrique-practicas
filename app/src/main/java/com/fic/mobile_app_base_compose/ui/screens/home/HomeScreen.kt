package com.fic.mobile_app_base_compose.ui.screens.home

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFF0F4F8) // Cambio visual 1: Fondo con un tono grisáceo azulado
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Bienvenido a Mi App",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1A237E) // Cambio visual 2: Color de título personalizado
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Esta es la pantalla principal de entrada.",
                fontSize = 18.sp,
                color = Color.Gray
            )

            Spacer(modifier = Modifier.height(32.dp))

            Button(
                onClick = { /* Acción futura */ },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1A237E))
            ) {
                Text(text = "Comenzar Exploración", color = Color.White)
            }
        }
    }
}