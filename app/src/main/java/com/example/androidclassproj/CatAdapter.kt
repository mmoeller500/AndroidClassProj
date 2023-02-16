package com.example.androidclassproj

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.fragment.app.commit
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.androidclassproj.ui.CatDetailFragment

class CatAdapter(private val cats: List<Cat>) : RecyclerView.Adapter<CatAdapter.CatViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.cat_card, parent, false)
        return CatViewHolder(view) { position ->
            val cat = cats[position]

            val bundle = bundleOf(
                "name" to cat.name,
                "breed" to cat.breed,
                "age" to cat.age.toString(),
                "color" to cat.color,
                "image" to cat.image
            )

            val detailFragment = CatDetailFragment()
            detailFragment.arguments = bundle

            val activity = view.context as AppCompatActivity

            activity.supportFragmentManager.commit {
                setReorderingAllowed(true)
                replace(R.id.fragment_container_view, detailFragment)
                addToBackStack(null)
            }
        }
    }

    override fun getItemCount() = cats.size

    override fun onBindViewHolder(holder: CatViewHolder, position: Int) {
        val cat = cats[position]
        Glide
            .with(holder.itemView.context)
            .load(cat.image)
            .into(holder.catImage)
        holder.catName.text = cat.name
        holder.catAge.text = cat.age.toString()
        //holder.catBreed.text = cat.breed
        holder.catColor.text = cat.color
    }

    inner class CatViewHolder(
        itemView: View,
        private val onItemClick: (adapterPosition: Int) -> Unit
    ) : RecyclerView.ViewHolder(itemView) {
        val catImage: ImageView = itemView.findViewById(R.id.cat_image)
        val catName: TextView = itemView.findViewById(R.id.cat_name)
        val catAge: TextView = itemView.findViewById(R.id.cat_age)
        //val catBreed: TextView = itemView.findViewById(R.id.cat_breed)
        val catColor: TextView = itemView.findViewById(R.id.cat_color)
        init {
            itemView.setOnClickListener {
                onItemClick(adapterPosition)
            }
        }
    }
}