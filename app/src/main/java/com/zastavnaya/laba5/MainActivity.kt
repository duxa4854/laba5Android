package com.zastavnaya.laba5

import ads_mobile_sdk.h4
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zastavnaya.laba5.ui.theme.Laba5Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        TitleText()
        ColorRow()
        NestedContainer()
    }
}

@Composable
fun TitleText() {
    Text(
        text = "Пример Состав-приложения\nRow, Column, Size, ARGB",
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    )
}

@Composable
fun ColorRow() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        ColorBox(color = Color(0xFFFF0000)) // Красный (непрозрачный)
        ColorBox(color = Color(0x8000FF00)) // Зелёный (полупрозрачный — 50%)
        ColorBox(color = Color(0xFF0000FF)) // Синий (непрозрачный)
    }
}

@Composable
fun ColorBox(color: Color) {
    Box(
        modifier = Modifier
            .size(80.dp)
            .background(color)
    )
}

@Composable
fun NestedContainer() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .background(Color(0x33000000))
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("Левая колонка", color = Color.White, fontSize = 14.sp)
                Text("Текст 1", color = Color.White, fontSize = 12.sp)
            }
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("Правая колонка", color = Color.White, fontSize = 14.sp)
                Text("Текст 2", color = Color.White, fontSize = 12.sp)
            }
        }
    }
}
//            Scaffold(
//                topBar ={
//                    TopAppBar(
//                        title = {Text(text = "Scaffold example")}
//                    )
//                },
//                floatingActionButton = {
//                    FloatingActionButton(onClick =  { }){
//                        Text(text = "+")
//                    }
//                }
//            ) {paddingValues ->
//                Column(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .padding(paddingValues),
//                    verticalArrangement = Arrangement.Center,
//                    horizontalAlignment = Alignment.CenterHorizontally
//                ) {
//                    Text(text = "Основное содержимое экрана")
//                }
//            }
//            Column(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .background(Color.White)
//                    .padding(16.dp),
//                verticalArrangement = Arrangement.SpaceEvenly,
//                horizontalAlignment = Alignment.CenterHorizontally
//            ) {
//                Box(
//                    modifier = Modifier
//                        .size(100.dp)
//                        .background(Color(0xFFFF0000))
//                )
//                Box(
//                    modifier = Modifier
//                        .size(100.dp)
//                        .background(Color(0x80FF0000))
//                )
//            }
//            val symbols = "Hello world".filter { it.isLetter() }
//            Column(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .padding(top = 48.dp, start = 16.dp, end = 16.dp)
//                    .background(color = Color.Green),
//                verticalArrangement = Arrangement.SpaceEvenly,
//                horizontalAlignment = Alignment.CenterHorizontally
//            ) {
//                Row(
//                    modifier = Modifier.fillMaxWidth(),
//                    horizontalArrangement = Arrangement.SpaceEvenly
//                ) {
//                    for (char in symbols)
//                        Text(
//                            text = char.toString(),
//                            fontWeight = FontWeight.ExtraBold,
//                            color = Color.Blue,
//                            fontSize = 20.sp,
//                            letterSpacing = 24.sp
//                        )
//                    }
//                    Spacer(modifier = Modifier.height(16.dp))
//                    Row(
//                        modifier = Modifier.fillMaxWidth(),
//                        horizontalArrangement = Arrangement.SpaceEvenly
//                    ) {
//                        for (char in symbols.reversed()) {
//                            Text(
//                                text = char.toString(),
//                                fontWeight = FontWeight.ExtraBold,
//                                color = Color.Red,
//                                fontSize = 20.sp,
//                                letterSpacing = 24.sp
//                            )
//                        }
//                    }
//                }








