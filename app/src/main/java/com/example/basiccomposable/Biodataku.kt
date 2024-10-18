package com.example.basiccomposable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Biodataku(modifier: Modifier = Modifier) {
    Column  (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 50.dp)
            .background(color = Color(0xFFDCDCDC))
    )
    {
        Text("Login", fontSize = 50.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.padding(5.dp))
        Text("Ini adalah halaman login", fontSize = 30.sp)
        Spacer(modifier = Modifier.padding(5.dp))
        Image(
            painter = painterResource(id = R.drawable.img_1),
            contentDescription = "",
            modifier = Modifier.clip(CircleShape).size(200.dp)
            
        )


    }

}