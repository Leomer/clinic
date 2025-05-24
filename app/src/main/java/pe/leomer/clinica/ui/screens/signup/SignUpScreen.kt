package pe.leomer.clinica.ui.screens.signup

import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import pe.leomer.clinica.ui.components.TittleLabel
import pe.leomer.clinica.R
import pe.leomer.clinica.ui.screens.signup.views.RegisterView
import pe.leomer.clinica.ui.screens.signup.views.ValidateView

@Composable
fun SignUpScreen(
    navController: NavController?,
    singUpState: SingUpState,
    onSelectDocument: (String) -> Unit,
    onInputDocument: (String) -> Unit,
    onInputBirthDay: (String) -> Unit,
    onInputName: (String) -> Unit,
    onInputCelPhone: (String) -> Unit,
    onContinue: () -> Unit
) {
    var isValidate by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.background))
            .padding(start = 10.dp, end = 10.dp, top = 40.dp, bottom = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier.weight(1f)
        ){
            TittleLabel(
                title = stringResource(R.string.app_second_tittle)
            )
        }

        //View
        Box(
            modifier = Modifier.weight(6f)
        ){
            if (!isValidate) {
                RegisterView(
                    singUpState = singUpState,
                    onSelectDocument,
                    onInputDocument,
                    onInputBirthDay,
                    onInputName,
                    onInputCelPhone
                )
            } else {
                ValidateView(
                    singUpState = singUpState
                )
            }
        }

        //button
        Box(
            modifier = Modifier.weight(2f)
        ){
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    contentAlignment = Alignment.Center, // centra el contenido
                    modifier = Modifier
                        .width(130.dp) // ancho del contenedor
                        .height(40.dp) // alto del contenedor
                        .background( // se agrega color de fondo y se redondea las esquinas
                            color = Color.Blue, // usa el color que se le asigne al componente
                            shape = RoundedCornerShape(8.dp)
                        )
                        // permite que el contenedor tenga el comportamiento de un boton
                        // el contenedor ejecuta la dunción que se le envie
                        .clickable(
                            onClick = {
                                if (isValidate) {
                                    onContinue()
                                } else {
                                    isValidate = true
                                }
                            }
                        )
                ) {
                    Text(
                        text = "Continuar", // usa la texto que se le envía al componente
                        textAlign = TextAlign.Center, //alinea el texto al centro
                        color = Color.White,
                        modifier = Modifier
                            .padding(vertical = 3.dp, horizontal = 8.dp)
                    )
                }


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
                            )
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
                                    navController?.navigate(route = "main") {
                                        popUpTo("register") { inclusive = true}
                                    }
                                }
                        )
                    }
                }
            }
        }
    }
}


@Preview
@Composable
private fun SignUpScreenPreview() {
    SignUpScreen(
        navController = null,
        singUpState = SingUpState.initState(),
        onSelectDocument = {},
        onInputDocument = {},
        onInputBirthDay = {},
        onInputCelPhone = {},
        onInputName = {},
        onContinue = { }
    )
}