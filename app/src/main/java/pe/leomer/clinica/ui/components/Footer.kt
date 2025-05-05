package pe.leomer.clinica.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pe.leomer.clinica.R

@Composable
fun Footer() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .weight(1F)
                .fillMaxWidth()
                .clickable {  }
        ){
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(R.drawable.img_home),
                    contentDescription = "empty date",
                    modifier = Modifier.size(50.dp)
                )
                Text(
                    text = "Inicio"
                )
            }
        }

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .weight(1F)
                .fillMaxWidth()
                .clickable {  }
        ){
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(R.drawable.img_add_date),
                    contentDescription = "empty date",
                    modifier = Modifier.size(50.dp)
                )
                Text(
                    text = "Nueva cita"
                )
            }
        }

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .weight(1F)
                .clickable {  }
        ){
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(R.drawable.img_check_date),
                    contentDescription = "empty date",
                    modifier = Modifier.size(50.dp)
                )
                Text(
                    text = "Nueva cita"
                )
            }
        }
    }
}

@Preview
@Composable
private fun FooterPreview() {
    Footer()
}