package com.oscarrecinos.proyecto.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.oscarrecinos.proyecto.data.entity.Medidas

@Dao
interface CalculadoraDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun AgregarMedida(medidas: Medidas)


    @Query("SELECT * FROM medidas_table ORDER BY Fecha ASC ")
    fun ObtenerMedidas(): LiveData<List<Medidas>>

}