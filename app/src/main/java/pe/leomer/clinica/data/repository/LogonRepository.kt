package pe.leomer.clinica.data.repository

import pe.leomer.clinica.data.model.Logon
import pe.leomer.clinica.data.model.LogonRequest
import pe.leomer.clinica.data.remote.RetrofitClient

class LogonRepository {
    suspend fun getLogon(user: String, pass: String): Logon? {

        val logonRequest = LogonRequest(user, pass)
        println("logonRequest: $logonRequest")

        val response = RetrofitClient.api.getLogon(logonRequest)

        if (response.code == 0) {
            return response.data
        } else {
            //throw Exception("Error: ${response.code}")
            return null
        }
    }
}