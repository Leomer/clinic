package pe.leomer.clinica.data.repository

import pe.leomer.clinica.data.model.remote.ApiResponse
import pe.leomer.clinica.data.model.remote.UserRequest
import pe.leomer.clinica.data.remote.RetrofitClient

class UserRepository {
    suspend fun registerUser(request: UserRequest): ApiResponse<Unit> {
        return RetrofitClient.api.postUser(request)
    }
}