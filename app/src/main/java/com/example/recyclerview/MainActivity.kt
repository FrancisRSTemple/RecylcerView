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
            ImageItem(R.drawable.black_bowser_bomb_centered_pfp, "BowserBomb"),
            ImageItem(R.drawable.bowser_d_smash, "Bowser Down Smash"),
            ImageItem(R.drawable.bowser_f_tilt, "Bowser F Tilt"),
            ImageItem(R.drawable.bowser_fair, "Bowser FAir"),
            ImageItem(R.drawable.bowser_side_b, "Bowser Side B")
        )

        recyclerView.adapter = ImageAdapter(images)

        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}