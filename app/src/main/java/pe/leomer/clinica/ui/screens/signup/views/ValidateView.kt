package pe.leomer.clinica.ui.screens.signup.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import pe.leomer.clinica.R

@Composable
fun ValidateView() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            text = stringResource(R.string.validate_title)
        )
        Spacer(modifier = Modifier.height(10.dp))
        Row {
           Box(modifier = Modifier.weight(1f)) {
               Text(
                   text = "DNI:"
               )
           }
            Box(modifier = Modifier.weight(1f)) {
                Text(
                    text = "Correo electrónico:"
                )
            }
        }

        Row {
            Box(modifier = Modifier.weight(1f)) {
                Text(
                    text = "48272134"
                )
            }
            Box(modifier = Modifier.weight(1f)) {
                Text(
                    text = "luis.salmavides@gmail.com"
                )
            }
        }

        Row {
            Box(modifier = Modifier.weight(1f)) {
                Text(
                    text = "nombre y Apellidos:"
                )
            }
            Box(modifier = Modifier.weight(1f)) {
                Text(
                    text = "N° de celular:"
                )
            }
        }

        Row {
            Box(modifier = Modifier.weight(1f)) {
                Text(
                    text = "Luis Salmavides"
                )
            }
            Box(modifier = Modifier.weight(1f)) {
                Text(
                    text = "987231223"
                )
            }
        }

        Row {
            Box(modifier = Modifier.weight(1f)) {
                Text(
                    text = "fecha de nacimiento:"
                )
            }
            Box(modifier = Modifier.weight(1f)) {
                Text(
                    text = "Código de país:"
                )
            }
        }

        Row {
            Box(modifier = Modifier.weight(1f)) {
                Text(
                    text = "20/03/1993"
                )
            }
            Box(modifier = Modifier.weight(1f)) {
                Text(
                    text = "051 - Lima Perú"
                )
            }
        }


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xe4d0b0))
                .height(40.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .weight(1f),
                contentAlignment = Alignment.BottomEnd
            ) {
                Image(
                    painter = painterResource(R.drawable.img_warning),
                    contentDescription = "warning",
                    modifier = Modifier.size(40.dp)
                )
            }
            Box(
                modifier = Modifier
                    .padding(start = 8.dp)
                    .weight(6f),
            ) {
                Text(
                    text = stringResource(R.string.validate_warning)
                )
            }
        }
    }
}