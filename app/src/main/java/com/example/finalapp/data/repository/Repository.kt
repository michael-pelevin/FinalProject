package com.example.finalapp.data.repository

import com.example.finalapp.data.api.RetrofitInstance
import com.example.finalapp.model.Movie
import com.example.finalapp.model.MovieItem
import retrofit2.Response

class Repository {

    suspend fun getMovie(): Response<Movie> {
        return RetrofitInstance.api.getMovie()
    }
}