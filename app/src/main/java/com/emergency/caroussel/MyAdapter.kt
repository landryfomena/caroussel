package com.emergency.caroussel

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.viewpager.widget.PagerAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MyAdapter(internal var context: Context, internal var movieList:List<Movie>):PagerAdapter() {
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view==`object`
    }
    override fun getCount(): Int {

        return movieList.size
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object`as View)
    }


    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = LayoutInflater.from(context).inflate(R.layout.card_item,container,false)
        val movie_image=view.findViewById<ImageView>(R.id.movie_image)
        val movie_title=view.findViewById<TextView>(R.id.movie_title)
        val movie_description=view.findViewById<TextView>(R.id.movie_description)
        val btn_fav=view.findViewById<FloatingActionButton>(R.id.btn_fav)

        movie_image.setImageResource(movieList[position].image)
        movie_title.text = movieList[position].name
        movie_description.text=movieList[position].description
        view.setOnClickListener {
            Toast.makeText(context,""+movieList[position].name,Toast.LENGTH_SHORT).show()
        }
        btn_fav.setOnClickListener {
            Toast.makeText(context,""+"button cliked add to fav",Toast.LENGTH_SHORT).show()
        }
        container.addView(view)
        return view
    }
}