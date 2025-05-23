package pe.leomer.clinica.data.model

import com.google.gson.annotations.SerializedName

data class LogonRequest(
    @SerializedName("user_id") val userId: String,
    @SerializedName("password") val password: String
)
