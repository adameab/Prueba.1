package com.example.prueba1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.prueba1.ui.theme.ComposePureba1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Prueba1()
        }
    }
}

@Composable
@Preview
fun Prueba1(){

    Column(modifier = Modifier.padding(all = 50.dp)) {
        Row(){
            Text(text = "Fila 1")
            Spacer(modifier = Modifier.width(40.dp))
            Text(text = "Fila 2")
        }
        Text(text = "hola clase de DAM")
        Text(text = "Esta sería la segunda columna")
    }
}
@Composable
@Preview
fun Prueba1Preview(){
    Prueba1()
}




