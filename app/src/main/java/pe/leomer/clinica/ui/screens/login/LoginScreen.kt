package pe.leomer.clinica.ui.screens.login

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pe.leomer.clinica.R
import pe.leomer.clinica.ui.components.CustomButton
import pe.leomer.clinica.ui.components.InputField
import pe.leomer.clinica.ui.components.TittleLabel

@Composable
fun LoginScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 8.dp, end = 8.dp, top = 40.dp, bottom = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // se llama al componente TittleLabel
        TittleLabel(
            title = stringResource(R.string.app_tittle)
        )
        // Agrega un spaciado con un tamaño de 100 dp
        Spacer(modifier = Modifier.height(100.dp))

        // Se agrega un texto
        Text(text = stringResource(R.string.login_tittle))

        // Se agrega el componente de ingreso de usuario
        InputField(
            placeholder = stringResource(R.string.login_user),
            value = "",
            onInputValue = {},
            keyboardType = KeyboardType.Text
        )
        // Se agrega el componente de ingreso de password
        InputField(
            placeholder = stringResource(R.string.login_password),
            value = "",
            onInputValue = {},
            keyboardType = KeyboardType.Password
        )

        // Agrega un spaciado con un tamaño de 50 dp
        Spacer(modifier = Modifier.height(50.dp))

        // Se agrega un boton
        CustomButton(
            label = stringResource(R.string.login_button),
            color = Color.Blue,
            onClicked = {}
        )

        // Agrega un spaciado con un tamaño de 50 dp
        Spacer(modifier = Modifier.height(50.dp))

        // Se agrega un texto con la opción de clickeable
        Text(
            text = stringResource(R.string.login_forgot),
            style = TextStyle(
                color = Color.Blue,// color de letra
                textDecoration = TextDecoration.Underline // subrayado
            ),
            modifier = Modifier
                .clickable {

                }

        )

        // Agrega un spaciado con un tamaño de 10 dp
        Spacer(modifier = Modifier.height(10.dp))

        // Se agrega un texto con la opción de clickeable
        Text(
            text = stringResource(R.string.login_sign_up),
            style = TextStyle(
                color = Color.Blue,
                textDecoration = TextDecoration.Underline
            ),
            modifier = Modifier
                .clickable {

                }
        )
    }
}

@Preview
@Composable
private fun LoginScreenPreview() {
    LoginScreen()
}