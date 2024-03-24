package com.example.firstcompose

import android.icu.text.CaseMap.Title
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(heightDp = 500)
@Composable
fun previewItem() {
    LazyColumn(content = {
        items(getCategoryList()) { item ->
            BlogCategory(img = item.image, title = item.title, subtitle = item.subtitle)
        }
    })
}


@Composable
fun BlogCategory(img: Int, title: String, subtitle: String) {
    Card(
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        ), modifier = Modifier.padding(8.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(8.dp)) {
            Image(
                painter = painterResource(id = img),
                contentDescription = "",
                modifier = Modifier
                    .size(48.dp)
                    .padding(8.dp)
                    .weight(.2f)

            )
            ItemDescription(title, subtitle, Modifier.weight(.8f))

        }

    }

}

@Composable
private fun ItemDescription(title: String, subtitle: String, modifier: Modifier) {
    Column(modifier = modifier) {
        Text(
            text = title,
            style = MaterialTheme.typography.bodyMedium
        )
        Text(
            text = subtitle,
            style = MaterialTheme.typography.bodySmall,
            fontWeight = FontWeight.Thin
        )
    }
}

data class Category(val image: Int, val title: String, val subtitle: String)


fun getCategoryList(): MutableList<Category> {
    val list = mutableListOf<Category>()
    list.add(Category(R.drawable.ic_launcher_background, "Sanket", "Senior Android Developer"))
    list.add(Category(R.drawable.ic_launcher_background, "Sam", "Android Developer"))
    list.add(Category(R.drawable.ic_launcher_background, "Tom", "Android Developer"))
    list.add(Category(R.drawable.ic_launcher_background, "Hanks", "Senior Android Developer"))
    list.add(Category(R.drawable.ic_launcher_background, "Jeffy", "Senior Android Developer"))
    list.add(Category(R.drawable.ic_launcher_background, "Sanket", "Senior Android Developer"))
    list.add(Category(R.drawable.ic_launcher_background, "Sam", "Android Developer"))
    list.add(Category(R.drawable.ic_launcher_background, "Tom", "Android Developer"))
    list.add(Category(R.drawable.ic_launcher_background, "Hanks", "Senior Android Developer"))
    list.add(Category(R.drawable.ic_launcher_background, "Jeffy", "Senior Android Developer"))
    return list
}
