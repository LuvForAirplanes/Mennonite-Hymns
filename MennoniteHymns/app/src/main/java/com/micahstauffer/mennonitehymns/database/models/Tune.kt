package com.micahstauffer.mennonitehymns.database.models

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "tunes")
data class Tune (
        @ColumnInfo(name = "name")
        val Name: String = ""
) : BaseModel()