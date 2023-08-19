package com.example.techtask1.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.techtask1.data.RepositoryImpl
import com.example.techtask1.domain.models.Details
import com.example.techtask1.domain.repository.CharacterRepository
import com.example.techtask1.domain.usecase.GetDetailsUseCase
import kotlinx.coroutines.launch

class DetailsViewModel : ViewModel() {
    private val repository = RepositoryImpl()
    private val getDetailsUseCaseUseCase = GetDetailsUseCase(repository)

    private val _characterDetails: MutableLiveData<Details> = MutableLiveData()
    val characterDetails: LiveData<Details> get() = _characterDetails

    fun characterDetails(characterId: Int) = viewModelScope.launch {
        _characterDetails.value = getDetailsUseCaseUseCase.invoke(characterId = characterId)
    }

}