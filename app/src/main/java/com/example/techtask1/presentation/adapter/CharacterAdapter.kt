package com.example.techtask1.presentation.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.techtask1.R
import com.example.techtask1.domain.models.Details
import com.example.techtask1.presentation.fragments.FavoritesFragment
import com.example.techtask1.presentation.fragments.HomeScreenFragment

interface CharacterSetOnClickListener {

    fun goToCharacterDetails(characterId: Int)

    fun saveCharacter(character: Details)
}

class CharacterAdapter(
    private val itemType: Int,
    private val listener: CharacterSetOnClickListener
) : RecyclerView.Adapter<CharacterViewHolder>(){

    var character = emptyList<Details>()
        @SuppressLint("NotifyDataSetChanged")
        set(value) {
            field = value
            notifyDataSetChanged()
        }
    override fun getItemViewType(position: Int): Int {
        return if (itemType == ITEM_CHARACTER) {
            ITEM_CHARACTER
        } else ITEM_STORAGE
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        var layout = when (viewType) {
            ITEM_CHARACTER -> R.layout.item
            ITEM_STORAGE -> R.layout.item
            else -> throw java.lang.RuntimeException("Unknown View Type")
        }
        return CharacterViewHolder(
            LayoutInflater.from(parent.context).inflate(layout, parent, false)
        )
    }


    companion object {
        const val ITEM_CHARACTER = 0
        const val ITEM_STORAGE = 1
    }

    override fun getItemCount(): Int = character.size

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        holder.bind(character[position])

        holder.itemView.setOnClickListener {
            listener.goToCharacterDetails(character[position].id)
        }

        holder.itemView.setOnLongClickListener {
            listener.saveCharacter(character[position])
            true
        }
    }

}
