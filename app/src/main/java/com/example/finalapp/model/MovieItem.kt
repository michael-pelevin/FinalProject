package com.example.finalapp.model

data class MovieItem(
    val actors: List<String>,
    val age: Any,
    val budget: Any,
    val composers: List<String>,
    val countries: List<String>,
    val description: String,
    val directors: List<String>,
    val editors: List<String>,
    val fees_russia: Any,
    val fees_world: Any,
    val frames: List<String>,
    val genres: List<String>,
    val id_kinopoisk: Int,
    val imdb_votes: String,
    val kinopoisk_votes: String,
    val operators: List<String>,
    val painters: List<String>,
    val poster: String,
    val premiere_russia: Any,
    val premiere_world: String,
    val producers: List<String>,
    val rating_imdb: String,
    val rating_kinopoisk: String,
    val screenshots: List<String>,
    val screenwriters: List<String>,
    val seasons: String,
    val tagline: String,
    val title: String,
    val title_alternative: String,
    val type: String,
    val year: Int
)