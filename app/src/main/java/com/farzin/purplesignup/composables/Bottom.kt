package com.farzin.purplesignup.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.farzin.purplesignup.R
import com.farzin.purplesignup.ui.theme.*


@Composable
fun Bottom() {


    Row(modifier = Modifier
        .fillMaxWidth()
        .height(50.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Divider(
            color = Color.LightGray,
            modifier = Modifier
                .padding(
                    top = 4.dp, bottom = 4.dp, start = 20.dp, end = 5.dp
                )
                .weight(1f)
        )

        Text(text = "or sign up with", color = Color.White, fontWeight = FontWeight.Bold)


        Divider(
            color = Color.LightGray,
            modifier = Modifier
                .padding(
                    top = 4.dp, bottom = 4.dp, start = 5.dp, end = 20.dp
                )
                .weight(1f)
        )
    }

    Row(modifier = Modifier
        .fillMaxWidth()
        .height(100.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    )
    {

        Button(modifier = Modifier
            .weight(1f),
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(20.dp))
                    //.border(border = BorderStroke(5.dp, color = Color.DarkGray), shape = RoundedCornerShape(20.dp))
                    .background(ButtonGray)
                    ,
                contentAlignment = Alignment.Center,
            ){
                Image(
                    painter = painterResource(id = R.drawable.facebook_gray),
                    contentDescription = "",
                    modifier = Modifier.height(200.dp),
                    )
            }
        }

        Button(modifier = Modifier
            .weight(1f),
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(20.dp))
                    //.border(border = BorderStroke(5.dp, color = Color.DarkGray), shape = RoundedCornerShape(20.dp))
                    .background(ButtonGray)
                ,
                contentAlignment = Alignment.Center,
            ){
                Image(
                    painter = painterResource(id = R.drawable.google_gray),
                    contentDescription = "",
                    modifier = Modifier.height(200.dp),
                )
            }
        }
    }


}