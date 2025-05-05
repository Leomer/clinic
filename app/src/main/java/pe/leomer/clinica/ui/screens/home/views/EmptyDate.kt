package pe.leomer.clinica.ui.screens.home.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pe.leomer.clinica.R

@Composable
fun EmptyDate() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(R.drawable.img_date),
            contentDescription = "empty date",
            modifier = Modifier.size(50.dp)
        )

        Text(
            text = stringResource(R.string.home_empty_date),
            modifier = Modifier
                .padding(top = 20.dp)
        )
    }
}

@Preview
@Composable
private fun EmptyDatePreview() {
    EmptyDate()
}