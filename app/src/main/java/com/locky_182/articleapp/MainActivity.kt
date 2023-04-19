package com.locky_182.articleapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.locky_182.articleapp.ui.theme.ArticleAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArticleAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ArticleApp()
                    
                }
            }
        }
    }
}

@Composable
fun ArticleApp(){
    ArticleAppData(image = painterResource(id = R.drawable.bg_compose_background),
        title = stringResource(id = R.string.title),
        miniDesc = stringResource(id = R.string.miniDesc),
        bigDesc = stringResource(id = R.string.bigDesc))
}

@Composable
fun ArticleAppData(
    image: Painter,
    title: String,
    miniDesc: String,
    bigDesc: String,
    modifier: Modifier = Modifier
){
    Column(modifier = modifier){
        Image(painter = image, contentDescription = null )
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = miniDesc,
            modifier = Modifier.padding(start = 16.dp,end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = bigDesc,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)

        )
        
        
        
    }
    
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ArticleAppTheme {
        ArticleApp()
        
    }
}