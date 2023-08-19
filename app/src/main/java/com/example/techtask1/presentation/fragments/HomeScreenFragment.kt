package com.example.techtask1.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.techtask1.databinding.FragmentHomeScreenBinding
import com.example.techtask1.presentation.adapter.CharacterAdapter
import com.example.techtask1.presentation.viewmodel.HomeScreenViewModel

class HomeScreenFragment : Fragment() {

    private val binding by lazy {
        FragmentHomeScreenBinding.inflate(layoutInflater)
    }

    private val viewModel by lazy {
        ViewModelProvider(this)[HomeScreenViewModel::class.java]
    }

    private val characterAdapter by lazy {
        CharacterAdapter(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        observeViewModel()
        observeRv()
    }

    private fun observeViewModel() = with(viewModel){
        character.observe(viewLifecycleOwner){
            characterAdapter.character=it.results
        }
    }

    private fun observeRv()= with(binding){
        binding.homeScreenRv.adapter=characterAdapter
    }

    fun goToDetails(characterId:Int){
        findNavController().navigate(
            HomeScreenFragmentDirections.actionHomeScreenFragmentToDetailsFragment(characterId.toString())
        )
    }
}

