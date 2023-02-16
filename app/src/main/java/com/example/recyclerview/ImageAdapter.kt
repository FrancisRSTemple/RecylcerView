package com.example.recyclerview

import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter (_images: Array<Int>) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>(){

    private val images = _images

    class ImageViewHolder(_imageView: ImageView) : RecyclerView.ViewHolder(_imageView){
        val imageView = _imageView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount() = images.size
}