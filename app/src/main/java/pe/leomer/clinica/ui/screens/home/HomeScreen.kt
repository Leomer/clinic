package pe.leomer.clinica.ui.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import pe.leomer.clinica.R
import pe.leomer.clinica.ui.components.Footer
import pe.leomer.clinica.ui.components.TittleLabel
import pe.leomer.clinica.ui.screens.home.views.EmptyDate

@Composable
fun HomeScreen(
    navController: NavController?
){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.background))
            .padding(start = 8.dp, end = 8.dp, top = 40.dp, bottom = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .weight(1F)
                .fillMaxWidth()
                .padding(bottom = 30.dp)
        ) {
            TittleLabel(
                title = stringResource(R.string.app_tittle)
            )
        }

        Box(
            modifier = Modifier
                .weight(0.7F)
                .fillMaxWidth()
                .padding(horizontal = 40.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Hola Alonso",
                        fontSize = 16.sp,
                        modifier = Modifier
                            .padding(top = 10.dp)
                    )
                    Text(
                        text = "Estamos aquí para cuidarte",
                        fontSize = 16.sp,
                        modifier = Modifier
                            .padding(vertical = 10.dp)
                    )
                }
            }
        }

        Box(
            modifier = Modifier
                .weight(1.7F)
                .fillMaxWidth()
                .padding(top = 40.dp)
        ) {
            EmptyDate()
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .weight(0.7F)
                .fillMaxWidth()
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(20.dp)
                    .width(130.dp)
                    .height(40.dp)
                    .background(
                        color = Color.Blue,
                        shape = RoundedCornerShape(8.dp)
                    )
                    .clickable(
                        onClick = {  }
                    )
            ) {
                Text(
                    text = stringResource(R.string.home_add_date),
                    textAlign = TextAlign.Center,
                    color = Color.White,
                    modifier = Modifier
                        .padding(vertical = 3.dp, horizontal = 8.dp)
                )
            }
        }

        Box(
            contentAlignment = Alignment.BottomCenter,
            modifier = Modifier
                .weight(1F)
                .padding(bottom = 40.dp)
                .fillMaxWidth()
        ) {
            Footer()
        }
    }
}

@Preview
@Composable
private fun HomeScreenPreview(){
    HomeScreen(
        navController = null
    )
}