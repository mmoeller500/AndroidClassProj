package com.example.androidclassproj

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CatAdapter(private val cats: List<Cat>) : RecyclerView.Adapter<CatAdapter.CatViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = CatViewHolder (
        LayoutInflater.from(parent.context)
            .inflate(R.layout.cat_card, parent, false)
    )

    override fun getItemCount() = cats.size

    override fun onBindViewHolder(holder: CatViewHolder, position: Int) {
        val cat = cats[position]
        holder.catImage.setImageResource(cat.image)
        holder.catName.text = cat.name
        holder.catAge.text = cat.age.toString()
        holder.catBreed.text = cat.breed
        holder.catColor.text = cat.color
    }

    class CatViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val catImage: ImageView = itemView.findViewById(R.id.cat_image)
        val catName: TextView = itemView.findViewById(R.id.cat_name)
        val catAge: TextView = itemView.findViewById(R.id.cat_age)
        val catBreed: TextView = itemView.findViewById(R.id.cat_breed)
        val catColor: TextView = itemView.findViewById(R.id.cat_color)
    }
}