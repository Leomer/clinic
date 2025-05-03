package pe.leomer.clinica.ui.screens.signup

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
import pe.leomer.clinica.ui.components.TittleLabel
import pe.leomer.clinica.R
import pe.leomer.clinica.ui.components.CustomButton
import pe.leomer.clinica.ui.components.DropDown
import pe.leomer.clinica.ui.components.InputField
import pe.leomer.clinica.ui.components.SwitchButton

@Composable
fun SignUpScreen() {
    val options = mutableListOf("DNI", "Pasaporte", "CE")
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 10.dp, end = 10.dp, top = 40.dp, bottom = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TittleLabel(
            title = stringResource(R.string.app_second_tittle)
        )

        Spacer(modifier = Modifier.height(50.dp))

        Text(
            text = stringResource(R.string.register_subtittle),
        )

        Spacer(modifier = Modifier.height(50.dp))

        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .weight(0.8f)
            ) {
                DropDown(
                    label = stringResource(R.string.document_type),
                    options = options,
                    onSelectTransaction = {}
                )
            }
            Box (
                modifier = Modifier.weight(0.2f)
            ) {  }

            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 1.dp)
            ) {
                Text(
                    text = stringResource(R.string.document_number),
                )
                Box(
                    modifier = Modifier
                        .padding(end = 10.dp)
                ) {
                    InputField(
                        placeholder = "Ej:47892343",
                        value = "",
                        onInputValue = {},
                        keyboardType = KeyboardType.Text
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(40.dp))

        // Fecha de nacimiento
        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = stringResource(R.string.birthdate),
            )
        }
        Box(
            modifier = Modifier
                .padding(end = 10.dp, top = 10.dp)
        ) {
            Row {
                Box(
                    modifier = Modifier
                        .weight(1f)
                ) {
                    InputField(
                        placeholder = "Ej: 14/03/2024",
                        value = "",
                        onInputValue = {},
                        keyboardType = KeyboardType.Text
                    )
                }
                Box(
                    modifier = Modifier
                        .weight(1f)
                ) {}
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        // condiciones
        SwitchButton(message = stringResource(R.string.term_condition))
        SwitchButton(message = stringResource(R.string.benefits))

        Spacer(modifier = Modifier.height(20.dp))

        //button
        CustomButton(
            label = stringResource(R.string.register_button),
            color = Color.Blue,
            onClicked = {}
        )

        Spacer(modifier = Modifier.height(20.dp))

        // footer
        Row(
            modifier = Modifier
                .padding(horizontal = 10.dp)
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .weight(1f)
            ) {
                Text(
                    text = stringResource(R.string.account),
                    style = TextStyle(
                        color = Color.Black,
                    ),
                    modifier = Modifier
                        .clickable {

                        }
                )
            }

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = stringResource(R.string.login),
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
    }
}


@Preview
@Composable
private fun SignUpScreenPreview() {
    SignUpScreen()
}