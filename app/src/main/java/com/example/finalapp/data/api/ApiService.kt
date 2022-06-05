package com.example.finalapp.data.api

import com.example.finalapp.model.Movie
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("movie?field=rating.kp&search=7-10&field=year&search=2017-2020&field=typeNumber&search=2&sortField=year&sortType=1&sortField=votes.imdb&sortType=-1&token=ZQQ8GMN-TN54SGK-NB3MKEC-ZKB8V06")
    suspend fun getMovie(): Response<Movie>
}