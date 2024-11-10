package com.example.jetpackintroduction

import android.graphics.Paint.Align
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentCompositionLocalContext
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackintroduction.ui.theme.JetpackIntroductionTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
//            var arr = arrayOf("Homam","Shuja","Sadique","Hammad","Zainab")
//            Column { Text(text = "Homam Ahmad Kazimi",fontSize = 40.sp,color = Color.Red)
//                Text(text = "shuja Ahmad Kazimi")
//                for(i in arr){
//                    Text(text = i)
//                }
//            }
            layout()
        }
    }

    @Composable
    fun layout() {
        var context = LocalContext.current

//            Column(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .background(Color.Green)
//                    .verticalScroll(rememberScrollState())
//                    .horizontalScroll(rememberScrollState()),
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally
//            ){
//                for(i in 1..20){
//                    Text(text = "Homam Ahmad Kazimi", fontSize = 20.sp)
//
//                }
//            LazyColumn(content = {
//                item{for(i in 1..20){
//                    Text(text = "Homam Ahmad kazimi", fontSize = 48.sp)
//                } }
//            })
//            }

//        Box(
//            modifier = Modifier
//                .fillMaxSize()
//                .background(color = Color.Yellow)
//        ) {
//            Text(
//                text = "Hello Everyone out there!!",
//                fontSize = 30.sp,
//                modifier = Modifier.align(Alignment.TopCenter)
//            )
//            Text(
//                text = "This is Centre!!",
//                fontSize = 24.sp,
//                color = Color.Red,
//                modifier = Modifier.align(Alignment.Center)
//            )
//            Text(
//                text = "Hello Everyone this is Bottom!!",
//                fontSize = 24.sp,
//                modifier = Modifier.align(Alignment.BottomCenter)
//            )
//            Button(onClick = {
//                Toast.makeText(context,"Button is clicked",Toast.LENGTH_SHORT).show()
//            }, modifier = Modifier.align(Alignment.CenterEnd)) {
//                Text(text= "Click Me", fontSize = 30.sp)
//            }
//            }
        Card (modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.3f)
            .padding(20.dp,50.dp),
            elevation = CardDefaults.outlinedCardElevation(20.dp),
            colors = CardDefaults.cardColors(Color.Black))
        { Image(painter = painterResource(id= R.drawable.logo), contentDescription = "The Jania Logo",modifier= Modifier.fillMaxWidth())
        }
        var vall by remember {
            mutableStateOf(TextFieldValue(""))
        }

        Box(contentAlignment =Alignment.Center,
            modifier = Modifier
            .fillMaxSize())

        {
            TextField(
                value = vall, onValueChange = {vall = it},
              //  enabled = false
                label = {Text(text = "Username")},
                leadingIcon = { Icon(Icons.Default.Search, contentDescription = null) },
                placeholder = {Text(text = "enter your name")},
                singleLine = true ,
                trailingIcon = {Icon(painter = painterResource(id = R.drawable.baseline_account_circle_24), contentDescription = null)}
            )
        }

        }


    }
