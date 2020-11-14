package com.micahstauffer.mennonitehymns.database.repositories

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.micahstauffer.mennonitehymns.database.models.Song

/**
 * Defines methods for using the Song class with Room.
 */
@Dao
interface SongDatabaseRepository {
    @Insert
    suspend fun add(song: Song)

    @Update
    suspend fun update(song: Song)

    @Query("SELECT * from songs WHERE id = :key")
    suspend fun getbyId(key: String): Song?

    @Query("SELECT * FROM songs ORDER BY number DESC")
    fun toList(): LiveData<List<Song>>
}
