package com.example.androidclassproj

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androidclassproj.ui.CatListFragment
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

//        supportFragmentManager
//            .beginTransaction()
//            .add(R.id.fragment_container_view, CatListFragment())
//            .commit()

        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add(R.id.fragment_container_view, CatListFragment())
            addToBackStack(null)
        }


    }

    /*private fun createCat(index: Int) = Cat(
        breed = "Tabby",
        name = "Bert",
        age = Random.nextInt(1, 20),
        image = R.drawable.catttttt
    )*/

}