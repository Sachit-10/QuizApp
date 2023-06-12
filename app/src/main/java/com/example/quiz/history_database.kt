package com.example.quiz

import android.content.Context
import android.provider.CalendarContract
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database (entities = [historyentity::class] , version = 1, exportSchema = false)
abstract class history_database : RoomDatabase() {

abstract fun historydao(): history_dao

companion object {

    @Volatile
    private var INSTANCE : history_database?=null

    fun getinstance(context: Context):history_database {

        kotlin.synchronized(this){

            var instance= INSTANCE

            if(instance==null){

                instance = Room.databaseBuilder(context,history_database::class.java,"quiz_history").allowMainThreadQueries().build()

                INSTANCE=instance
            }

            return instance
        }
    }
}
}