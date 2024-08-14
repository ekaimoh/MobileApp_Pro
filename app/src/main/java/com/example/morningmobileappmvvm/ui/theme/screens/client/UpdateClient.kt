package com.example.morningmobileappmvvm.ui.theme.screens.client


import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Updater
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberImagePainter
import com.example.morningmobileappmvvm.R

@Composable
fun UpdateClient(navController: NavController){
    val imageuri = rememberSaveable() {
        mutableStateOf(value = "")

    }
    val painter = rememberImagePainter(
        if (imageuri.value.isEmpty()
        )
            R.drawable.ic_person
        else
            imageuri.value
    )
    val launcher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent()
    ) { uri: Uri? ->
        uri?.let { imageuri.value = it.toString() }

    }
    var firstname by remember {
        mutableStateOf(value = "")

    }
    var lastname by remember {
        mutableStateOf(value = "")

    }
    var age by remember {
        mutableStateOf(value = "")
    }
    var gender by remember {
        mutableStateOf(value = "")
    }
    var bio by remember {
        mutableStateOf(value = "")
    }
    Scaffold (
        bottomBar = {
            BottomAppBar (
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        androidx.compose.material3.Icon(Icons.Filled.Home,
                            contentDescription ="Home Icon"
                        )
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        androidx.compose.material3.Icon(Icons.Filled.Settings,
                            contentDescription = "Settings Icon")
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        androidx.compose.material3.Icon(Icons.Filled.Email,
                            contentDescription = "Email Icon")
                    }




                },
                floatingActionButton = {
                    FloatingActionButton(onClick = { /*TODO*/ },
                        elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation()) {
                        androidx.compose.material3.Icon(Icons.Filled.AccountCircle,
                            contentDescription = "Profile Icon")
                    }
                }
            )


        }
    ){innerPadding ->
        Column (
            modifier = Modifier
                .padding(innerPadding)
                .verticalScroll(rememberScrollState())
                .padding(10.dp)
                .fillMaxWidth()
        ){
            Text(text = "UPDATE CLIENT",
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
                    .background(Color.Cyan))
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                horizontalArrangement =
                Arrangement.SpaceBetween
            ){
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "GO BACK")

                }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "SAVE")

                }
            }
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment =
                Alignment.CenterHorizontally) {
                Card(
                    shape = CircleShape,
                    modifier = Modifier
                        .padding(10.dp)
                        .size(180.dp)
                ) {
                    Image(
                        painter = painter, contentDescription = null,
                        modifier = Modifier
                            .wrapContentSize()
                            .clickable { launcher.launch("image/*") },
                    )
                }
                Text(text = "Change picture here")

            }
            Spacer(modifier = Modifier .height(10.dp))
            OutlinedTextField(value = firstname
                , onValueChange = { newname -> firstname = newname },
                placeholder = { Text(text = "Please Enter first name")},
                modifier = Modifier
                    .wrapContentWidth()
                    .align(Alignment.CenterHorizontally))

            Spacer(modifier = Modifier .height(10.dp))
            OutlinedTextField(value = lastname
                , onValueChange = { newlastname -> lastname = newlastname },
                placeholder = { Text(text = "Please Enter last name")},
                modifier = Modifier
                    .wrapContentWidth()
                    .align(Alignment.CenterHorizontally))

            Spacer(modifier = Modifier .height(10.dp))
            OutlinedTextField(value = gender
                , onValueChange = { newgender -> gender = gender },
                placeholder = { Text(text = "Please Enter gender")},
                label = { Text(text = "Enter your gander")},
                modifier = Modifier
                    .wrapContentWidth()
                    .align(Alignment.CenterHorizontally))

            Spacer(modifier = Modifier .height(10.dp))
            OutlinedTextField(value = bio,
                onValueChange = { newbio -> bio = newbio },
                placeholder = { Text(text = "Please Enter description")},
                label = { Text(text = "Enter your description")},
                singleLine = false,
                modifier = Modifier
                    .wrapContentWidth()
                    .align(Alignment.CenterHorizontally)
                    .height(160.dp))
        }
    }




}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun UpdateClientPreview() {
    UpdateClient(rememberNavController())
}