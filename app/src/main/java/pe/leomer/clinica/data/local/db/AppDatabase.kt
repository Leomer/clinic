package pe.leomer.clinica.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import pe.leomer.clinica.data.local.dao.UserDao
import pe.leomer.clinica.data.local.entity.UserEntity



@Database(entities = [UserEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}