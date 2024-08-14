package com.example.morningmobileappmvvm.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.morningmobileappmvvm.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController:NavController) {
    Box(){
        Image(painter = painterResource(id = R.drawable.california),
            contentDescription = "dashboard background",
            contentScale = ContentScale.FillBounds)
    }
    Column (
        modifier = Modifier.fillMaxSize()
    ){
        TopAppBar(
            title = { Text(text = "Britam Insurance")/*TODO*/ },
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.Home
                        , contentDescription = "Home",
                        tint = Color.Red
                    )

                }
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.Cyan,
                titleContentColor = Color.Blue,
                navigationIconContentColor = Color.Green
            ),

            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.Search,
                        contentDescription = "SEARCH")

                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.Menu,
                        contentDescription = "MENU")

                }

            }
        )
        Row (
            modifier = Modifier.wrapContentWidth()
        ){
            Card (
                modifier = Modifier.padding(10.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            ){
                Box(
                    modifier = Modifier.height(100.dp)
                ){
                    Image(painter = painterResource(id = R.drawable.bangle),
                        contentDescription = "Animal")
                    Box(
                        modifier = Modifier
                            .matchParentSize()
                            .padding(10.dp),
                        contentAlignment = Alignment.Center
                    ){
                        Text(color = Color.Cyan,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            text = "ADD NEW CLIENT")
                    }
                }

            }

            Card (
                modifier = Modifier.padding(10.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            ){
                Box(
                    modifier = Modifier.height(100.dp)
                ){
                    Image(painter = painterResource(id = R.drawable.bangle),
                        contentDescription = "Animal")
                    Box(
                        modifier = Modifier
                            .matchParentSize()
                            .padding(10.dp),
                        contentAlignment = Alignment.Center
                    ){
                        Text(color = Color.White,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            text = "VIEW ALL CLIENTS")
                    }
                }

            }
        }

    }

    Row (
        modifier = Modifier.wrapContentWidth()
    ){
        Card (
            modifier = Modifier.padding(10.dp),
            shape = RoundedCornerShape(20.dp),
            elevation = CardDefaults.cardElevation(10.dp)
        ){
            Box(
                modifier = Modifier.height(100.dp)
            ){
                Image(painter = painterResource(id = R.drawable.bangle),
                    contentDescription = "Animal")
                Box(
                    modifier = Modifier
                        .matchParentSize()
                        .padding(10.dp),
                    contentAlignment = Alignment.Center
                ){
                    Text(color = Color.Cyan,
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        text = "SAVINGS ACCOUNT")
                }
            }

        }

        Card (
            modifier = Modifier.padding(10.dp),
            shape = RoundedCornerShape(20.dp),
            elevation = CardDefaults.cardElevation(10.dp)
        ){
            Box(
                modifier = Modifier.height(100.dp)
            ){
                Image(painter = painterResource(id = R.drawable.bangle),
                    contentDescription = "Animal")
                Box(
                    modifier = Modifier
                        .matchParentSize()
                        .padding(10.dp),
                    contentAlignment = Alignment.Center
                ){
                    Text(color = Color.White,
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        text = "DEPOSIT ACCOUNT")
                }
            }

        }
    }

}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreensPreview(){
    HomeScreen(rememberNavController())
}
