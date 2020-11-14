package com.micahstauffer.mennonitehymns.database.models

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "song_sections")
data class SongSection (
        @ColumnInfo(name = "type")
        val Type: String = "",
        @ColumnInfo(name = "song_id")
        val SongId: String = "",
        @ColumnInfo(name = "order")
        val Order: Int = 0
) : BaseModel()