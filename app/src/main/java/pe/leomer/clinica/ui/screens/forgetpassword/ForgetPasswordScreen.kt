package pe.leomer.clinica.ui.screens.forgetpassword

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ForgetPasswordScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text(
            text = "En construcción"
        )
    }
}

@Preview
@Composable
private fun ForgetPasswordScreenPreview(){
    ForgetPasswordScreen()
}