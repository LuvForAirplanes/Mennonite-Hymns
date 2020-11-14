package com.micahstauffer.mennonitehymns.database.models

import androidx.room.PrimaryKey

open class BaseModel(
        @PrimaryKey()
        var id: String = ""
)