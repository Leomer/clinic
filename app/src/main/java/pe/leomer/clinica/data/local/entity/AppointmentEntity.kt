package pe.leomer.clinica.data.local.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index

/*
@Entity(
    tableName = "appointments",
    foreignKeys = [ForeignKey(
        entity = UserEntity::class,
        parentColumns = ["id"],
        childColumns = ["userId"],
        onDelete = ForeignKey.CASCADE
    )],
    indices = [Index("userId")]
)
data class AppointmentEntity(
    val specialty: String,
    val medicName: String,
    val date: String,
    val time: String,
)
*/
