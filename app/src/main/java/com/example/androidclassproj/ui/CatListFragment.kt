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

        cats.add(Cat("Tabby", "Orange", "Bertie", 6, "https://cdn.discordapp.com/attachments/710398709598257235/1075870042937368616/image.png"))
        cats.add(Cat("Tabby", "Orange", "Belka", 5, "https://cdn.discordapp.com/attachments/710398709598257235/1075870611441713273/image.png"))
        cats.add(Cat("Siamese", "White", "Bean", 1, "https://cdn.discordapp.com/attachments/710398709598257235/1075870773073412107/e08gjd.jpg"))
        cats.add(Cat("Shorthair", "Black+White", "Frank", 8, "https://cdn.discordapp.com/attachments/710398709598257235/1075873383679537342/image.png"))
        cats.add(Cat("Tabby", "Gray", "Basil", 4, "https://cdn.discordapp.com/attachments/710398709598257235/1075871097196658809/image.png"))
        cats.add(Cat("British Shorthair", "Calico", "Aiko", 4, "https://cdn.discordapp.com/attachments/710398709598257235/1075872407815999580/image.png"))
        cats.add(Cat("Tabby", "Gray+White", "GC", 3, "https://cdn.discordapp.com/attachments/710398709598257235/1075871535581122660/image.png"))
        cats.add(Cat("Shorthair", "Black", "Snick", 18, "https://cdn.discordapp.com/attachments/710398709598257235/1075871887894257816/image.png"))
        cats.add(Cat("British Shorthair", "Gray", "Cheezburger", 20, "https://cdn.discordapp.com/attachments/710398709598257235/1075872700708438026/image.png"))



        val adapter = CatAdapter(cats)
        recyclerView.adapter = adapter

        return view
    }
}

