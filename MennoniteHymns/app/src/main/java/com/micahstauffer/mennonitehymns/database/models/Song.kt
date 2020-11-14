package com.micahstauffer.mennonitehymns.database.models

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "songs")
data class Song (
        @ColumnInfo(name = "number")
        val Number: Int = 0,
        @ColumnInfo(name = "title")
        val Title: String = "",
        @ColumnInfo(name = "tune_id")
        val TuneId: String = "",
        @ColumnInfo(name = "book_section_id")
        val BookSectionId: String = "",
        @ColumnInfo(name = "meter_id")
        val Meter_Id: String = "",
        @ColumnInfo(name = "begins_page")
        val BeginsPage: Int = 0,
        @ColumnInfo(name = "ends_page")
        val EndsPage: Int = 0
) : BaseModel()