package pe.leomer.clinica.ui.screens.login

import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class LoginViewModel: ViewModel() {

    private val _loginState = MutableStateFlow(
        LoginState.initState()
    )

    val loginState: StateFlow<LoginState> get() = _loginState


    fun onInputUser(value: String) {
        _loginState.value = loginState.value.copy(
            user = value
        )
    }

    fun onInputPassword(value: String) {
        _loginState.value = loginState.value.copy(
            password = value
        )
    }

    fun onStartLogin(navController: NavController?) {
        navController?.navigate(route = "home") {
            popUpTo("main") { inclusive = true}
        }
    }

    fun onForgetPassword(navController: NavController?) {
        navController?.navigate(route = "forget") {
            popUpTo("main") { inclusive = true}
        }
    }

    fun onRegister(navController: NavController?) {
        navController?.navigate(route = "register") {
            popUpTo("main") { inclusive = true}
        }
    }

}