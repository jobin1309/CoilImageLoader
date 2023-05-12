package com.example.coil

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import coil.load


class ViewPagerAdapter(
    val images: List<String>
) : RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>() {

    inner class ViewPagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_layout, parent, false)
        return ViewPagerViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        val item = images[position]
        holder.itemView.findViewById<ImageView>(R.id.imageView2).load(item){
            crossfade(true)
            crossfade(600)
            placeholder(R.drawable.ic_launcher_background)
        }
    }



    override fun getItemCount(): Int {
        return images.size
    }

}
