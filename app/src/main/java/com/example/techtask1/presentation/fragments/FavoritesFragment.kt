package com.example.techtask1.presentation.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.techtask1.databinding.FragmentFavoritesBinding
import com.example.techtask1.domain.models.Details
import com.example.techtask1.presentation.adapter.CharacterAdapter
import com.example.techtask1.presentation.adapter.CharacterSetOnClickListener
import com.example.techtask1.presentation.viewmodel.FavoritesViewModel

class FavoritesFragment : Fragment(), CharacterSetOnClickListener {

    private val binding by lazy {
        FragmentFavoritesBinding.inflate(layoutInflater)
    }

    private val viewModel by lazy {
        ViewModelProvider(this)[FavoritesViewModel::class.java]
    }

    private val storageMoviesAdapter by lazy {
        CharacterAdapter(
            itemType = CharacterAdapter.ITEM_STORAGE,
            listener= this  )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        observeRv()
        observeCharacter()
    }

    private fun observeRv() = with(binding) {
        storageRv.adapter = storageMoviesAdapter
    }

    private fun observeCharacter() = with(viewModel) {
        saveCharacter()
        character.observe(viewLifecycleOwner) {
            storageMoviesAdapter.character = it
        }
    }

    override fun goToCharacterDetails(characterId: Int) {
        findNavController().navigate(
            FavoritesFragmentDirections.actionFavoritesFragmentToDetailsFragment(characterId.toString())
        )
    }

    override fun saveCharacter(character: Details) {
    }
}