package com.angelika.jetpackcomposelesson3.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.angelika.jetpackcomposelesson3.ui.manhwa.Screen
import com.angelika.jetpackcomposelesson3.ui.theme.DarkBlue1
import com.angelika.jetpackcomposelesson3.ui.theme.JetpackComposeLesson3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeLesson3Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Screen(modifier = Modifier.fillMaxSize())
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ScreenPreview() {
    Screen(
        modifier = Modifier
            .fillMaxSize()
            .background(DarkBlue1)
            .padding(14.dp)
    )
}