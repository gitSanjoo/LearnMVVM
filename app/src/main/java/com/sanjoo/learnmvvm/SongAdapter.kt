package com.sanjoo.learnmvvm

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class SongAdapter(val list:List<Songs>): RecyclerView.Adapter<SongAdapter.SongViewHolder>() {

    class SongViewHolder(itemView:View):ViewHolder(itemView){
        var title=itemView.findViewById<TextView>(R.id.song_name)
        var desdescription=itemView.findViewById<TextView>(R.id.description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder {
        val layoutInflater=LayoutInflater.from(parent.context)
        val view=layoutInflater.inflate(R.layout.item_song_view,parent,false)
        return SongViewHolder(view)
    }

    override fun getItemCount(): Int {
            return list.size
    }

    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
            holder.title.text=list[position].title
            holder.desdescription.text=list[position].description
    }
}