package pe.leomer.clinica.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import pe.leomer.clinica.R

@Composable
fun TittleLabel(
    title: String
) {
    Row( // los contenidos agregado irán en una sola fila
        modifier = Modifier
            .fillMaxWidth()
            .height(40.dp),
        horizontalArrangement = Arrangement.Center, // cada objeto se centra en X
        verticalAlignment = Alignment.CenterVertically // cada objeto se centra en Y
    ) {
        Box(
            modifier = Modifier
                .weight(2f), // Toma 2 partes del total de weigth de la fila
            contentAlignment = Alignment.BottomEnd // el contenido se alinea a la derecha
        ) {
            Image(
                painter = painterResource(R.drawable.img_clinic), // id d la imagen
                contentDescription = "Clinic Image", // descripción de la imagen
                modifier = Modifier.size(40.dp) // tamaño de la imagen
            )
        }
        Box(
            modifier = Modifier
                .padding(start = 8.dp)
                .weight(3f),// Toma 3 partes del total de weigth de la fila
        ) {
            Text(
                text = title
            )
        }
    }
}