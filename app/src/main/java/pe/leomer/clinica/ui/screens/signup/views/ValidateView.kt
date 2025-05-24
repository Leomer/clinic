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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pe.leomer.clinica.R
import pe.leomer.clinica.ui.components.DropDown
import pe.leomer.clinica.ui.screens.signup.SingUpState
import pe.leomer.clinica.ui.screens.signup.components.CardInfo

@Composable
fun ValidateView(
    singUpState: SingUpState,
) {
    Column(
        modifier = Modifier
            .background(colorResource(R.color.background))
            .fillMaxWidth()
    ) {
        Text(
            text = stringResource(R.string.validate_title),
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 20.dp)
        )

        CardInfo(
            label1 = "DNI:",
            value1 = singUpState.documentNumber,
            label2 = stringResource(R.string.email),
            value2 = singUpState.email
        )

        CardInfo(
            label1 = stringResource(R.string.validate_name),
            value1 = singUpState.name,
            label2 = stringResource(R.string.validate_phone),
            value2 = singUpState.celPhoneNumber
        )
        CardInfo(
            label1 = stringResource(R.string.validate_birthday),
            value1 = singUpState.birthDay,
            label2 = stringResource(R.string.validate_country),
            value2 = singUpState.code
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
                .background(colorResource(R.color.background_warning))
                .height(60.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
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
                    .background(colorResource(R.color.background_warning))
                    .height(40.dp)
                    //.background(Color(0xe4d0b0))
                    .padding(start = 8.dp)
            ) {
                Text(
                    text = stringResource(R.string.validate_warning)
                )
            }
        }
        val options = mutableListOf("Masculino", "Femenino")

        Box(
            modifier = Modifier
                .padding(top = 20.dp, end = 150.dp)
        ) {
            DropDown(
                label = stringResource(R.string.validate_sex),
                options = options,
                onSelectOption = {}
            )
        }
    }
}

@Preview
@Composable
fun ValidateViewPreview() {
    ValidateView(
        singUpState = SingUpState.initState(),
    )
}