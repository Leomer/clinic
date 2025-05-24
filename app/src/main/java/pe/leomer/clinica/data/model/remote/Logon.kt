package pe.leomer.clinica.data.model.remote

data class Logon(
    val codigo_usuario: String,
    val nombre: String,
    val citas: List<Appointment>
)
