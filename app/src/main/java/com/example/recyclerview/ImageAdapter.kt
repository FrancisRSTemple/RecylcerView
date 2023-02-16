package com.example.recyclerview

import android.provider.ContactsContract.CommonDataKinds.Im
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter (_imageItems: Array<ImageItem>) : RecyclerView.Adapter<ImageAdapter.ImageItemViewHolder>(){

    private val imageItems = _imageItems

    /*the inner keyword here means an instance of ImageItemViewHolder
    will only ever exist inside an instance of ImageAdapter

    this will allow members of ImageItemViewHolder to
    access members of ImageAdapter
    */
    inner class ImageItemViewHolder(layout: View) : RecyclerView.ViewHolder(layout){
        val imagineView = layout.findViewById<ImageView>(R.id.imageView)
        val textView = layout.findViewById<TextView>(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageItemViewHolder {
        return ImageItemViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ImageItemViewHolder, position: Int) {
        holder.imagineView.setImageResource(imageItems[position].id)
        holder.textView.text = imageItems[position].name
    }

    override fun getItemCount() = imageItems.size
}