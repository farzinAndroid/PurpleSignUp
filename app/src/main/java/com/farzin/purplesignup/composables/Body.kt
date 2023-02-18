package com.farzin.purplesignup.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.farzin.purplesignup.ui.theme.*

@Composable

fun Body() {


    var name by remember {
        mutableStateOf("")
    }

    var email by remember {
        mutableStateOf("")
    }

    var pass by remember {
        mutableStateOf("")
    }



    Column(
        modifier = Modifier
            .wrapContentHeight()
    ) {

        Text(
            text = "Create an account for free to get started!",
            color = Color.White,
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier
                .padding(horizontal = 12.dp)

        )

        Text(
            text = "Name",
            color = Color.White,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(start = 25.dp, top = 15.dp)
        )

        BasicTextField(
            textStyle = TextStyle(
                color = Color.White,
                fontSize = 20.sp
            ),
            value = name,
            onValueChange = { name = it },
            cursorBrush = Brush.horizontalGradient(listOf(Color.White, Color.White)),
            modifier = Modifier
                .padding(top = 15.dp, start = 25.dp, end = 25.dp)
                .fillMaxWidth(),
            decorationBox = { innerTextField ->
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .border(
                            brush = Brush.verticalGradient(listOf(Color(0xFF883EFF), Color(
                                0xFF260053))),
                            width = 1.dp,
                            shape = RoundedCornerShape(10.dp)
                        )
                        .padding(16.dp)
                ) {
                    //Icon(Icons.Default.Check, contentDescription = "", tint = Color.White)
                    if (name.isEmpty()) {
                        Text(text = "Enter Name", color = Color(0x9C616161), fontSize = 20.sp)
                    }
                    Spacer(modifier = Modifier.padding(3.dp))
                    innerTextField()
                }
            }
        )

        Text(
            text = "Email",
            color = Color.White,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(start = 25.dp, top = 15.dp)
        )


        BasicTextField(
            textStyle = TextStyle(
                color = Color.White,
                fontSize = 20.sp,
            ),
            value = email,
            onValueChange = { email = it },
            cursorBrush = Brush.horizontalGradient(listOf(Color.White, Color.White)),
            modifier = Modifier
                .padding(top = 15.dp, start = 25.dp, end = 25.dp)
                .fillMaxWidth(),
            decorationBox = { innerTextField ->
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .border(
                            brush = Brush.verticalGradient(listOf(Color(0xFF883EFF), Color(
                                0xFF260053))),
                            width = 1.dp,
                            shape = RoundedCornerShape(10.dp)
                        )
                        .padding(16.dp)
                ) {
                    //Icon(Icons.Default.Check, contentDescription = "", tint = Color.White)
                    if (email.isEmpty()) {
                        Text(text = "Enter Email", color = Color(0x9C616161), fontSize = 20.sp)
                    }
                    Spacer(modifier = Modifier.padding(3.dp))
                    innerTextField()
                }
            }
        )




        Text(
            text = "Password",
            color = Color.White,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(start = 25.dp, top = 15.dp)
        )


        BasicTextField(
            textStyle = TextStyle(
                color = Color.White,
                fontSize = 20.sp,
            ),
            value = pass,
            onValueChange = { pass = it },
            cursorBrush = Brush.horizontalGradient(listOf(Color.White, Color.White)),
            modifier = Modifier
                .padding(top = 15.dp, start = 25.dp, end = 25.dp)
                .fillMaxWidth(),
            decorationBox = { innerTextField ->
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .border(
                            brush = Brush.verticalGradient(listOf(LightPurple, DarkPurple)),
                            width = 1.dp,
                            shape = RoundedCornerShape(10.dp)
                        )
                        .padding(16.dp)
                ) {
                    //Icon(Icons.Default.Check, contentDescription = "", tint = Color.White)
                    if (pass.isEmpty()) {
                        Text(text = "Enter Password", color = Gray, fontSize = 20.sp)
                    }
                    Spacer(modifier = Modifier.padding(3.dp))
                    innerTextField()
                }
            }
        )

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 25.dp, end = 10.dp, start = 10.dp),
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Transparent
            )


        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(20.dp))
                    .background(Brush.linearGradient(listOf(ButtonColor1,
                        ButtonColor2,
                        ButtonColor3))),
                contentAlignment = Alignment.Center
            ) {


                Text(
                    text = "SIGN UP",
                    color = Color.White,
                    fontSize = 20.sp,
                    modifier = Modifier
                        .padding(20.dp)
                )
            }

        }

    }

}