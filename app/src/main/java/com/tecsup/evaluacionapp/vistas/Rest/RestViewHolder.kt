package com.tecsup.evaluacionapp.vistas.Rest

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tecsup.evaluacionapp.R


class RestViewHolder(inflater: LayoutInflater, parent: ViewGroup):
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_rest, parent, false)) {

    private var imgRest: ImageView? = null
    private var textRestTitle: TextView? = null
    private var textRestCategory: TextView? = null
    private var textRestPrice: TextView? = null
    private var textRestDescription: TextView? = null

    init {
        imgRest = itemView.findViewById(R.id.imgRest)
        textRestTitle = itemView.findViewById(R.id.textRestTitle)
        textRestCategory = itemView.findViewById(R.id.textRestCategory)
        textRestPrice = itemView.findViewById(R.id.textRestPrice)
        textRestDescription = itemView.findViewById(R.id.textRestDescription)
    }

    fun bind(rest: Rest) {
        textRestTitle?.text = rest.title
        textRestCategory?.text = rest.category
        textRestPrice?.text = rest.price
        textRestDescription?.text = rest.description
        imgRest?.setImageResource(rest.image)
    }
}