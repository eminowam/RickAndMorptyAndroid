package com.example.techtask1.presentation.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.techtask1.R
import com.example.techtask1.domain.models.Details
import com.squareup.picasso.Picasso

class CharacterViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val image = view.findViewById<ImageView>(R.id.image)
    private val title = view.findViewById<TextView>(R.id.title)
    private val status = view.findViewById<TextView>(R.id.status)
    private val species = view.findViewById<TextView>(R.id.species)

    fun bind(character: Details) {
        Picasso.get().load(character.image).into(image)
        title.text = character.name
        status.text = character.status
        species.text = character.species
    }
}