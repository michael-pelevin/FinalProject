package com.example.finalapp.screens.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.finalapp.R
import com.example.finalapp.model.MovieItem

class MainAdapter: RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    var movieList = emptyList<MovieItem>()

    class MainViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val poster: ImageView = itemView.findViewById(R.id.movie_logo)
        val title: TextView = itemView.findViewById(R.id.movie_title)
        val genre: TextView = itemView.findViewById(R.id.alternative_title_and_year)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_short_item, parent, false)
        return MainViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val movie = movieList[position]
        with(holder){
            genre.text = movie.genres[0]
            title.text = movie.title
            Glide.with(holder.itemView.getContext()).load(movie.poster.toString()).centerCrop().into(poster)
        }
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    @JvmName("setMovieList1")
    fun setMovieList(list:List<MovieItem>){
        movieList = list
        notifyDataSetChanged()
    }
}