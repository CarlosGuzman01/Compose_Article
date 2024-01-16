package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Title(stringResource(id = R.string.title), stringResource(id = R.string.first_paragraph),
                        stringResource(id = R.string.second_paragraph))

                }
            }
        }
    }
}

@Composable
fun Title(title: String, firstParagraph: String, secondParagraph: String,  modifier: Modifier = Modifier) {

    val painter = painterResource(id = R.drawable.compose_image)

    Column{
        Image(
            painter = painter,
            contentDescription = null,
        )
        Text(
            text = title,
            modifier = modifier.padding(16.dp),
            fontSize = 24.sp

        )
        Text(
            text = firstParagraph,
            modifier = modifier.padding(
                start = 16.dp,
                end = 16.dp
            ),
            textAlign = TextAlign.Justify

        )
        Text(
            text = secondParagraph,
            modifier = modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeArticleTheme {
        Title(stringResource(id = R.string.title), stringResource(id = R.string.first_paragraph),
            stringResource(id = R.string.second_paragraph))

    }
}