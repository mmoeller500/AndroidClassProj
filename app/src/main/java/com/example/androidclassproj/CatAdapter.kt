package com.example.androidclassproj

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CatAdapter(private val cats: List<Cat>) : RecyclerView.Adapter<CatAdapter.CatViewHolder()> {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.cat_card_view, parent)
        return CatViewHolder(view)
    }

    class CatViewHolder(itemView: View) : RecyclerView.ViewHolder(itenView) {
        val catImage: ImageView = itemView.findViewById(R.id.cat_image)
        val catName: TextView = itemView.findViewById(R.id.cat_name)
        val catAge: TextView = itemView.findViewById(R.id.cat_age)

    }
}