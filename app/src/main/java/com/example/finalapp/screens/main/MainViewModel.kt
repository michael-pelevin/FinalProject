package com.example.finalapp.screens.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.finalapp.data.repository.Repository
import com.example.finalapp.model.Movie
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel : ViewModel() {

    var repository = Repository()
    val moviesList: MutableLiveData<Response<Movie>> = MutableLiveData()

    fun getMovies(){
        viewModelScope.launch {
            moviesList.value = repository.getMovie()
        }
    }
}