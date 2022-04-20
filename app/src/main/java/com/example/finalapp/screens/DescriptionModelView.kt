package com.example.finalapp.screens

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DescriptionModelView: ViewModel() {
    var description : MutableLiveData<String> = MutableLiveData()

    val getDescription: MutableLiveData<String>
        get() = description

    fun setDescription(newMovieData: String){
        description.value = newMovieData
    }
}