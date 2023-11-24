package com.angelika.jetpackcomposelesson3.ui.manhwa

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.KeyboardArrowRight
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.angelika.jetpackcomposelesson3.R
import com.angelika.jetpackcomposelesson3.ui.theme.DarkBlue1
import com.angelika.jetpackcomposelesson3.ui.theme.DarkBlue2
import com.angelika.jetpackcomposelesson3.ui.theme.DarkGrey
import com.angelika.jetpackcomposelesson3.ui.theme.Grey
import com.angelika.jetpackcomposelesson3.ui.theme.LightGrey

@Composable
fun Screen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(DarkBlue1)
            .padding(14.dp)
    ) {
        Column(modifier = Modifier.padding(top = 20.dp)) {
            UserInfo()
            Search()
            ManhwasListColumn()
        }
    }
}

@Composable
fun UserInfo(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
    ) {
        Row {
            Image(
                modifier = Modifier
                    .width(60.dp)
                    .height(60.dp)
                    .clip(CircleShape),
                painter = painterResource(id = R.drawable.image_dog),
                contentDescription = stringResource(
                    R.string.content_description_user_profile_photo
                ),
            )
            Column(
                modifier = Modifier
                    .padding(top = 2.dp, start = 6.dp)
            ) {
                Text(
                    modifier = Modifier,
                    text = stringResource(R.string.text_welcome_back),
                    color = DarkGrey,
                    fontSize = 12.sp
                )
                Text(
                    modifier = Modifier.padding(top = 4.dp),
                    text = stringResource(R.string.user_name_li_angelika),
                    color = Color.White,
                    fontSize = 16.sp
                )
            }
        }
        Icon(
            modifier = Modifier
                .align(Alignment.CenterEnd),
            painter = painterResource(id = R.drawable.ic_notifications),
            contentDescription = stringResource(
                R.string.content_description_notifications
            ),
            tint = LightGrey
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Search(modifier: Modifier = Modifier) {
    var text by remember {
        mutableStateOf("")
    }

    TextField(
        modifier = modifier
            .padding(top = 20.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(10.dp)),
        value = text,
        onValueChange = { newText ->
            text = newText
        },
        colors = TextFieldDefaults.textFieldColors(
            textColor = Color.White,
            unfocusedIndicatorColor = DarkBlue2,
            containerColor = DarkBlue2
        ),
        leadingIcon = {
            Icon(
                painter = painterResource(id = R.drawable.ic_search),
                contentDescription = stringResource(
                    R.string.content_description_search_icon
                ),
                tint = Grey
            )
        },
        label = {
            Text(text = stringResource(R.string.text_search))
        },
        trailingIcon = {
            Icon(
                painter = painterResource(id = R.drawable.ic_filter),
                contentDescription = stringResource(R.string.content_description_filter_icon),
                tint = Grey
            )
        }
    )
}

@Composable
fun ContainerSeeAll(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .padding(top = 24.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = stringResource(R.string.txet_4suggestions_for_you),
            fontSize = 18.sp,
            color = Color.White
        )
        Spacer(modifier = Modifier.weight(1f))
        Text(
            modifier = Modifier.padding(top = 4.dp),
            text = stringResource(R.string.text_see_all),
            fontSize = 12.sp,
            color = Color.White
        )
        Icon(
            imageVector = Icons.Sharp.KeyboardArrowRight,
            contentDescription = stringResource(R.string.content_description_arrow),
            tint = Color.White
        )
    }
}

@Composable
fun TheBestTours(modifier: Modifier = Modifier) {
    Text(
        text = stringResource(R.string.text_the_best_manhwa),
        fontSize = 18.sp,
        color = Color.White
    )
}

@Preview
@Composable
fun Preview(){
    Screen()
}