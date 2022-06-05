package com.example.finalapp.screens.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.finalapp.R
import com.example.finalapp.screens.movie.MovieFragment

class MainFragment : Fragment() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: MainAdapter

    private val movieFragment = MovieFragment()

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        val v = inflater.inflate(R.layout.main_fragment, container, false)
        recyclerView = v.findViewById<RecyclerView>(R.id.main_rv)
        adapter = MainAdapter()
        recyclerView.adapter = adapter

        viewModel.getMovies()
        viewModel.moviesList.observe(viewLifecycleOwner,{response ->
            Log.d("Response", response.toString())
            response.body()?.let { adapter.setMovieList(it) }
        })

        return v
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        val toMovieBtn = view.findViewById<Button>(R.id.toMovieBtn)
//        toMovieBtn.setOnClickListener {
//            val transaction = requireActivity().supportFragmentManager.beginTransaction()
//            transaction.replace(R.id.content_container, movieFragment).addToBackStack(null)
//            transaction.commit()
//        }
    }

}