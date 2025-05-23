package pe.leomer.clinica.data.model

data class Logon(
    val name: String,
    val appointment: List<Appointment>
)
