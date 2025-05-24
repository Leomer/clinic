package pe.leomer.clinica.ui.screens.signup

data class SingUpState(
    val documentSelected: String,
    val documentNumber: String,
    val birthDay: String,
    val email: String,
    val name: String,
    val celPhoneNumber: String,
    val code: String
) {
    companion object {
        fun initState() = SingUpState(
            documentSelected = "DNI",
            documentNumber = "",
            birthDay = "",
            email = "-",
            name = "",
            celPhoneNumber = "",
            code = "051 - Lima Perú"
        )
    }
}
