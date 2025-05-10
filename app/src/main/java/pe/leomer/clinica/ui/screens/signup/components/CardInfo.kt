package pe.leomer.clinica.ui.screens.signup.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CardInfo(
    label1: String,
    value1: String,
    label2: String,
    value2: String
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(40.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1F)
            ) {
                Text(
                    text = label1,
                    fontWeight = FontWeight.Bold
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1F)
            ) {
                Text(
                    text = label2,
                    fontWeight = FontWeight.Bold
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1F)
            ) {
                Text(
                    text = value1
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1F)
            ) {
                Text(
                    text = value2
                )
            }
        }
    }
}

@Preview
@Composable
private fun CardInfoPreview() {
    CardInfo(
        label1 = "DNI:",
        value1 = "48272134",
        label2 = "Correo electrónico:",
        value2 = "emolina@gmail.com"
    )
}