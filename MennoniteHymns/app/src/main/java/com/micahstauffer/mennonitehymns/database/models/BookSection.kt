package com.micahstauffer.mennonitehymns.database.models

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "book_sections")
data class BookSection (
        @ColumnInfo(name = "name")
        val Name: String = "",
        @ColumnInfo(name = "book_part_id")
        val BookPartId: String = ""
) : BaseModel()