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
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .padding(vertical = 20.dp)
            .width(130.dp)
            .height(55.dp)
            .background(
                color = color,
                shape = RoundedCornerShape(8.dp)
            )
            .clickable(
                onClick = onClicked
            )
    ) {
        Text(
            text = label,
            textAlign = TextAlign.Center,
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