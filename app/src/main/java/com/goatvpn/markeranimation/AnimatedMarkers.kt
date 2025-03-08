package com.goatvpn.markeranimation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.google.android.gms.maps.model.LatLng

@Composable
fun MapOverlayScope.AnimatedMarkers(position: LatLng) {

    Box(
        modifier = Modifier
            .align(Alignment.Center)
            .offset { position.toPx() }
            .background(color = Color.White, CircleShape)
            .size(15.dp)
            .doublePulseEffect(
                targetScale = 2f,
                brush = SolidColor(Color(0xFF0080FF))
            )
    )

}