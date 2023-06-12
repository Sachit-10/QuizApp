package com.example.quiz

import androidx.lifecycle.LiveData

class history_repository ( val dao:history_dao) {

    fun insert(item:historyentity){
        return dao.insert(item)
    }

    fun getallrecords():LiveData<List<historyentity>>{
        return dao.getalldata()
    }
}