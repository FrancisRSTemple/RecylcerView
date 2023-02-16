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
        /*
        this returns an ImageViewHolder object without assigning to variable first


         */
        return ImageViewHolder(
            ImageView(
                parent.context
            ).apply {
                layoutParams = ViewGroup.LayoutParams(1000,1000)
            }
        )
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.imageView.setImageResource(images[position])
    }

    override fun getItemCount() = images.size
}