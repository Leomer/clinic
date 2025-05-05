package pe.leomer.clinica.ui.screens.signup.views

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import pe.leomer.clinica.R
import pe.leomer.clinica.ui.components.DropDown
import pe.leomer.clinica.ui.components.InputField
import pe.leomer.clinica.ui.components.SwitchButton

@Composable
fun RegisterView() {
    val options = mutableListOf("DNI", "Pasaporte", "CE")
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = stringResource(R.string.register_subtittle),
        )

        Spacer(modifier = Modifier.height(30.dp))

        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
            ) {
                DropDown(
                    label = stringResource(R.string.document_type),
                    options = options,
                    onSelectTransaction = {}
                )
            }
            Box (
                modifier = Modifier.weight(0.2f)
            )

            Column(
                modifier = Modifier
                    .weight(0.9f)
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

        Spacer(modifier = Modifier.height(20.dp))

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
    }
}