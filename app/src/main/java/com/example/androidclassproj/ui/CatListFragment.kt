package com.example.androidclassproj.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androidclassproj.Cat
import com.example.androidclassproj.CatAdapter
import com.example.androidclassproj.R


class CatListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_cat_list, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.cat_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        val cats = mutableListOf<Cat>()

        cats.add(Cat("Tabby", "Orange", "Bertie", 6, R.drawable.catttttt))
        cats.add(Cat("Tabby", "Orange", "Belka", 5, R.drawable.catttttt))
        cats.add(Cat("Siamese", "White", "Bean", 1, R.drawable.catttttt))
        cats.add(Cat("Tabby", "Gray", "Basil", 4, R.drawable.catttttt))
        cats.add(Cat("Tabby", "Brown", "John", 13, R.drawable.catttttt))
        cats.add(Cat("Shorthair", "Black", "Snick", 18, R.drawable.catttttt))
        cats.add(Cat("Calico", "Orange+Black", "Iris", 4, R.drawable.catttttt))
        cats.add(Cat("Shorthair", "Gray+White", "Barry", 7, R.drawable.catttttt))
        cats.add(Cat("Sphinx", "Pink", "Monster", 8, R.drawable.catttttt))
        cats.add(Cat("British Shorthair", "Gray", "Cheezburger", 20, R.drawable.catttttt))

        //github just deleted a day of progress. Awesome!


        val adapter = CatAdapter(cats)
        recyclerView.adapter = adapter

        return view
    }
}

