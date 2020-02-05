package com.emergency.caroussel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
internal var movieList:MutableList<Movie> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initData()
        var adapter= MyAdapter(this@MainActivity,movieList)
        view_pager.adapter=adapter
    }
    private fun initData(){
        movieList.add(Movie("A Q U A M A N",getString(R.string.text_long),R.drawable.childhow))
        movieList.add(Movie("BUMBLE BEE",getString(R.string.text_long),R.drawable.person))
        movieList.add(Movie("JOHN WICK",getString(R.string.text_long),R.drawable.white_plastic))
        movieList.add(Movie("MATHIS DELIRG",getString(R.string.text_long),R.drawable.childhow))
        movieList.add(Movie("VIRGIL VAN DICK",getString(R.string.text_long),R.drawable.person))
    }
}
