package com.example.androidclassproj.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.androidclassproj.R
import com.bumptech.glide.Glide

class CatDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_cat_detail, container, false)
        if (arguments != null) {
            val name = requireArguments().getString("name")
            val breed = requireArguments().getString("breed")
            val age = requireArguments().getString("age")
            val color = requireArguments().getString("color")
            val image = requireArguments().getString("image")

            view.findViewById<TextView>(R.id.cat_name).text = name
            view.findViewById<TextView>(R.id.cat_breed).text = "Breed: $breed"
            view.findViewById<TextView>(R.id.cat_age).text = "Age: $age"
            view.findViewById<TextView>(R.id.cat_color).text = "Color: $color"

            Glide
                .with(this)
                .load(image)
                .into(view.findViewById(R.id.cat_image))
        }

        return view
    }
}