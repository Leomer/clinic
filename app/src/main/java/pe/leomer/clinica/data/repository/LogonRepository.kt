package pe.leomer.clinica.data.repository

import android.content.Context
import androidx.room.Room
import pe.leomer.clinica.data.local.dao.LogonDao
import pe.leomer.clinica.data.local.db.DatabaseProvider
import pe.leomer.clinica.data.local.entity.UserEntity
import pe.leomer.clinica.data.model.remote.Logon
import pe.leomer.clinica.data.model.remote.LogonRequest
import pe.leomer.clinica.data.remote.RetrofitClient

class LogonRepository(private val context: Context) {
    private val db = DatabaseProvider.getDatabase(context)
    private val userDao = db.userDao()

    suspend fun getLogon(document: String, password: String): Logon? {

        var response = RetrofitClient.api.getLogon(
            documentNumber = document,
            password = password
        )

        if (response.code == 0) {
            val logon = response.data
            logon?.let {
                val user = UserEntity(
                    userCode = it.codigo_usuario,
                    name = it.nombre
                )
                userDao.insertUser(user)
            }
            return logon
        } else {
            return null
        }
    }
}