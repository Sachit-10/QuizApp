package com.example.quiz

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.selects.select


@Dao
interface history_dao {

    @Insert
    fun insert(item:historyentity)

    @Query("Select * from quiz_history")
    fun getalldata():LiveData<List<historyentity>>
}