package com.micahstauffer.mennonitehymns.database.models

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "book_parts")
data class BookPart (
        @ColumnInfo(name = "name")
        val Name: String = ""
) : BaseModel()