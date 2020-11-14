package com.micahstauffer.mennonitehymns.database.models

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "meters")
data class Meter (
        @ColumnInfo(name = "name")
        val Name: String = ""
) : BaseModel()