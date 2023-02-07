package com.example.androidclassproj

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val recyclerView = findViewById<RecyclerView>(R.id.cat_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val cats = mutableListOf<Cat>()

        for (i in 0..30) {
            cats.add(createCat())
        }

        val adapter = CatAdapter(cats)
        recyclerView.adapter = adapter
    }

    private fun createCat() = Cat(
        breed = "Tabby",
        name = "Bert",
        age = Random.nextInt(1, 20),
        image = R.drawable.catttttt
    )
}