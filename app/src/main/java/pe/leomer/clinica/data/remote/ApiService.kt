package pe.leomer.clinica.data.remote

import pe.leomer.clinica.data.model.ApiResponse
import pe.leomer.clinica.data.model.Logon
import pe.leomer.clinica.data.model.LogonRequest
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("/login")
    suspend fun getLogon(
        @Body request: LogonRequest
    ): ApiResponse<Logon>
}