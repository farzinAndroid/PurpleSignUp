package com.farzin.purplesignup.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Shapes
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.farzin.purplesignup.ui.theme.Shapes

@Composable
fun TopBar() {


    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
    ) {

        Row(
            modifier = Modifier
                .fillMaxSize(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {


            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(horizontal = 20.dp)
                    .border(2.dp, Color.Gray, shape = RoundedCornerShape(10.dp))

            )
            {
                Icon(
                    imageVector = Icons.Filled.ArrowBack,
                    contentDescription = "",
                    tint = Color.White
                )
            }

            Text(
                text = "Sign up",
                color = Color.White,
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold,
            )

        }
    }

}