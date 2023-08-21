package com.example.techtask1.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
<<<<<<< HEAD
import androidx.fragment.app.Fragment
import com.example.techtask1.databinding.FragmentHomeScreenBinding
=======
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.techtask1.databinding.FragmentHomeScreenBinding
import com.example.techtask1.presentation.adapter.CharacterAdapter
>>>>>>> ef715f8 (Initial commit)
import com.example.techtask1.presentation.viewmodel.HomeScreenViewModel

class HomeScreenFragment : Fragment() {

    private val binding by lazy {
        FragmentHomeScreenBinding.inflate(layoutInflater)
    }

<<<<<<< HEAD
    private lateinit var viewModel: HomeScreenViewModel
=======
    private val viewModel by lazy {
        ViewModelProvider(this)[HomeScreenViewModel::class.java]
    }

    private val characterAdapter by lazy {
        CharacterAdapter(this)
    }
>>>>>>> ef715f8 (Initial commit)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
<<<<<<< HEAD
    ): View=binding.root

}
=======
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

>>>>>>> ef715f8 (Initial commit)
