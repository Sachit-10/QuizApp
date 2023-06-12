package com.example.quiz

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate

@Entity(tableName = "quiz_history")
data class historyentity(

    @PrimaryKey(autoGenerate = true)
    var id:Int?=null,

    var subject_name:String,

    var score:Int,

    var date:String

)
