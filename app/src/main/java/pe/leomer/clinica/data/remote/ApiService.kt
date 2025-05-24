package pe.leomer.clinica.data.remote

import pe.leomer.clinica.data.model.remote.ApiResponse
import pe.leomer.clinica.data.model.remote.Logon
import pe.leomer.clinica.data.model.remote.UserRequest
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiService {
    @GET("principal")
    //@GET("/login")
    suspend fun getLogon(
        @Query("numero_documento") documentNumber: String,
        @Query("contrasena") password: String
    ): ApiResponse<Logon>

    @POST("usuario")
    suspend fun postUser(
        @Body userRequest: UserRequest
    ): ApiResponse<Unit>
}