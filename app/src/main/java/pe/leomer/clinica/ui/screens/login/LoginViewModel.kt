package pe.leomer.clinica.ui.screens.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import pe.leomer.clinica.data.repository.LogonRepository

class LoginViewModel: ViewModel() {

    private val repository = LogonRepository()

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

        viewModelScope.launch {
            try {
                val getLogon = repository.getLogon(
                    user = loginState.value.user,
                    pass =  loginState.value.password
                )

                if (getLogon == null || getLogon.appointment.isEmpty()) {
                    println("Error conexion")
                } else {
                    navController?.navigate(route = "home") {
                        popUpTo("main") { inclusive = true}
                    }
                }

            } catch(e: Exception) {
                println(e.message)
            }
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