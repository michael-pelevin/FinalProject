package com.example.finalapp

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MovieAdapter: RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    private var movies = Movie.getMovies()

    class MovieViewHolder(itemView: View): RecyclerView.ViewHolder (itemView){
        val movieLogo: ImageView = itemView.findViewById(R.id.movie_logo)
        val title: TextView = itemView.findViewById(R.id.movie_title)
        val alternativeTitle: TextView = itemView.findViewById(R.id.alternative_title_and_year)
//        val deleteBtn: ImageView = itemView.findViewById(R.id.delete_movie_btn)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_list_item, parent, false)
        return MovieViewHolder(view)
    }

    @SuppressLint("SetTextI18n", "ResourceType")
    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movies[position]
        with(holder){
            title.text = movie.title
            alternativeTitle.text = movie.title_alternative + ", "+ movie.year

            Glide.with(holder.itemView.getContext()).load(movie.poster.toString()).centerCrop().into(movieLogo)
        }

    }

    override fun getItemCount(): Int {
        return movies.size
    }

    fun clear() {
        movies = emptyList<Movie>()
        notifyDataSetChanged()
    }

    fun addAll() {
        movies = Movie.getMovies().shuffled()
        notifyDataSetChanged()
    }
}