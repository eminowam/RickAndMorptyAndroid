package com.example.techtask1.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.techtask1.databinding.FragmentHomeScreenBinding
import com.example.techtask1.presentation.viewmodel.HomeScreenViewModel

class HomeScreenFragment : Fragment() {

    private val binding by lazy {
        FragmentHomeScreenBinding.inflate(layoutInflater)
    }

    private lateinit var viewModel: HomeScreenViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View=binding.root

}