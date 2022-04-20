package com.example.finalapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MovieViewModel : ViewModel() {
    var movieData : MutableLiveData<Movie> = MutableLiveData()

    val getMovieData: MutableLiveData<Movie>
        get() = movieData

    fun setMovieData(newMovieData: Movie){
        movieData.value = newMovieData
    }

}