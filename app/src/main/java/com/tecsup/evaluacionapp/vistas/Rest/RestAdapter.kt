package com.tecsup.evaluacionapp.vistas.Rest

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class RestAdapter(val list: List<Rest>): RecyclerView.Adapter<RestViewHolder>(){

    override fun getItemCount(): Int = list.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return RestViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: RestViewHolder, position: Int) {
        val rest = list[position]
        holder.bind(rest)
    }


}