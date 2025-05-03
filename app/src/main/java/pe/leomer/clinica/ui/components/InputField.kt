package pe.leomer.clinica.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun InputField(
    placeholder: String,
    value: String,
    onInputValue: (String) -> Unit,
    keyboardType: KeyboardType
){
    // guarda en memoria el valor del texto ingresado en el componente
    var texto by remember { mutableStateOf("") }

    Row (// los contenidos agregado irán en una sola fila
        modifier = Modifier
            .fillMaxWidth(), //usa el ancho total de la pantalla
        verticalAlignment =Alignment.CenterVertically // alinea en el eje Y
    ) {

        Box( // contenedor
            modifier = Modifier
                .fillMaxWidth(), //usa el ancho total de la pantalla
                //.padding(horizontal = 20.dp),
            contentAlignment = Alignment.Center  // alinea todos los objetos en el centro del contenedor
        ) {
            TextField(
                value = texto,  // valor del texto que se muestra
                onValueChange = { texto = it }, // actualiza el valor del texto
                placeholder = { Text(placeholder) }, // agrega el placeholder
                singleLine = true, // agrega la línea inferior
                keyboardOptions = KeyboardOptions(
                    keyboardType = keyboardType // asigna el tipo de teclado
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White, RoundedCornerShape(8.dp)),
                colors = TextFieldDefaults.colors( // personalización de los colores
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White,
                    disabledContainerColor = Color.LightGray,
                    focusedIndicatorColor = Color.Black,
                    unfocusedIndicatorColor = Color.Black,
                    disabledIndicatorColor = Color.Transparent,
                    cursorColor = Color.Black,
                    focusedPlaceholderColor = Color.Gray,
                    unfocusedPlaceholderColor = Color.LightGray,
                    focusedTextColor = Color.Black,
                    unfocusedTextColor = Color.Black
                )
            )
        }
    }
}

@Preview(showBackground = true, widthDp = 360, heightDp = 592)
@Composable
private fun InputFieldPreview(){
    InputField(
        placeholder = "Referencia:",
        value = "soy un valor",
        onInputValue = {},
        keyboardType = KeyboardType.Number
    )
}