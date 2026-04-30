package com.fic.mobile_app_base_compose.ui.screens.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fic.mobile_app_base_compose.R

@Composable
fun HomeScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFF0F4F8)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(dimensionResource(id = R.dimen.padding_large)),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(id =  R.string.home_title),
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1A237E),
                modifier = Modifier.fillMaxWidth().padding(top = 36.dp),
                textAlign = TextAlign.Center
            )
            Text(
                text = "Cargando...",
                fontSize = 16.sp,
                color = Color(0xFF1A237E),
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = dimensionResource(id = R.dimen.padding_main)),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = stringResource(id = R.string.descrip_icon),
                    tint = Color(0xFF1A237E),
                    modifier = Modifier.size(dimensionResource(id = R.dimen.icon_size))
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = stringResource(id = R.string.home_status_account),
                    fontSize = 16.sp
                )
            }

            HorizontalDivider(modifier = Modifier.padding(vertical = 16.dp))

            Column(modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp)) {
                InfoField(label = "Correo", value = "correodeejemplo@gmail.com")
                Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.padding_main)))

                InfoField(label = "Telefono", value = "667-123-4567")
                Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.padding_main)))

                InfoField(label = "Ubicacion", value = "Culiacan, Sin.")
            }

            Spacer(modifier = Modifier.weight(1f))

            Button(
                onClick = {  },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1A237E))
            ) {
                Text(
                    text = stringResource(id = R.string.home_button_next),
                    color = Color.White
                )
            }
        }
    }
}

@Composable
fun InfoField(label: String, value: String) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = label,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 14.sp,
            color = Color.Gray
        )
        Text(
            text = value,
            fontSize = 18.sp,
            color = Color.Black
        )
    }
}