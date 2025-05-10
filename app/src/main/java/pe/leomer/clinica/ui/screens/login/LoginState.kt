package pe.leomer.clinica.ui.screens.login

data class LoginState(
    val user: String,
    val password: String
){
    companion object {
        fun initState() = LoginState(
            user = "",
            password = ""
        )
    }

}