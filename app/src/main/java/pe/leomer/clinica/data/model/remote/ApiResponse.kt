package pe.leomer.clinica.data.model.remote

data class ApiResponse<T>(
    val code: Int,
    val message: String,
    val data: T
)
