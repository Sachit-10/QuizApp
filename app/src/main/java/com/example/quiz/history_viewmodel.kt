package com.example.quiz

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData

class history_viewmodel(application: Application): AndroidViewModel(application) {

    val repository:history_repository

    init {
        val dao = history_database.getinstance(application).historydao()
        repository= history_repository(dao)
    }

    fun insert(item:historyentity){
      repository.insert(item)
    }

    fun getalrecords():LiveData<List<historyentity>> =  repository.getallrecords()



}