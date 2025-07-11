package com.davdrewdev.ResponsiveIcons

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.davdrewdev.ResponsiveIcons.ui.theme.ResponsiveIconsTheme

class MainActivity : ComponentActivity() {

    val sampleItems = listOf(
        Item("Item 1", R.mipmap.ic_launcher),
        Item("Item 2", R.mipmap.ic_expo),
        Item("Item 3", R.mipmap.ic_ahorros),
        Item("Item 3", R.mipmap.ic_card)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ResponsiveIconsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding),
                        contentAlignment = Alignment.Center
                    ) {
                        ItemList(sampleItems)
                    }
                }
            }
        }
    }
}

@Composable
fun ItemList(items: List<Item>) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        items.forEach { item ->
            ItemView(item = item, modifier = Modifier.padding(2.dp))
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    val sampleItems = listOf(
        Item("Item 1", R.mipmap.ic_launcher),
        Item("Item 2", R.mipmap.ic_card),
        Item("Item 3", R.mipmap.ic_expo),
        Item("Item 3", R.mipmap.ic_ahorros)
    )
    ResponsiveIconsTheme {
        ItemList(sampleItems)
    }
}