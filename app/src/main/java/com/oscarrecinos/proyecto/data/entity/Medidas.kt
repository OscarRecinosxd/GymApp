package com.oscarrecinos.proyecto.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "medidas_table")
data class Medidas(
    @PrimaryKey
    val Estatura:Double,
    val Peso:Double,
    val Fecha:Date
)