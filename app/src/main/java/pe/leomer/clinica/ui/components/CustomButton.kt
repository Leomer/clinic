package pe.leomer.clinica.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CustomButton(
    label: String,
    color: Color,
    onClicked: () -> Unit
){
    // container
    Box(
        contentAlignment = Alignment.Center, // centra el contenido
        modifier = Modifier
            .padding(vertical = 20.dp) // padding en el eje y
            .width(130.dp) // ancho del contenedor
            .height(40.dp) // alto del contenedor
            .background( // se agrega color de fondo y se redondea las esquinas
                color = color, // usa el color que se le asigne al componente
                shape = RoundedCornerShape(8.dp)
            )
            // permite que el contenedor tenga el comportamiento de un boton
            // el contenedor ejecuta la dunción que se le envie
            .clickable(
                onClick = onClicked
            )
    ) {
        Text(
            text = label, // usa la texto que se le envía al componente
            textAlign = TextAlign.Center, //alinea el texto al centro
            color = Color.White,
            modifier = Modifier
                .padding(vertical = 3.dp, horizontal = 8.dp)

        )
    }
}

@Preview
@Composable
private fun CustomButtonPreview(){
    CustomButton(
        label = "Continuar",
        color = Color.Blue,
        onClicked = {}
    )
}