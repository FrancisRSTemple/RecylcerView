package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        val images = arrayOf(
            R.drawable.black_bowser_bomb_centered_pfp,
            R.drawable.bowser_d_smash,
            R.drawable.bowser_f_tilt,
            R.drawable.bowser_fair,
            R.drawable.bowser_side_b
        )

        recyclerView.adapter = ImageAdapter(images)

        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}