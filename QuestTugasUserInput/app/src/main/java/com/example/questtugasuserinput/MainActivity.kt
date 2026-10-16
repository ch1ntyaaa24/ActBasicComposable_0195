package com.example.questtugasuserinput

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.questtugasuserinput.ui.theme.QuestTugasUserInputTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent { BiodataScreen() }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BiodataScreen() {
    var firstName by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var birthDate by remember { mutableStateOf("") }
    var experience by remember { mutableStateOf("") }
    var android by remember { mutableStateOf(false) }
    var uiux by remember { mutableStateOf(false) }
    var web by remember { mutableStateOf(false) }

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuestTugasUserInputTheme {
        Greeting("Android")
    }
}