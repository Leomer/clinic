package pe.leomer.clinica.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun SwitchButton(
    message: String
) {
    var isChecked by remember { mutableStateOf(false) }

    Row(verticalAlignment = Alignment.CenterVertically) {
        Box(
            modifier = Modifier
                .weight(2f)
        ) {
            Switch(
                checked = isChecked,
                onCheckedChange = { isChecked = it }
            )
        }

        Box(
            modifier = Modifier
                .weight(7f)
        ) {
            Text(
                text = message,
                fontSize = 12.sp
            )
        }
    }
}

@Preview
@Composable
private fun SwitchButtonPreview(){
    SwitchButton(
        message = "label"
    )
}