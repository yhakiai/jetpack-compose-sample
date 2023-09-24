package com.example.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // コンポーズ可能な関数を呼び出し
            MessageCard("Android")
        }
    }
}

// コンポーズ可能な関数を定義
@Composable
fun MessageCard(name: String) {
    Text(text = "Hello $name!",
        // 背景色を指定する
        modifier = Modifier.background(
            color = Color(0xffffffff)
        )
    )
}

@Preview
@Composable
fun PreviewMessageCard() {
    MessageCard("Android")
}