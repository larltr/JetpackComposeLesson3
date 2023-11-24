package com.angelika.jetpackcomposelesson3.ui.manhwa

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.angelika.jetpackcomposelesson3.R
import com.angelika.jetpackcomposelesson3.data.model.Manhwa
import com.angelika.jetpackcomposelesson3.ui.theme.DarkBlue1
import com.angelika.jetpackcomposelesson3.ui.theme.DarkBlue2
import com.angelika.jetpackcomposelesson3.ui.theme.Yellow
import com.angelika.jetpackcomposelesson3.ui.theme.transparentBlack

@Composable
fun ManhwasListColumn() {

    val manhwas = remember {
        mutableStateListOf(
            Manhwa(
                name = "Dark Moon",
                author = "H",
                rating = 9.43,
                releaseDate = 15,
                lastRealise = 24,
                month = "Oct",
                year = 2023,
                money = 1800,
                image = "https://sun9-27.userapi.com/impg/1WkMpUCtvef-8ppdT3T5p846j15mpXonSKZuRQ/mRANqw4-w0A.jpg?size=687x451&quality=96&sign=83a6c3fd3a7e82dfb490fb3ea43b1048&type=album"
            )
        )
    }

    fillManhwasList(manhwas)

    LazyColumn(
        modifier = Modifier,
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        item {
            ContainerSeeAll(modifier = Modifier)
        }
        item {
            LazyRow(
                modifier = Modifier
                    .padding(top = 20.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                items(manhwas) {
                    ManhwaItem1(manhwa = it)
                }
            }
        }
        item {
            TheBestTours(modifier = Modifier.padding(top = 26.dp))
        }
        items(manhwas) {
            ManhwaItem2(modifier = Modifier.fillMaxWidth(), manhwa = it)
        }
    }
}

fun fillManhwasList(manhwa: SnapshotStateList<Manhwa>) = with(manhwa) {
    add(
        Manhwa(
            name = "One princess",
            author = "P",
            rating = 9.74,
            releaseDate = 5,
            lastRealise = 29,
            month = "Apr",
            year = 2023,
            money = 2000,
            image = "https://pm1.aminoapps.com/7742/38219c9235dc7df525720ded977766ec0df10e01r1-736-1309v2_hq.jpg"
        )
    )
    add(
        Manhwa(
            name = "True love",
            author = "K",
            rating = 9.72,
            releaseDate = 12,
            lastRealise = 13,
            month = "Apr",
            year = 2022,
            money = 1500,
            image = "https://i.pinimg.com/originals/07/55/b1/0755b11465174254879d6878ec804837.jpg"
        )
    )
    add(
        Manhwa(
            name = "Loop",
            author = "R",
            rating = 9.62,
            releaseDate = 19,
            lastRealise = 30,
            month = "March",
            year = 2023,
            money = 1200,
            image = "https://sun9-64.userapi.com/impg/7NJXnRdbSI1FJV07amKcln-qRggFwzcYC_CUkA/LVxmMKO0m6I.jpg?size=484x807&quality=96&sign=0c209b0923cff10f12d9d90e9a63d316&c_uniq_tag=rJnLWuxAKGshikMvIfPhaYxCusF9dogCz2yaJFtl6Vg&type=album"
        )
    )
    add(
        Manhwa(
            name = "From sleep",
            author = "L",
            rating = 10.0,
            releaseDate = 14,
            lastRealise = 25,
            month = "Feb",
            year = 2023,
            money = 1800,
            image = "https://shikimori.one/system/characters/original/225269.jpg"
        )
    )
    add(
        Manhwa(
            name = "My reason",
            author = "Y",
            rating = 9.70,
            releaseDate = 23,
            lastRealise = 19,
            month = "Jan",
            year = 2023,
            money = 1700,
            image = "https://p1.statichub.org/uploads/media/manga_cover/0021/95/dc1ecbf25dd0ac0ed558e7740288416ec7a23418.jpg"
        )
    )
    add(
        Manhwa(
            name = "Duke's indentured bride",
            author = "Y",
            rating = 9.78,
            releaseDate = 17,
            lastRealise = 21,
            month = "Feb",
            year = 2023,
            money = 1400,
            image = "https://pm1.aminoapps.com/7156/5295138d634cc1927628ca846c68e37ab7579eddr1-736-1080v2_hq.jpg"
        )
    )
    add(
        Manhwa(
            name = "Second marriage",
            author = "Y",
            rating = 9.77,
            releaseDate = 8,
            lastRealise = 10,
            month = "Jul",
            year = 2023,
            money = 1300,
            image = "https://shikimori.me/uploads/poster/mangas/123475/main_alt-088d8f6e753a5fcbdeba6bc916373384.jpeg"
        )
    )
    add(
        Manhwa(
            name = "Seduce the villain's ",
            author = "Y",
            rating = 9.43,
            releaseDate = 2,
            lastRealise = 17,
            month = "Aug",
            year = 2023,
            money = 1500,
            image = "https://shikimori.one/system/characters/original/205461.jpg"
        )
    )
    add(
        Manhwa(
            name = "Virtue Bestowed",
            author = "Y",
            rating = 9.39,
            releaseDate = 3,
            lastRealise = 10,
            month = "Sep",
            year = 2023,
            money = 1200,
            image = "https://sun9-13.userapi.com/impg/qH5-Ku5aXEZ4bq-bR1G8HK57dFFnwSnk7QsSCQ/7FkZFkAsJfs.jpg?size=460x604&quality=96&sign=7e6794b0ef17350991917e263d8e6106&c_uniq_tag=J59xJkCjMaoupslFx8GYadlqncN2vfPLkIejgUIG_SM&type=album"
        )
    )
    add(
        Manhwa(
            name = "Dark Moon",
            author = "Y",
            rating = 9.43,
            releaseDate = 15,
            lastRealise = 24,
            month = "Oct",
            year = 2023,
            money = 1800,
            image = "https://sun9-27.userapi.com/impg/1WkMpUCtvef-8ppdT3T5p846j15mpXonSKZuRQ/mRANqw4-w0A.jpg?size=687x451&quality=96&sign=83a6c3fd3a7e82dfb490fb3ea43b1048&type=album"
        )
    )
}

@Composable
fun ManhwaItem1(modifier: Modifier = Modifier, manhwa: Manhwa) {
    Box(
        modifier
            .clip(shape = RoundedCornerShape(15.dp))
            .size(height = 160.dp, width = 140.dp)
    ) {
        AsyncImage(
            modifier = Modifier
                .size(height = 160.dp, width = 140.dp),
            model = ImageRequest.Builder(LocalContext.current).data(manhwa.image)
                .crossfade(true).build(),
            contentDescription = stringResource(R.string.content_description_image_manhwa),
            placeholder = painterResource(
                id = R.drawable.image_not_found,
            ),
            contentScale = ContentScale.Crop
        )
        Row(
            modifier = Modifier
                .padding(8.dp)
                .align(Alignment.TopEnd)
                .clip(shape = RoundedCornerShape(5.dp))
                .background(Color(transparentBlack.value))
                .padding(2.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier
                    .padding(start = 4.dp),
                text = manhwa.rating.toString(),
                fontSize = 10.sp,
                color = White
            )
            Icon(
                modifier = Modifier
                    .padding(start = 2.dp),
                painter = painterResource(id = R.drawable.ic_rating),
                contentDescription = stringResource(
                    R.string.content_description_icon_rating
                ),
                tint = Yellow
            )
        }
        Column(
            modifier = Modifier
                .padding(start = 12.dp, bottom = 8.dp)
                .wrapContentSize()
                .align(Alignment.BottomStart),
        ) {
            Text(
                text = manhwa.name,
                color = White,
                fontSize = 14.sp
            )
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_pencil),
                    contentDescription = stringResource(R.string.content_description_author_manhwa),
                    tint = White
                )
                Text(
                    text = manhwa.author,
                    color = White,
                    fontSize = 10.sp
                )
            }
        }
    }
}

@Composable
fun ManhwaItem2(modifier: Modifier = Modifier, manhwa: Manhwa) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(DarkBlue2)
    ) {
        Row {
            AsyncImage(
                modifier = Modifier
                    .size(height = 140.dp, width = 140.dp)
                    .padding(start = 12.dp, top = 12.dp)
                    .clip(RoundedCornerShape(10.dp)),
                model = ImageRequest.Builder(LocalContext.current)
                    .data(manhwa.image)
                    .crossfade(true)
                    .build(),
                contentDescription = stringResource(R.string.content_description_image_manhwa),
                placeholder = painterResource(id = R.drawable.image_not_found),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier
                    .padding(top = 14.dp, start = 8.dp)
                    .size(width = 140.dp, height = 140.dp),
                verticalArrangement = Arrangement.spacedBy(14.dp, Alignment.CenterVertically)
            ) {
                Text(
                    text = manhwa.name,
                    color = White,
                    fontSize = 16.sp
                )
                Row {
                    Icon(
                        modifier = Modifier
                            .padding(top = 8.dp),
                        painter = painterResource(id = R.drawable.ic_calendar),
                        contentDescription = stringResource(R.string.content_description_icon_calendar),
                        tint = DarkGray
                    )
                    Text(
                        modifier = Modifier
                            .padding(top = 8.dp, start = 4.dp),
                        text = stringResource(
                            R.string.date,
                            manhwa.releaseDate,
                            manhwa.lastRealise,
                            manhwa.month,
                            manhwa.year
                        ),
                        color = White,
                        fontSize = 12.sp
                    )
                }
                Row {
                    Icon(
                        modifier = Modifier
                            .padding(top = 8.dp),
                        painter = painterResource(id = R.drawable.ic_dollar_square),
                        contentDescription = stringResource(
                            R.string.content_description_icon_money
                        ),
                        tint = DarkGray
                    )
                    Text(
                        modifier = Modifier
                            .padding(top = 6.dp, start = 4.dp),
                        text = manhwa.money.toString(),
                        color = White,
                        fontSize = 12.sp
                    )
                    Text(
                        modifier = Modifier
                            .padding(top = 8.dp, start = 4.dp),
                        text = stringResource(R.string.text_day),
                        fontSize = 10.sp,
                        color = DarkGray
                    )
                    Icon(
                        modifier = Modifier
                            .padding(top = 8.dp, start = 26.dp)
                            .height(16.dp)
                            .width(16.dp),
                        painter = painterResource(id = R.drawable.ic_pencil),
                        contentDescription = stringResource(
                            R.string.content_description_icon_author
                        ),
                        tint = DarkGray
                    )
                    Text(
                        modifier = Modifier
                            .padding(top = 6.dp, start = 4.dp),
                        text = manhwa.author,
                        color = White,
                        fontSize = 10.sp
                    )
                }
            }
            Row(
                modifier = Modifier
                    .padding(top = 14.dp)
                    .width(40.dp)
                    .height(20.dp)
                    .clip(RoundedCornerShape(4.dp))
                    .background(DarkBlue1)
            ) {
                Text(
                    modifier = Modifier
                        .padding(start = 4.dp)
                        .align(Alignment.CenterVertically),
                    text = manhwa.rating.toString(),
                    color = White,
                    fontSize = 10.sp
                )
                Icon(
                    modifier = Modifier
                        .padding(2.dp)
                        .align(Alignment.CenterVertically),
                    painter = painterResource(id = R.drawable.ic_rating),
                    contentDescription = stringResource(
                        R.string.content_description_icon_rating
                    ),
                    tint = Yellow
                )
            }
        }
    }
}