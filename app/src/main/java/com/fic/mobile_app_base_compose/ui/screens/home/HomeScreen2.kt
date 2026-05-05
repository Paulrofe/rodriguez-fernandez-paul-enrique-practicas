package com.fic.mobile_app_base_compose.ui.screens.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import com.fic.mobile_app_base_compose.R
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.dimensionResource

@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(dimensionResource(id = R.dimen.padding_medium)),
        contentAlignment = Alignment.Center
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            shape = RoundedCornerShape(dimensionResource(id = R.dimen.corner_radius)),
            elevation = CardDefaults.cardElevation(
                defaultElevation = dimensionResource(id = R.dimen.card_elevation)
            )
        ) {
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.imagen_evento),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(dimensionResource(id = R.dimen.image_height)),
                    contentScale = ContentScale.Crop
                )

                Column(
                    modifier = Modifier
                        .padding(dimensionResource(id = R.dimen.padding_medium))
                        .fillMaxWidth()
                ) {
                    Text(
                        text = stringResource(id = R.string.event_title),
                        fontSize = dimensionResource(id = R.dimen.text_title).value.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif
                    )

                    Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacer_small)))

                    Text(
                        text = stringResource(id = R.string.event_date),
                        fontSize = dimensionResource(id = R.dimen.text_info).value.sp,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = FontFamily.Serif
                    )

                    Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacer_small)))

                    Text(
                        text = stringResource(id = R.string.event_location),
                        fontSize = dimensionResource(id = R.dimen.text_info).value.sp,
                        fontWeight = FontWeight.Thin,
                        fontFamily = FontFamily.Serif
                    )

                    Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacer_medium)))

                    Text(
                        text = stringResource(id = R.string.event_price),
                        fontSize = dimensionResource(id = R.dimen.text_info).value.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif
                    )
                }
            }
        }
    }
}




















