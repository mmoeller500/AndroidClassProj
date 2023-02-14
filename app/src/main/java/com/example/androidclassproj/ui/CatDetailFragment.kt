package com.example.androidclassproj.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidclassproj.R

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


        }

        return view
    }
}