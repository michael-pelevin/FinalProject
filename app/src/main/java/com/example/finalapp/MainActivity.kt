package com.example.finalapp

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.finalapp.screens.BookmarksFragment
import com.example.finalapp.screens.MainFragment
import com.example.finalapp.screens.SearchFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private val mainFragment = MainFragment()
    private val searchFragment = SearchFragment()
    private val bookmarksFragment = BookmarksFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(savedInstanceState == null){
            replaceFragment(mainFragment)
        }
        val bottom_navigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottom_navigation.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.main -> replaceFragment(mainFragment)
                R.id.search -> replaceFragment(searchFragment)
                R.id.bookmarks -> replaceFragment(bookmarksFragment)

        }
        true
        }
    }

    private fun replaceFragment(fragment: Fragment){
        if(fragment != null){
            val transaction = supportFragmentManager.beginTransaction().addToBackStack(null)
            transaction.replace(R.id.content_container, fragment)
            transaction.commit()
        }
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.getItemId()) {
            android.R.id.home -> {
                super.onBackPressed()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}