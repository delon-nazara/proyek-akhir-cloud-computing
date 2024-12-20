package com.example.proyekakhircloudcomputing.ui.screen.archive

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.proyekakhircloudcomputing.R

@Preview
@Composable
fun SettingScreenOld(navigateToHome: () -> Unit = {}) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF4F2DE)) // Warna latar belakang utama
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 32.dp, bottom = 80.dp), // Ruang untuk BottomBarOld
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Header "Pengaturan"
            Box(
                modifier = Modifier
                    .wrapContentWidth()
                    .clip(RoundedCornerShape(50.dp))
                    .background(Color(0xFFF2A73B)) // Warna header
                    .padding(horizontal = 24.dp, vertical = 8.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "PENGATURAN",
                    fontSize = 20.sp,
                    color = Color.White
                )
            }

            Spacer(modifier = Modifier.height(32.dp))

            // Frame di sekitar gambar profil
            Box(
                modifier = Modifier
                    .size(140.dp) // Ukuran frame sedikit lebih besar dari gambar
                    .clip(RoundedCornerShape(16.dp)) // Membuat sudut frame membulat
                    .background(Color(0xFFF2A73B)), // Warna frame (orange dari colors.xml)
                contentAlignment = Alignment.Center
            ) {
                // Gambar profil
                Image(
                    painter = painterResource(id = R.drawable.arkan), // Ganti dengan resource gambar Anda
                    contentDescription = "Profile Picture",
                    modifier = Modifier
                        .size(120.dp) // Ukuran gambar
                        .clip(RoundedCornerShape(16.dp))
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Username
            Text(
                text = "@arkan",
                fontSize = 18.sp,
                color = Color(0xFFF2A73B)
            )
        }

        // BottomBarOld di bagian bawah
        BottomBarOld(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth(),
            onHomeClick = navigateToHome, // Menggunakan navigasi ke MainActivity
            onSettingsClick = { /* Stay on the current page */ }
        )
    }
}