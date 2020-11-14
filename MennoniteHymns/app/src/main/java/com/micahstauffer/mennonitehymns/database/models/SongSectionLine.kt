package com.micahstauffer.mennonitehymns.database.models

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "song_section_lines")
data class SongSectionLine (
        @ColumnInfo(name = "order")
        val Order: Int = 0,
        @ColumnInfo(name = "line")
        val Line: String = "",
        @ColumnInfo(name = "song_section_id")
        val SongSectionId: String = ""
) : BaseModel()