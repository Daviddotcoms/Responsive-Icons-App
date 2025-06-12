package com.davdrewdev.ResponsiveIcons

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class Item(val title: String, val imageResId: Int)

@Composable
fun ItemView(item: Item, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = item.imageResId),
            contentDescription = "Item Icon",
            modifier = Modifier.height(60.dp).width(60.dp)
        )
        Text(
            text = item.title,
            fontSize = 10.sp,
            modifier = Modifier.offset(y = (-10).dp)
        )
    }
}
