package pe.leomer.clinica

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import pe.leomer.clinica.ui.screens.forgetpassword.ForgetPasswordScreen
import pe.leomer.clinica.ui.screens.home.HomeScreen
import pe.leomer.clinica.ui.screens.login.LoginScreen
import pe.leomer.clinica.ui.screens.login.LoginViewModel
import pe.leomer.clinica.ui.screens.signup.SignUpScreen
import pe.leomer.clinica.ui.screens.signup.SingUpViewModel
import pe.leomer.clinica.ui.theme.ClinicaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            Navigation(navController)
        }
    }
}

@Composable
private fun Navigation(navController: NavHostController) {
    val context = LocalContext.current
    NavHost(navController = navController, startDestination = "main") {
        composable(route = "main") {
            val viewModel: LoginViewModel = remember { LoginViewModel(context) }
            val state = viewModel.loginState.collectAsState().value

            LoginScreen(
                loginState = state,
                onInputUser = { value -> viewModel.onInputUser(value)},
                onInputPassword = { value -> viewModel.onInputPassword(value) },
                onStartLogin = { viewModel.onStartLogin(navController) },
                onRegister = { viewModel.onRegister(navController) },
                onForgetPassword = { viewModel.onForgetPassword(navController) }
            )
        }

        composable(route = "register") {
            val viewModel: SingUpViewModel = remember { SingUpViewModel() }
            val state = viewModel.singUpState.collectAsState().value

            SignUpScreen(
                navController = navController,
                singUpState = state,
                onSelectDocument = { value -> viewModel.onSelectDocument(value) },
                onInputDocument = { value -> viewModel.onInputDocument(value) },
                onInputBirthDay = { value -> viewModel.onInputBirthDay(value) },
                onInputCelPhone = { value -> viewModel.onInputCelPhone(value) },
                onInputName = { value -> viewModel.onInputName(value) },
                onClicked = {}
            )
        }
        composable(route = "home") {
            HomeScreen(
                navController = navController,
                //onClicked = {}
            )
        }
        composable(route = "forget") {
            ForgetPasswordScreen()
        }
    }
}
