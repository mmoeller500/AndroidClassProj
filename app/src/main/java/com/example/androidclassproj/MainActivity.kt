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

       /* for (i in 0..30) {
            cats.add(createCat(i))
        }
        */

        cats.add(Cat("Tabby","Orange","Bertie",6,R.drawable.catttttt))
        cats.add(Cat("Tabby","Orange","Belka",5,R.drawable.catttttt))
        cats.add(Cat("Siamese","White","Bean",1,R.drawable.catttttt))
        cats.add(Cat("Tabby","Gray","Basil",4,R.drawable.catttttt))
        cats.add(Cat("Tabby","Brown","John",13,R.drawable.catttttt))
        cats.add(Cat("Shorthair","Black","Snick",18,R.drawable.catttttt))
        cats.add(Cat("Calico","Orange+Black","Iris",4,R.drawable.catttttt))
        cats.add(Cat("Shorthair","Gray+White","Barry",7,R.drawable.catttttt))
        cats.add(Cat("Sphinx","Pink","Monster",8,R.drawable.catttttt))
        cats.add(Cat("British Shorthair","Gray","Cheezburger",20,R.drawable.catttttt))

        val adapter = CatAdapter(cats)
        recyclerView.adapter = adapter
    }

    /*private fun createCat(index: Int) = Cat(
        breed = "Tabby",
        name = "Bert",
        age = Random.nextInt(1, 20),
        image = R.drawable.catttttt
    )*/

}