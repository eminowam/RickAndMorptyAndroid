package com.example.techtask1.presentation.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.techtask1.R
import com.example.techtask1.domain.models.Details
import com.example.techtask1.presentation.fragments.HomeScreenFragment

interface CharacterSetOnClickListener{

    fun goToCharacterDetails(characterId: Int)
}

class CharacterAdapter(private val listener: HomeScreenFragment) :
    RecyclerView.Adapter<CharacterViewHolder>(),CharacterSetOnClickListener {

    var character = emptyList<Details>()
        @SuppressLint("NotifyDataSetChanged")
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):CharacterViewHolder=
        CharacterViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        )


    override fun getItemCount(): Int=character.size

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        holder.bind(character[position])

        holder.itemView.setOnClickListener {
            listener.goToDetails(character[position].id)
        }
    }

    override fun goToCharacterDetails(characterId: Int) {

    }
}
