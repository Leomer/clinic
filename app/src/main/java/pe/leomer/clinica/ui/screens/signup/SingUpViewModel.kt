package pe.leomer.clinica.ui.screens.signup

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import pe.leomer.clinica.data.model.remote.UserRequest
import pe.leomer.clinica.data.repository.UserRepository

class SingUpViewModel(): ViewModel() {

    private val _singUpState = MutableStateFlow(
        SingUpState.initState()
    )

    val singUpState: StateFlow<SingUpState> get() = _singUpState

    fun onSelectDocument(value: String) {
        _singUpState.value = _singUpState.value.copy(
            documentSelected = value
        )
    }

    fun onInputDocument(value: String) {
        _singUpState.value = _singUpState.value.copy(
            documentNumber = value
        )
    }

    fun onInputBirthDay(value: String) {
        _singUpState.value = _singUpState.value.copy(
            birthDay = value
        )
    }

    fun onInputCelPhone(value: String) {
        _singUpState.value = _singUpState.value.copy(
            celPhoneNumber = value
        )
    }

    fun onInputName(value: String) {
        _singUpState.value = _singUpState.value.copy(
            name = value
        )
    }


    fun onContinue(navController: NavController?) {
        println("Register User")
        val singUpState = _singUpState.value
        val repository = UserRepository()



        val request = UserRequest(
            email = singUpState.email,
            celPhoneNumber = singUpState.celPhoneNumber,
            name = singUpState.name,
            pass = "12345",
            genre = "M",
            birthDay = singUpState.birthDay,
            lastName = "1",
            DocumentNumber = singUpState.documentNumber,
            lastName2 = "1",
            DocumentType = singUpState.documentSelected

        )

        viewModelScope.launch {
            try {
                val postUser = repository.registerUser(request)
                navController?.navigate(route = "main") {
                    popUpTo("register") { inclusive = true}
                }
            } catch(e: Exception) {
                println(e.message)
            }
        }
    }

}