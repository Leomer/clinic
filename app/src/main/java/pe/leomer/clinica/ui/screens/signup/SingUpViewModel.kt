package pe.leomer.clinica.ui.screens.signup

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

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

}