package pe.leomer.clinica.data.model.remote

import com.google.gson.annotations.SerializedName

data class UserRequest(
    @SerializedName("tipo_documento") val DocumentType: String,
    @SerializedName("numero_documento") val DocumentNumber: String,
    @SerializedName("nombre") val name: String,
    @SerializedName("apellido_paterno") val lastName: String,
    @SerializedName("apellido_materno") val lastName2: String,
    @SerializedName("correo_electronico") val email: String,
    @SerializedName("numero_celular") val celPhoneNumber: String,
    @SerializedName("fecha_nacimiento") val birthDay: String,
    @SerializedName("genero") val genre: String,
    @SerializedName("contrasena") val pass: String
)
