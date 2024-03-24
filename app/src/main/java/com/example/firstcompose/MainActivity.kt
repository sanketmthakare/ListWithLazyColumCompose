package com.example.firstcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstcompose.ui.theme.FirstComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            previewItem()
        }
    }
}


@Preview(showBackground = true, name = "Hello Msg", showSystemUi = true)
@Composable
private fun previewFunction() {
    Column {
        ListItem(R.drawable.ic_launcher_background,"Sanket Thakare","Android Developer",Modifier)
        ListItem(R.drawable.ic_launcher_background,"Sanket Thakare","Android Developer",Modifier)
        ListItem(R.drawable.ic_launcher_background,"Sanket Thakare","Android Developer",Modifier)
        ListItem(R.drawable.ic_launcher_background,"Sanket Thakare","Android Developer",Modifier)
    }
}

@Composable
fun ListItem(imageId: Int, name: String, occupation: String,modifier: Modifier) {
    Row (modifier.padding(8.dp)){
        Image(
            painter = painterResource(
                id = imageId
            ),
            contentDescription = "temp",
            Modifier.size(40.dp)
        )
        Column() {
            Text(
                text = name,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = occupation,
                fontWeight = FontWeight.Thin
            )
        }
    }
}

