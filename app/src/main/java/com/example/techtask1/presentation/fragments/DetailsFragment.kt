package com.example.techtask1.presentation.fragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.techtask1.databinding.FragmentDetailsBinding
import com.example.techtask1.domain.models.Details
import com.example.techtask1.presentation.viewmodel.DetailsViewModel
import com.squareup.picasso.Picasso

class DetailsFragment : Fragment() {

    private val binding by lazy {
        FragmentDetailsBinding.inflate(layoutInflater)
    }


    private val viewModel by lazy {
        ViewModelProvider(this)[DetailsViewModel::class.java]
    }

    private val characterId: String by lazy {
        DetailsFragmentArgs.fromBundle(requireArguments()).id
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.characterDetails.observe(viewLifecycleOwner) { character ->
            Log.i("value", "${character.origin}")
            observeUi(character)
        }
        viewModel.characterDetails(characterId = characterId.toInt())
    }

    private fun observeUi(character: Details) = with(binding) {
        Picasso.get().load(character.image).into(backpath)
        name.text = character.name
        statusText.text = character.status
        speciesText.text = character.species
        typeText.text = character.type
        genderText.text = character.gender
        nameOrigin.text = character.origin.name
        urlOrigin.text = character.origin.url
        nameLocation.text = character.location.name
        urlLocation.text = character.location.url
        episode.text = character.episode.toString()
        url.text = character.url
        created.text = character.created
    }

    companion object {
        private const val CHARACTER_ID = "character_id"
        fun startIntentToDetailActivity(context: Context, characterId: Int): Intent =
            Intent(context, DetailsFragment::class.java).apply {
                bundleOf().apply { putExtra(CHARACTER_ID, characterId) }
            }
    }
}