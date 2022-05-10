package com.example.finalapp.screens

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.finalapp.Movie

class BookmarksViewModel : ViewModel() {

    private val bookmarks = ArrayList<Movie>()
    private val bookmarksLiveData = MutableLiveData<List<Movie>>()

    val getBookmarksData: MutableLiveData<List<Movie>>
        get() = bookmarksLiveData

    fun addMovieToBookmarks(movie: Movie){
        bookmarks.add(movie)
        bookmarksLiveData.value = bookmarks
    }
}