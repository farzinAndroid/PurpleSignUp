package com.farzin.purplesignup

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowCompat
import com.farzin.purplesignup.composables.Body
import com.farzin.purplesignup.composables.Bottom
import com.farzin.purplesignup.composables.TopBar
import com.farzin.purplesignup.ui.theme.PurpleSignUpTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {

            Surface(modifier = Modifier
                .fillMaxSize()
            ) {

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black)
                        ) {


                    TopBar()
                    Body()
                    Bottom()


                }
            }
        }
    }
}



